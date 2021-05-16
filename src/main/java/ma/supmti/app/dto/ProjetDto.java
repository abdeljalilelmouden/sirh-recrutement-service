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
import ma.supmti.app.api.entity.SourceEntity;

@Data @AllArgsConstructor @NoArgsConstructor
public class ProjetDto {
	private static final long serialVersionUID = 1L;
	
	private Long idProjet;
	private String description;
	private String nom;
	private CandidatEntity candidat;

	public static ProjetDto entityToDto(ProjetEntity projetEntity) {
		ProjetDto projetDto = null;
		if (projetEntity != null) {
			projetDto = new ProjetDto();
			projetDto.setIdProjet(projetEntity.getIdProjet());
			projetDto.setDescription(projetEntity.getDescription());
			projetDto.setNom(projetEntity.getNom());
		}
		return projetDto;
	
	}
	public static ProjetEntity dtoToEntity(ProjetDto projetDto) {
		ProjetEntity projetEntity = new ProjetEntity();
		if (projetEntity != null) {
			projetEntity.setIdProjet(projetDto.getIdProjet());
			projetEntity.setNom(projetDto.getNom());
			projetEntity.setDescription(projetDto.getDescription());
		}
		return projetEntity;
	}
	

	public static List<ProjetDto> entitiesToDtos(List<ProjetEntity> listProjetEntity) {
		List<ProjetDto> listProjetDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listProjetEntity)) {
			for (ProjetEntity projetEntity  : listProjetEntity) {
				listProjetDto.add(entityToDto(projetEntity));
			}
		}
		return listProjetDto;
	}
	
	public static List<ProjetEntity> dtosToEntites(List<ProjetDto> listProjetDto) {
		List<ProjetEntity> listProjetEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listProjetDto)) {
			for (ProjetDto projetDto : listProjetDto) {
				listProjetEntity.add(dtoToEntity(projetDto));
			}
		}
		return listProjetEntity;
	}



}
