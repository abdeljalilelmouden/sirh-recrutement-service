package ma.supmti.app.api.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "competence")
public class CompetenceEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_competence", nullable = false)
	private Long idCompetence;
	@Column(name = "competence", nullable = false)	
	private String competence;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "competences")
	private List<DemandeEntity> demande = new ArrayList<>();
}
