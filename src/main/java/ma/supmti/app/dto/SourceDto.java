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
import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.entity.LangueEntity;
import ma.supmti.app.api.entity.NiveauEtudeEntity;
import ma.supmti.app.api.entity.ProjetEntity;
import ma.supmti.app.api.entity.SourceEntity;

@Data @AllArgsConstructor @NoArgsConstructor
public class SourceDto {

	private static final long serialVersionUID = 1L;
	
	private Long idSource;
	private String Source;
	private List<CandidatEntity> candidat = new ArrayList<>();
	
	public static SourceDto entityToDto(SourceEntity sourceEntity) {
		SourceDto sourceDto = null;
		if (sourceEntity != null) {
			sourceDto = new SourceDto();
			sourceDto.setIdSource(sourceEntity.getIdSource());
			sourceDto.setSource(sourceEntity.getSource());
			
		}
		return sourceDto;
	
	}
	public static SourceEntity dtoToEntity(SourceDto sourceDto) {
		SourceEntity sourceEntity = new SourceEntity();
		if (sourceDto != null) {
			sourceEntity.setIdSource(sourceDto.getIdSource());
			sourceEntity.setSource(sourceDto.getSource());
			
		}
		return sourceEntity;
	}
	

	public static List<SourceDto> entitiesToDtos(List<SourceEntity> listSourceEntity) {
		List<SourceDto> listSourceDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listSourceEntity)) {
			for (SourceEntity sourceEntity : listSourceEntity) {
				listSourceDto.add(entityToDto(sourceEntity));
			}
		}
		return listSourceDto;
	}
	
	public static List<SourceEntity> dtosToEntites(List<SourceDto> listSourceDto) {
		List<SourceEntity> listSourceEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listSourceDto)) {
			for (SourceDto sourceDto : listSourceDto) {
				listSourceEntity.add(dtoToEntity(sourceDto));
			}
		}
		return listSourceEntity;
	}
	
}
