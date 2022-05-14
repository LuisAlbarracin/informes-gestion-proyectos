package co.edu.ufps.ingsistemas.informesgestionproyectos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.ingsistemas.informesgestionproyectos.entities.Informe;

public interface IInformeRepositorio extends JpaRepository<Informe, Integer>{

}
