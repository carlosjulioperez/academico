package ec.cjpq.academico.model.dao;

import java.util.List;

import ec.cjpq.academico.model.entity.NivelAcademico;

import org.apache.log4j.Logger;

/**
 * NivelAcademico Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
public class NivelAcademicoDao extends EntityDao{
    
    final static Logger logger = Logger.getLogger(NivelAcademicoDao.class);

    public List<NivelAcademico>getAll(){
        em.getTransaction().begin();
        List<NivelAcademico> result = em.createNamedQuery("NivelAcademico.getAll", NivelAcademico.class).getResultList();
        em.getTransaction().commit();
        return result;
    }
}

