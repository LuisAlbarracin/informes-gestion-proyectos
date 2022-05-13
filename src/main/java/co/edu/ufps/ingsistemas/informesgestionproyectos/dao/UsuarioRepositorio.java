package co.edu.ufps.ingsistemas.informesgestionproyectos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.ingsistemas.informesgestionproyectos.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
