package ma.supmti.app.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "candidat")
public class CandidatEntity implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_candidat", nullable = false)
	private Long idCandidat;
	
	@Column(name = "username", nullable = false, length = 255)
	private String username;

	@Column(name = "password", nullable = false, length = 255)
	private String password;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "prenom", nullable = false)
	private String prenom;
	
	@Column(name = "numero_cin", nullable = false)
	private String numeroCin;
	
	@Column(name = "email_personnel", nullable = false)
	private String emailPersonnel;
	
	@Column(name = "dernier_employeur", nullable = false)
	private String dernierEmployeur;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_creation")
	private Date dateCreation;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "annee_experience")
	private Date anneeExperience;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "mois_experience")
	private Date moisExperience;
	
	@Column(name = "pretention_salariale", nullable = false)
	private String pretentionSalariale;
	
	@Column(name = "telephone", nullable = false)
	private String telephone;
	
	@Column(name = "salaire", nullable = false)
	private String salaire;
	
	@Column(name = "preavisUnite", nullable = false)
	private String preavis_unite;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "candidat")
	private List<ProjetEntity> projet = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "candidat")
	private List<FormationEntity> formations = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "candidat")
	private List<LangueEntity> langues = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "id_source")
	private CandidatEntity source;


	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "candidat")
	private List<NiveauEtudeEntity> niveau = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "possede", joinColumns = @JoinColumn(name = "idcandidat"), inverseJoinColumns = @JoinColumn(name = "idCompetence"))
	private List<CompetenceEntity> roles = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "idAdresse")
	private AdresseEntity adresse;

	
}
