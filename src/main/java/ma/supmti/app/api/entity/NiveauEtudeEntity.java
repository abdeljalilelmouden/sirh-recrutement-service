package ma.supmti.app.api.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "niveauEtude")
public class NiveauEtudeEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_niveau", nullable = false)
	private Long idNiveau;
	
	@Column(name = "diplome", nullable = false)
	private String diplome;
	
	@Column(name = "nomFormation", nullable = false)
	private String nomFormation;

	@ManyToOne
	@JoinColumn(name = "id_candidat")
	private CandidatEntity candidat;
}
