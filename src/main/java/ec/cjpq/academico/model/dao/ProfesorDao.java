package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.Profesor;

import org.apache.log4j.Logger;

/**
 * Profesor Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
public class ProfesorDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(ProfesorDao.class);

    public List<Profesor>getAll(){
        em.getTransaction().begin();
        List<Profesor> result = em.createNamedQuery("Profesor.getAll", Profesor.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

