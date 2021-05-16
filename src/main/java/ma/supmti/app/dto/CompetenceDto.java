package ma.supmti.app.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class CompetenceDto {
	private static final long serialVersionUID = 1L;
	private Long idCompetence;
	private String competence;
	private List<DemandeEntity> demande = new ArrayList<>();
	
	public static CompetenceDto entityToDto(CompetenceEntity competenceEntity) {
		CompetenceDto competenceDto = null;
		if (competenceEntity != null) {
			competenceDto = new CompetenceDto();
			competenceDto.setIdCompetence(competenceEntity.getIdCompetence());
			competenceDto.setCompetence(competenceEntity.getCompetence());
			//competenceDto.setDemande(DemandeDto.entitiesToDtos(competenceEntity.getDemande()));
		}
		return competenceDto;
	
	}
	public static CompetenceEntity dtoToEntity(CompetenceDto competenceDto) {
		CompetenceEntity competenceEntity = new CompetenceEntity();
		if (competenceDto != null) {
			competenceEntity.setIdCompetence(competenceDto.getIdCompetence());
			competenceEntity.setCompetence(competenceDto.getCompetence());
			//competenceEntity.setDemande(DemandeDto.dtosToEntites(competenceDto.getDemande()));
		
		}
		return competenceEntity;
	}
	

	public static List<CompetenceDto> entitiesToDtos(List<CompetenceEntity> listCompetenceEntity) {
		List<CompetenceDto> listCompetenceDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listCompetenceEntity)) {
			for (CompetenceEntity competenceEntity : listCompetenceEntity) {
				listCompetenceDto.add(entityToDto(competenceEntity));
			}
		}
		return listCompetenceDto;
	}
	
	public static List<CompetenceEntity> dtosToEntites(List<CompetenceDto> listCompetenceDto) {
		List<CompetenceEntity> listCompetenceEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listCompetenceDto)) {
			for (CompetenceDto competenceDto : listCompetenceDto) {
				listCompetenceEntity.add(dtoToEntity(competenceDto));
			}
		}
		return listCompetenceEntity;
	}
	
	
}
