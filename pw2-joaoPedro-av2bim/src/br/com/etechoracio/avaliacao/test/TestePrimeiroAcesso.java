package br.com.etechoracio.avaliacao.test;

import br.com.etechoracio.avaliacao.models.Usuario;
import br.com.etechoracio.avaliacao.service.UsuarioService;

import java.util.ArrayList;
import java.util.List;

public class TestePrimeiroAcesso {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        UsuarioService usuarioservice = new UsuarioService(usuarios);


    }
}
