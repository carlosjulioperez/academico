package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.Paralelo;

import org.apache.log4j.Logger;

/**
 * Paralelo Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class ParaleloDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(ParaleloDao.class);

    public List<Paralelo>getAll(){
        em.getTransaction().begin();
        List<Paralelo> result = em.createNamedQuery("Paralelo.getAll", Paralelo.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

