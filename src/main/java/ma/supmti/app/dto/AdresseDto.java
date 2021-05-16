package ma.supmti.app.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.supmti.app.api.entity.AdresseEntity;

@Data @AllArgsConstructor @NoArgsConstructor

public class AdresseDto {
	private static final long serialVersionUID = 1L;
	
	private Long id_adresse;

	private String ville;
	public static AdresseDto entityToDto(AdresseEntity adresseEntity) {
		AdresseDto adresseDto = null;
		if (adresseEntity != null) {
			adresseDto = new AdresseDto();
			adresseDto.setId_adresse(adresseEntity.getId_adresse());
			adresseDto.setVille(adresseEntity.getVille());
		}
		return adresseDto;
	}

	public static AdresseEntity dtoToEntity(AdresseDto adresseDto) {
		AdresseEntity adresseEntity = new AdresseEntity();
		if (adresseDto != null) {
			adresseEntity.setId_adresse(adresseDto.getId_adresse());
			adresseEntity.setVille(adresseDto.getVille());
		}
		return adresseEntity;
	}
	

	public static List<AdresseDto> entitiesToDtos(List<AdresseEntity> listAdresseEntity) {
		List<AdresseDto> listAdresseDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listAdresseEntity)) {
			for (AdresseEntity adresseEntity : listAdresseEntity) {
				listAdresseDto.add(entityToDto(adresseEntity));
			}
		}
		return listAdresseDto;
	}
	
	public static List<AdresseEntity> dtosToEntites(List<AdresseDto> lisAdresseDto) {
		List<AdresseEntity> lisAdresseEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(lisAdresseDto)) {
			for (AdresseDto adresseDto : lisAdresseDto) {
				lisAdresseEntity.add(dtoToEntity(adresseDto));
			}
		}
		return lisAdresseEntity;
	}
}
