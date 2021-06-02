package ma.supmti.app.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.util.CollectionUtils;

import ma.supmti.app.api.entity.AdresseEntity;
import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.entity.CompetenceEntity;
import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.entity.LangueEntity;
import ma.supmti.app.api.entity.NiveauEtudeEntity;
import ma.supmti.app.api.entity.ProjetEntity;

//@Data

public class CandidatDto {
	private static final long serialVersionUID = 1L;
	
	private Long idCandidat;
	private String username;
	private String password;
	private String nom;
	private String prenom;
	private String numeroCin;
	private String emailPersonnel;
	private String dernierEmployeur;
	private Date dateCreation;
	private Date anneeExperience;
	private Date moisExperience;
	private String pretentionSalariale;
	private String telephone;
	private String salaire;
	private String preavis_unite;
	
	
	private List<ProjetDto> projet = new ArrayList<>();
	
	private List<FormationDto> formations = new ArrayList<>();
	private List<LangueEntity> langues = new ArrayList<>();
	private CandidatEntity source;

	private List<NiveauEtudeDto> niveau = new ArrayList<>();
	
	private List<CompetenceEntity> competences = new ArrayList<>();
	private AdresseEntity ville;
	public static CandidatDto entityToDto(CandidatEntity candidatEntity) {
		CandidatDto candidatDto = null;
		if (candidatEntity != null) {
			candidatDto = new CandidatDto();
			candidatDto.setIdCandidat(candidatEntity.getIdCandidat());
			candidatDto.setUsername(candidatEntity.getUsername());
			candidatDto.setPassword(candidatEntity.getPassword());
			candidatDto.setNom(candidatEntity.getNom());
			candidatDto.setPrenom(candidatEntity.getPrenom());
			candidatDto.setNumeroCin(candidatEntity.getNumeroCin());
			candidatDto.setEmailPersonnel(candidatEntity.getEmailPersonnel());
			candidatDto.setDernierEmployeur(candidatEntity.getDernierEmployeur());
			candidatDto.setDateCreation(candidatEntity.getDateCreation());
			candidatDto.setAnneeExperience(candidatEntity.getAnneeExperience());
			candidatDto.setMoisExperience(candidatEntity.getMoisExperience());
			candidatDto.setPretentionSalariale(candidatEntity.getPretentionSalariale());
			candidatDto.setTelephone(candidatEntity.getTelephone());
			candidatDto.setSalaire(candidatEntity.getSalaire());
			candidatDto.setPreavis_unite(candidatEntity.getPreavis_unite());
			candidatDto.setProjet(ProjetDto.entitiesToDtos(candidatEntity.getProjet()));
			
			  candidatDto.setFormations(FormationDto.entitiesToDtos(candidatEntity.
			  getFormations()));
			  candidatDto.setLangues(LangueDto.entitiesToDtos(candidatEntity.getLangues()));
			  candidatDto.setNiveau(NiveauEtudeDto.entitiesToDtos(candidatEntity.getNiveau()));
			  //candidatDto.setAdresse(AdresseDto.entitiesToDtos(candidatEntity.getAdresse()));
			 
		}
		return candidatDto;
	}
	
	public static CandidatEntity dtoToEntity(CandidatDto candidatDto) {
		CandidatEntity candidatEntity = null;
		if (candidatDto != null) {
			candidatEntity = new CandidatEntity();
			candidatEntity.setIdCandidat(candidatDto.getIdCandidat());
			candidatEntity.setNom(candidatDto.getNom());
			candidatEntity.setPrenom(candidatDto.getPrenom());
			candidatEntity.setNumeroCin(candidatDto.getNumeroCin());
			candidatEntity.setEmailPersonnel(candidatDto.getEmailPersonnel());
			candidatEntity.setDernierEmployeur(candidatDto.getDernierEmployeur());
			candidatEntity.setDateCreation(candidatDto.getDateCreation());
			candidatEntity.setAnneeExperience(candidatDto.getAnneeExperience());
			candidatEntity.setMoisExperience(candidatDto.getMoisExperience());
			candidatEntity.setPretentionSalariale(candidatDto.getPretentionSalariale());
			candidatEntity.setTelephone(candidatDto.getTelephone());
			candidatEntity.setSalaire(candidatDto.getSalaire());
			candidatEntity.setPreavis_unite(candidatDto.getPreavis_unite());
			
			 
			  candidatEntity.setProjet(ProjetDto.dtosToEntites(candidatDto.getProjet()));
				
				  //candidatEntity.setFormations(FormationDto.dtosToEntites(candidatDto.getFormations()));
				  candidatEntity.setLangues(LangueDto.dtosToEntites(candidatDto.getLangues()));
				
			
		}
		return candidatEntity;
	}

