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
 * CalendarioEspol Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-30
 */
@Entity
@NamedQueries({
    @NamedQuery(name="CalendarioEspol.getAll", query="SELECT o FROM CalendarioEspol o ORDER BY o.anio, o.semestre")
})
public class CalendarioEspol{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Getter @Setter
	private Integer id;

	@Column(length=4, columnDefinition="Integer default '2018'" ) @Getter @Setter
    private Integer anio;

	@Column(length=1) @Getter @Setter
    private Integer semestre;

    @Getter @Setter
    private Date fechaInicioVigencia;

    @Getter @Setter
    private Date fechaFinalVigencia;

    @ManyToOne(fetch=FetchType.LAZY, optional=false) @Getter @Setter
    private Actividad actividad;
}

