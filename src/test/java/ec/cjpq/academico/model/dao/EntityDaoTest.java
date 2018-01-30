package ec.cjpq.academico.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import ec.cjpq.academico.model.entity.Actividad;

/**
 * EntityDaoTest Unit test for simple App.
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 *
 * https://memorynotfound.com/unit-test-jpa-junit-in-memory-h2-database/
 * https://stackoverflow.com/questions/19848794/jpa-connection-closed-with-entitymanager
 * http://javanotepad.blogspot.com/2007/06/how-to-close-jpa-entitymanger-in-web.html
 *
 */
public class EntityDaoTest extends JPAHibernateTest{

    final static Logger logger = Logger.getLogger(EntityDaoTest.class);

    @Test
    public void testActividadGetAll(){
        for (Actividad o: new ActividadDao().getAll() ){
            System.out.println(o.getDescripcion());
        }
    }

}

