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
import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.entity.LangueEntity;
import ma.supmti.app.api.entity.NiveauEtudeEntity;
import ma.supmti.app.api.entity.ProjetEntity;

@Data @AllArgsConstructor @NoArgsConstructor
public class LangueDto {
	private static final long serialVersionUID = 1L;
	
	private Long idLangue;
	private String langue;
	private String niveau;
	private CandidatEntity candidat;
	
	public static LangueDto entityToDto(LangueEntity langueEntity) {
		LangueDto langueDto = null;
		if (langueEntity != null) {
			langueDto = new LangueDto();
			langueDto.setIdLangue(langueEntity.getIdLangue());
			langueDto.setLangue(langueEntity.getLangue());
			langueDto.setNiveau(langueEntity.getNiveau());	
		}
		return langueDto;
	
	}
	public static LangueEntity dtoToEntity(LangueDto langueDto) {
		LangueEntity langueEntity = new LangueEntity();
		if (langueDto != null) {
			langueEntity.setIdLangue(langueDto.getIdLangue());
			langueEntity.setLangue(langueDto.getLangue());
			langueEntity.setNiveau(langueDto.getNiveau());
			
		}
		return langueEntity;
	}
	

	public static List<LangueDto> entitiesToDtos(List<LangueEntity> listLangueEntity) {
		List<LangueDto> listLangueDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listLangueEntity)) {
			for (LangueEntity langueEntity : listLangueEntity) {
				listLangueDto.add(entityToDto(langueEntity));
			}
		}
		return listLangueDto;
	}
	
	public static List<LangueEntity> dtosToEntites(List<LangueDto> listLangueDto) {
		List<LangueEntity> listLangueEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listLangueDto)) {
			for (LangueDto langueDto : listLangueDto) {
				listLangueEntity.add(dtoToEntity(langueDto));
			}
		}
		return listLangueEntity;
	}
	
}
