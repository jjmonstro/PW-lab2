package br.com.etechoracio.avaliacao.test;

import br.com.etechoracio.avaliacao.models.Usuario;
import br.com.etechoracio.avaliacao.service.UsuarioService;

import java.util.ArrayList;
import java.util.List;

public class TesteBloqueioUsuario {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        UsuarioService usuarioservice = new UsuarioService(usuarios);

        //após 3 tentativa ele bloqueia, o código esta no método autenticar da classe Usuario

    }
}
