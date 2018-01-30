package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.Alumno;

import org.apache.log4j.Logger;

/**
 * Alumno Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
public class AlumnoDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(AlumnoDao.class);

    public List<Alumno>getAll(){
        em.getTransaction().begin();
        List<Alumno> result = em.createNamedQuery("Alumno.getAll", Alumno.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

