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
public class NiveauEtudeDto {

	private static final long serialVersionUID = 1L;
	
	private Long idNiveau;
	private String diplome;
	private String nomFormation;
	private CandidatEntity candidat;
	
	public static NiveauEtudeDto entityToDto(NiveauEtudeEntity niveauEtudeEntity) {
		NiveauEtudeDto niveauEtudeDto = null;
		if (niveauEtudeEntity != null) {
			niveauEtudeDto = new NiveauEtudeDto();
			niveauEtudeDto.setIdNiveau(niveauEtudeEntity.getIdNiveau());
			niveauEtudeDto.setDiplome(niveauEtudeEntity.getDiplome());
			niveauEtudeDto.setNomFormation(niveauEtudeEntity.getNomFormation());
		}
		return niveauEtudeDto;
	
	}
	public static NiveauEtudeEntity dtoToEntity(NiveauEtudeDto niveauEtudeDto) {
		NiveauEtudeEntity niveauEtudeEntity = new NiveauEtudeEntity();
		if (niveauEtudeDto != null) {
			niveauEtudeEntity.setIdNiveau(niveauEtudeDto.getIdNiveau());
			niveauEtudeEntity.setDiplome(niveauEtudeDto.getDiplome());
			niveauEtudeEntity.setNomFormation(niveauEtudeDto.getNomFormation());
		}
		return niveauEtudeEntity;
	}
	

	public static List<NiveauEtudeDto> entitiesToDtos(List<NiveauEtudeEntity> listNiveauEntity) {
		List<NiveauEtudeDto> listNiveauDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listNiveauEntity)) {
			for (NiveauEtudeEntity niveauEtudeEntity : listNiveauEntity) {
				listNiveauDto.add(entityToDto(niveauEtudeEntity));
			}
		}
		return listNiveauDto;
	}
	
	public static List<NiveauEtudeEntity> dtosToEntites(List<NiveauEtudeDto> listNiveauEtudeDto) {
		List<NiveauEtudeEntity> listEtudeEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listNiveauEtudeDto)) {
			for (NiveauEtudeDto niveauEtudeDto : listNiveauEtudeDto) {
				listEtudeEntity.add(dtoToEntity(niveauEtudeDto));
			}
		}
		return listEtudeEntity;
	
	}
	
}