	public static List<CandidatDto> entitiesToDtos(List<CandidatEntity> listCandidatEntity) {
		List<CandidatDto> listCandidatDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listCandidatEntity)) {
			for (CandidatEntity candidatEntity : listCandidatEntity) {
				listCandidatDto.add(entityToDto(candidatEntity));
			}
		}
		return listCandidatDto;
	}

	
	
	public static List<CandidatEntity> dtosToEntites(List<CandidatDto> listCandidatDto) {
		List<CandidatEntity> listCandidatEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listCandidatDto)) {
			for (CandidatDto candidatDto : listCandidatDto) {
				listCandidatEntity.add(dtoToEntity(candidatDto));
			}
		}
		return listCandidatEntity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdCandidat() {
		return idCandidat;
	}

	public void setIdCandidat(Long idCandidat) {
		this.idCandidat = idCandidat;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroCin() {
		return numeroCin;
	}

	public void setNumeroCin(String numeroCin) {
		this.numeroCin = numeroCin;
	}

	public String getEmailPersonnel() {
		return emailPersonnel;
	}

	public void setEmailPersonnel(String emailPersonnel) {
		this.emailPersonnel = emailPersonnel;
	}

	public String getDernierEmployeur() {
		return dernierEmployeur;
	}

	public void setDernierEmployeur(String dernierEmployeur) {
		this.dernierEmployeur = dernierEmployeur;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getAnneeExperience() {
		return anneeExperience;
	}

	public void setAnneeExperience(Date anneeExperience) {
		this.anneeExperience = anneeExperience;
	}

	public Date getMoisExperience() {
		return moisExperience;
	}

	public void setMoisExperience(Date moisExperience) {
		this.moisExperience = moisExperience;
	}

	public String getPretentionSalariale() {
		return pretentionSalariale;
	}

	public void setPretentionSalariale(String pretentionSalariale) {
		this.pretentionSalariale = pretentionSalariale;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	public String getPreavis_unite() {
		return preavis_unite;
	}

	public void setPreavis_unite(String preavis_unite) {
		this.preavis_unite = preavis_unite;
	}

	public List<ProjetDto> getProjet() {
		return 
				projet;
	}

	public void setProjet(List<ProjetDto> list) {
		this.projet = list;
	}

	public List<FormationDto> getFormations() {
		return formations;
	}

	public void setFormations(List<FormationDto> formations) {
		this.formations = formations;
	}

	public List<LangueEntity> getLangues() {
		return langues;
	}

	public void setLangues(List<LangueDto> list) {
		this.langues = langues;
	}

	public CandidatEntity getSource() {
		return source;
	}

	public void setSource(CandidatEntity source) {
		this.source = source;
	}

	public List<NiveauEtudeDto> getNiveau() {
		return niveau;
	}

	public void setNiveau(List<NiveauEtudeDto> list) {
		this.niveau = list;
	}

	public List<CompetenceEntity> getRoles() {
		return competences;
	}



	public AdresseEntity getVille() {
		return ville;
	}

	public void setVille(AdresseEntity ville) {
		this.ville = ville;
	}

	public List<CompetenceEntity> getCompetences() {
		return competences;
	}

	public void setCompetences(List<CompetenceEntity> competences) {
		this.competences = competences;
	}

	public CandidatDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidatDto(Long idCandidat, String username, String password, String nom, String prenom, String numeroCin,
			String emailPersonnel, String dernierEmployeur, Date dateCreation, Date anneeExperience,
			Date moisExperience, String pretentionSalariale, String telephone, String salaire, String preavis_unite,
			List<ProjetDto> projet, List<FormationDto> formations, List<LangueEntity> langues, CandidatEntity source,
			List<NiveauEtudeDto> niveau, List<CompetenceEntity> competences, AdresseEntity ville) {
		super();
		this.idCandidat = idCandidat;
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroCin = numeroCin;
		this.emailPersonnel = emailPersonnel;
		this.dernierEmployeur = dernierEmployeur;
		this.dateCreation = dateCreation;
		this.anneeExperience = anneeExperience;
		this.moisExperience = moisExperience;
		this.pretentionSalariale = pretentionSalariale;
		this.telephone = telephone;
		this.salaire = salaire;
		this.preavis_unite = preavis_unite;
		this.projet = projet;
		this.formations = formations;
		this.langues = langues;
		this.source = source;
		this.niveau = niveau;
		this.competences = competences;
		this.ville = ville;
	}


	
}
