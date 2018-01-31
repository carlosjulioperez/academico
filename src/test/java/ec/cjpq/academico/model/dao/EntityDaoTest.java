package ec.cjpq.academico.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import ec.cjpq.academico.model.entity.Actividad;
import ec.cjpq.academico.model.entity.Alumno;
import ec.cjpq.academico.model.entity.CalendarioEspol;
import ec.cjpq.academico.model.entity.Materia;
import ec.cjpq.academico.model.entity.NivelAcademico;
import ec.cjpq.academico.model.entity.Paralelo;
import ec.cjpq.academico.model.entity.Profesor;

/**
 * EntityDaoTest Unit test for simple App.
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30, 31
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

    @Test
    public void testAlumnoGetAll(){
        for (Alumno o: new AlumnoDao().getAll() ){
            System.out.println(o.getApellido() + " "+o.getNombre());
        }
    }

    @Test
    public void testCalendarioEspolGetAll(){
        for (CalendarioEspol o: new CalendarioEspolDao().getAll() ){
            System.out.println(o.getAnio() + " " + o.getSemestre() );
        }
    }

    @Test
    public void testMateriaGetAll(){
        for (Materia o: new MateriaDao().getAll() ){
            System.out.println(o.getDescripcion());
        }
    }

    @Test
    public void testNivelAcademicoGetAll(){
        for (NivelAcademico o: new NivelAcademicoDao().getAll() ){
            System.out.println(o.getDescripcion());
        }
    }

    @Test
    public void testParaleloGetAll(){
        for (Paralelo o: new ParaleloDao().getAll() ){
            System.out.println(o.getDescripcion());
        }
    }

    @Test
    public void testProfesorGetAll(){
        for (Profesor o: new ProfesorDao().getAll() ){
            System.out.println(o.getApellido() + " "+o.getNombre());
        }
    }

}

