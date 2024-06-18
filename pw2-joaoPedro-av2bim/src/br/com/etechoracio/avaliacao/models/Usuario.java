package br.com.etechoracio.avaliacao.models;

import br.com.etechoracio.avaliacao.enums.StatusUsuarioEnum;
import br.com.etechoracio.avaliacao.exception.CredenciaisInvalidasException;
import br.com.etechoracio.avaliacao.exception.PrimeiroAcessoException;

import java.time.LocalDateTime;

public class Usuario {
    private String nome;
    private String senha;
    private int tentativasAcesso;
    private boolean primeiroAcesso;
    private StatusUsuarioEnum status;
    private LocalDateTime dataInativacao;

    public Usuario(String nome) {
        this.nome = nome;
        this.senha = "etec#123";
        this.primeiroAcesso = true;
        this.status = StatusUsuarioEnum.ATIVO;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        if (status == StatusUsuarioEnum.ATIVO) {
            this.senha = senha;
            this.primeiroAcesso = false;
            this.tentativasAcesso = 0;
            this.dataInativacao = null;
        }
    }

    public void inativar() {
        this.primeiroAcesso = false;
        this.status = StatusUsuarioEnum.INATIVO;
        this.tentativasAcesso = 0;
        this.dataInativacao = LocalDateTime.now();
    }

    public void desbloquear() {
        this.primeiroAcesso = true;
        this.status = StatusUsuarioEnum.ATIVO;

    }

    public void autenticar(String senha) {
        if (this.status == StatusUsuarioEnum.INATIVO || this.status == StatusUsuarioEnum.BLOQUEADO) {
            System.out.println("Acesso Negado");
        } else if (this.tentativasAcesso >= 3) {
            this.status = StatusUsuarioEnum.BLOQUEADO;
            throw (new CredenciaisInvalidasException("Acesso Negado"));
//            System.out.println("Acesso Negado");
        } else if (!this.senha.equals(senha)) {
            this.tentativasAcesso++;
            //após 3 tentativas ele bloqueia
            if (this.tentativasAcesso==3){
                this.status = StatusUsuarioEnum.BLOQUEADO;
                exibir();
            }
            throw (new CredenciaisInvalidasException("Usuário/senha inválidos"));
//            System.out.println("Usuário/senha inválidos");
        } else if (this.primeiroAcesso) {
            throw (new PrimeiroAcessoException());
//            System.out.println("Necessário trocar senha");
        } else {
            this.tentativasAcesso = 0;
            System.out.println("Acesso liberado");
        }
    }

    public void exibir() {
        System.out.println("---------------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Tentativas de Acesso: " + tentativasAcesso);
        System.out.println("Primeiro Acesso: " + primeiroAcesso);
        System.out.println("Status: " + status);
        System.out.println("Data de inativação: " + dataInativacao);
        System.out.println("---------------------------------------------------");
    }

}
