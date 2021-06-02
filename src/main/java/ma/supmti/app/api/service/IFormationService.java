package ma.supmti.app.api.service;

import java.util.List;

import ma.supmti.app.api.entity.FormationEntity;

public interface IFormationService {

	List<FormationEntity> getFormation();
	public FormationEntity addFormation(FormationEntity formationEntity);
	public void deleteFormation(Long id);
}
