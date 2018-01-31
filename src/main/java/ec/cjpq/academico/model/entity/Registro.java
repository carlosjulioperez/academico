package ec.cjpq.academico.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * Registro Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Registro.getAll", query="SELECT o FROM Registro o ORDER BY o.paralelo.descripcion")
})
public class Registro{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Getter @Setter
	private Integer id;

    @ManyToOne(fetch=FetchType.LAZY, optional=false) @Getter @Setter
    private Alumno alumno;
    
    @ManyToOne(fetch=FetchType.LAZY, optional=false) @Getter @Setter
    private Paralelo paralelo;
    
    @Getter @Setter
    private Date fechaRegistro;

    @Getter @Setter
    private Boolean estadoRegistro;

}

