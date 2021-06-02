package ma.supmti.app.api.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.supmti.app.api.controller.CandidatController;
import ma.supmti.app.api.controller.FormationController;
import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.repository.IFormationRepository;
import ma.supmti.app.api.service.IFormationService;

@Service
@Transactional
public class FormationService implements IFormationService {

	private static final Logger logger = LoggerFactory.getLogger(FormationController.class);

	@Autowired
	private IFormationRepository formationRepository;

	@Override
	public List<FormationEntity> getFormation() {
		List<FormationEntity> formation = null;
		try {
			formation = formationRepository.findAll();
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("Service certification error - get all candidat");
			}
		}
		return formation;
	

}

	@Override
	public FormationEntity addFormation(FormationEntity formationEntity) {
		FormationEntity formation = null;
		try {
			formationEntity = formationRepository.save(formationEntity);
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("Service collaborateur error - add ville");
			}
		}
		return formationEntity;
	}

	@Override
	public void deleteFormation(Long id) {
		try {
			formationRepository.deleteById(id);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		if(logger.isInfoEnabled()) {
			logger.info("[ DELETE FORMATION FOR ENTITY FormationEntity ]");
		}
	
		
	}
	}
