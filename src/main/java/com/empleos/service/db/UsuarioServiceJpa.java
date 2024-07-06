package com.empleos.service.db;

import com.empleos.model.Usuario;
import com.empleos.repository.UsuariosRepository;
import com.empleos.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceJpa implements IUsuarioService {

    @Autowired
    public UsuariosRepository usuariosRepository;

    @Override
    public void guardar(Usuario usuario) {
        usuariosRepository.save(usuario);
    };

/*
    @Override
    public List<Usuario> guardar(Usuario usuario) {
        this.usuariosRepository.save(usuario);

        return null;
    }
*/



    @Override
    public void eliminar(Integer idUsuario) {
        usuariosRepository.deleteById(idUsuario);

    }

    @Override
    public List<Usuario> buscarTodos() {

        return usuariosRepository.findAll();
    }

    @Override
    public Usuario buscarPorUsername(String username) {

        return usuariosRepository.findByUsername(username);
    }
}
