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

import lombok.Getter;
import lombok.Setter;

/**
 * Paralelo Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Paralelo.getAll", query="SELECT o FROM Paralelo o ORDER BY o.descripcion")
})
public class Paralelo{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Getter @Setter
	private Integer id;

    @ManyToOne(fetch=FetchType.LAZY, optional=false) @Getter @Setter
    private CalendarioEspol calendarioEspol;
    
    @ManyToOne(fetch=FetchType.LAZY, optional=false) @Getter @Setter
    private Materia materia;
    
    @ManyToOne(fetch=FetchType.LAZY, optional=false) @Getter @Setter
    private Profesor profesor;
	
    @Column(length=100) @Getter @Setter
    private String descripcion;

    @Column(length=5) @Getter @Setter
    private String horaInicio;

	@Column(length=2) @Getter @Setter
    private Integer duracionHoras;
}
