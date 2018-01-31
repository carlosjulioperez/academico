package ec.cjpq.academico.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.Setter;

/**
 * NivelAcademico Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
@Entity
@NamedQueries({
    @NamedQuery(name="NivelAcademico.getAll", query="SELECT o FROM NivelAcademico o ORDER BY o.descripcion")
})
public class NivelAcademico{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Getter @Setter
	private Integer id;

	@Column(length=100) @Getter @Setter
    private String descripcion;

}

