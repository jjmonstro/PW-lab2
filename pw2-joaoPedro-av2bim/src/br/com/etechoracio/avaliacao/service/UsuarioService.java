package br.com.etechoracio.avaliacao.service;

import br.com.etechoracio.avaliacao.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios;


    public UsuarioService(List<Usuario> usuarios) {
        usuarios.add(new Usuario("admin"));
        usuarios.add(new Usuario("TI"));
        usuarios.add(new Usuario("RH"));
    }

    public Usuario autenticar(String nome, String senha){
        if (nome == String.valueOf(usuarios.stream())){
           //
           //
        }
        return null;
    }

    public void alterarSenha(String nome, String senha, String novaSenha){
        if (nome == String.valueOf(usuarios.stream())){


        }
    }

    public void inativar(String nome){
        if (nome == String.valueOf(usuarios.stream())){


        }
    }

    public void bloquear(String nome){

    }

    public void exibirDados(String nome){
        if (nome == String.valueOf(usuarios.stream())){


        }
    }
}
