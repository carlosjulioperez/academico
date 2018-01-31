package ec.cjpq.academico.model.entity;

import ec.cjpq.academico.model.entity.NivelAcademico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.Setter;

/**
 * Profesor Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Profesor.getAll", query="SELECT o FROM Profesor o ORDER BY o.apellido, o.nombre")
})
public class Profesor{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Getter @Setter
	private Integer id;

	@Column(length=100) @Getter @Setter
    private String apellido;

	@Column(length=100) @Getter @Setter
    private String nombre;

    @ManyToOne(fetch=FetchType.LAZY, optional=false) @Getter @Setter
    private NivelAcademico nivelAcademico;

}

