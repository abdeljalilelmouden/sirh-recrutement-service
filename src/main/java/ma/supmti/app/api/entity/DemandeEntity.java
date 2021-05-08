package ma.supmti.app.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "demande")
public class DemandeEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_demande", nullable = false)
	private Long idDemande;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_debut_souhaite")
	private Date dateDebutSouhaite;
	
	@Column(name = "deplacement", nullable = false)
	private String deplacement;
	
	@Column(name = "seniorite", nullable = false)
	private String seniorite;

	@Temporal(TemporalType.DATE)
	@Column(name = "nombre_annee_experience", nullable = false)
	private Date nombreAnneExperience;
	
	@Column(name = "nombre_ressources", nullable = false)
	private String nombreRessources;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_creation")
	private Date dateCreation;
	
	@Column(name = "etat_demande", nullable = false)
	private String etatDemande;

	@ManyToOne
	@JoinColumn(name = "id_competence")
	private CompetenceEntity competences;
}
