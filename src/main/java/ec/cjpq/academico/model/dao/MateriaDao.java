package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.Materia;

import org.apache.log4j.Logger;

/**
 * Materia Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
public class MateriaDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(MateriaDao.class);

    public List<Materia>getAll(){
        em.getTransaction().begin();
        List<Materia> result = em.createNamedQuery("Materia.getAll", Materia.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

