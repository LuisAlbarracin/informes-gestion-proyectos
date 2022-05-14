package co.edu.ufps.ingsistemas.informesgestionproyectos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.ingsistemas.informesgestionproyectos.entities.TipoUsuario;

@Repository
public interface ITipoUsuarioRepositorio extends JpaRepository<TipoUsuario, Integer> {

}
