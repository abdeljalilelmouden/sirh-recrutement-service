package ma.supmti.app.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.util.CollectionUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.supmti.app.api.entity.AdresseEntity;
import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.entity.CompetenceEntity;
import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.entity.LangueEntity;
import ma.supmti.app.api.entity.NiveauEtudeEntity;
import ma.supmti.app.api.entity.ProjetEntity;

@Data @AllArgsConstructor @NoArgsConstructor
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
	
	
	private List<ProjetEntity> projet = new ArrayList<>();
	
	private List<FormationEntity> formations = new ArrayList<>();
	private List<LangueEntity> langues = new ArrayList<>();
	private CandidatEntity source;

	private List<NiveauEtudeEntity> niveau = new ArrayList<>();
	
	private List<CompetenceEntity> roles = new ArrayList<>();
	private AdresseEntity adresse;
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
			candidatDto.setFormationDto(FormationDto.entitiesToDtos(candidatEntity.getFormations()));
			candidatDto.setLangues(LangueDto.entitiesToDtos(candidatEntity.getLangues()));
			candidatDto.setNiveau(NiveauEtudeDto.entitiesToDtos(candidatEntity.getNiveau()));
			candidatDto.setAdresse(AdresseDto.entitiesToDtos(candidatEntity.getAdresse()));
			candidatDto.setRoles(RoleDto.entitiesToDtos(candidatEntity.getRoles()));
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
			candidatEntity.setFormations(FormationDto.dtosToEntites(candidatDto.getFormationDto()));
			candidatEntity.setProjet(ProjetDto.dtosToEntites(candidatDto.getProjet()()));
			candidatEntity.setLangues(LangueDto.dtosToEntites(candidatDto.getLangues()));
			candidatEntity.setNiveau(NiveauEtudeDto.dtosToEntites(candidatDto.getNiveau()()));
			candidatEntity.setAdresse(AdresseDto.dtosToEntites(candidatDto.getAdresse()()));
			candidatEntity.setRoles(RoleDto.dtosToEntites(candidatDto.getRoles()()));
			
		}
		return candidatEntity;
	}

	public static List<CandidatDto> entitiesToDtos(List<CandidatEntity> listCandidatEntity) {
		List<CandidatDto> listCandidatDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listCandidatEntity)) {
			for (CandidatEntity listCandidatEntity : listCandidatEntity) {
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
}
