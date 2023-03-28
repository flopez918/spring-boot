package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Fernando");
        usuario.setApellido("Lopez");
        usuario.setEmail("flopez918@gmail.com");
        usuario.setTelefono("5555555");
        return usuario;
    }

    @RequestMapping(value = "usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {

        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "usuario2/")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Fernando");
        usuario.setApellido("Lopez");
        usuario.setEmail("flopez918@gmail.com");
        usuario.setTelefono("5555555");
        return usuario;
    }

    @RequestMapping(value = "usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Integer id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "usuario4/")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Fernando");
        usuario.setApellido("Lopez");
        usuario.setEmail("flopez918@gmail.com");
        usuario.setTelefono("5555555");
        return usuario;
    }
}

