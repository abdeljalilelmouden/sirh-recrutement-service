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
public class FormationDto {

	private static final long serialVersionUID = 1L;
	
	private Long idFormation;
	private String nomFormation;
	private CandidatEntity candidat;
	
	public static FormationDto entityToDto(FormationEntity formationEntity) {
		FormationDto formationDto = null;
		if (formationEntity != null) {
			formationDto = new FormationDto();
			formationDto.setIdFormation(formationEntity.getIdFormation());
			formationDto.setNomFormation(formationEntity.getNomFormation());
			formationDto.setCandidat(formationEntity.getCandidat());
		}
		return formationDto;
	
	}
	public static FormationEntity dtoToEntity(FormationDto formationDto) {
		FormationEntity formationEntity = new FormationEntity();
		if (formationDto != null) {
			formationEntity.setIdFormation(formationDto.getIdFormation());
			formationEntity.setNomFormation(formationDto.getNomFormation());
			formationEntity.setCandidat(formationDto.getCandidat());
			
		}
		return formationEntity;
	}
	

	public static List<FormationDto> entitiesToDtos(List<FormationEntity> listFormationEntity) {
		List<FormationDto> listFormationDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listFormationEntity)) {
			for (FormationEntity formationEntity : listFormationEntity) {
				listFormationDto.add(entityToDto(formationEntity));
			}
		}
		return listFormationDto;
	}
	
	public static List<FormationEntity> dtosToEntites(List<FormationDto> listFormationDto) {
		List<FormationEntity> listFormationEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listFormationDto)) {
			for (FormationDto formationDto : listFormationDto) {
				listFormationEntity.add(dtoToEntity(formationDto));
			}
		}
		return listFormationEntity;
	}
}
