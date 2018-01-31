package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.Registro;

import org.apache.log4j.Logger;

/**
 * Registro Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class RegistroDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(RegistroDao.class);

    public List<Registro>getAll(){
        em.getTransaction().begin();
        List<Registro> result = em.createNamedQuery("Registro.getAll", Registro.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

