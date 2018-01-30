package ec.cjpq.academico.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Entity Dao
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
public class EntityDao{

	protected EntityManager em;

    public EntityDao(){
		em = Persistence.createEntityManagerFactory("entityManager").createEntityManager();
    }

}
