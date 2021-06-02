package ma.supmti.app.api.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.supmti.app.api.controller.DemandeController;
import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.entity.DemandeEntity;
import ma.supmti.app.api.repository.IDemandeRepository;
import ma.supmti.app.api.service.IDemandeService;

@Service
@Transactional
public class DemandeService implements IDemandeService {
	private static final Logger logger = LoggerFactory.getLogger(DemandeController.class);

	@Autowired
	private IDemandeRepository demandeRepository;

	@Override
	public List<DemandeEntity> getDemande() {
		List<DemandeEntity> candidat = null;
		try {
			candidat = demandeRepository.findAll();
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("Service certification error - get all candidat");
			}
		}
		return candidat;
	}

	@Override
	public CandidatEntity addDemande(DemandeEntity demandeEntity) {
		// TODO Auto-generated method stub
		return null;
	}
}
