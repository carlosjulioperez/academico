package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.Actividad;

import org.apache.log4j.Logger;

/**
 * Actividad Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
public class ActividadDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(ActividadDao.class);

    public List<Actividad>getAll(){
        em.getTransaction().begin();
        List<Actividad> result = em.createNamedQuery("Actividad.getAll", Actividad.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

