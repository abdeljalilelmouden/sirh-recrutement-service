package ma.supmti.app.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.util.CollectionUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.supmti.app.api.entity.AdresseEntity;
import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.entity.CompetenceEntity;
import ma.supmti.app.api.entity.DemandeEntity;
import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.entity.LangueEntity;
import ma.supmti.app.api.entity.NiveauEtudeEntity;
import ma.supmti.app.api.entity.ProjetEntity;

@Data @AllArgsConstructor @NoArgsConstructor
public class DemandeDto {

	private static final long serialVersionUID = 1L;
	
	private Long idDemande;
	private Date dateDebutSouhaite;
	private String deplacement;
	private String seniorite;
	private Date nombreAnneExperience;
	private String nombreRessources;
	private Date dateCreation;
	private String etatDemande;
	private CompetenceEntity competences;
	
	public static DemandeDto entityToDto(DemandeEntity demandeEntity) {
		DemandeDto demandeDto = null;
		if (demandeEntity != null) {
			demandeDto = new DemandeDto();
			demandeDto.setIdDemande(demandeEntity.getIdDemande());
			demandeDto.setDateDebutSouhaite(demandeEntity.getDateDebutSouhaite());
			demandeDto.setDeplacement(demandeEntity.getDeplacement());
			demandeDto.setSeniorite(demandeEntity.getSeniorite());
			demandeDto.setNombreAnneExperience(demandeEntity.getNombreAnneExperience());
			demandeDto.setNombreRessources(demandeEntity.getNombreRessources());
			demandeDto.setDateCreation(demandeEntity.getDateCreation());
			demandeDto.setEtatDemande(demandeEntity.getEtatDemande());
		}
		return demandeDto;
	
	}
	public static DemandeEntity dtoToEntity(DemandeDto demandeDto) {
		DemandeEntity demandeEntity = new DemandeEntity();
		if (demandeDto != null) {
			demandeEntity.setIdDemande(demandeDto.getIdDemande());
			demandeEntity.setDateDebutSouhaite(demandeDto.getDateDebutSouhaite());
			demandeEntity.setDeplacement(demandeDto.getDeplacement());
			demandeEntity.setSeniorite(demandeDto.getSeniorite());
			demandeEntity.setNombreAnneExperience(demandeDto.getNombreAnneExperience());
			demandeEntity.setNombreRessources(demandeDto.getNombreRessources());
			demandeEntity.setDateCreation(demandeDto.getDateCreation());
			demandeEntity.setEtatDemande(demandeDto.getEtatDemande());
			
		}
		return demandeEntity;
	}
	

	public static List<DemandeDto> entitiesToDtos(List<DemandeEntity> listDemandeEntity) {
		List<DemandeDto> listDemandeDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listDemandeEntity)) {
			for (DemandeEntity demandeEntity : listDemandeEntity) {
				listDemandeDto.add(entityToDto(demandeEntity));
			}
		}
		return listDemandeDto;
	}
	
	public static List<DemandeEntity> dtosToEntites(List<DemandeDto> listDemandeDto) {
		List<DemandeEntity> listDemandeEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listDemandeDto)) {
			for (DemandeDto demandeDto : listDemandeDto) {
				listDemandeEntity.add(dtoToEntity(demandeDto));
			}
		}
		return listDemandeEntity;
	}
	
}
