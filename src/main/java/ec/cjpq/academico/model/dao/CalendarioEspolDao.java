package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.CalendarioEspol;

import org.apache.log4j.Logger;

/**
 * CalendarioEspol Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
public class CalendarioEspolDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(CalendarioEspolDao.class);

    public List<CalendarioEspol>getAll(){
        em.getTransaction().begin();
        List<CalendarioEspol> result = em.createNamedQuery("CalendarioEspol.getAll", CalendarioEspol.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

