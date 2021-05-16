package ma.supmti.app.api.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.supmti.app.api.controller.CandidatController;
import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.repository.ICandidatRepository;
import ma.supmti.app.api.service.ICandidatService;
@Service
@Transactional
public class CandidatService implements ICandidatService {

	private static final Logger logger = LoggerFactory.getLogger(CandidatController.class);

	@Autowired
	private ICandidatRepository candidatRepository;

	@Override
	public List<CandidatEntity> getCandidat() {
		List<CandidatEntity> candidat = null;
		try {
			candidat = candidatRepository.findAll();
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("Service certification error - get all candidat");
			}
		}
		return candidat;
	}

	@Override
	public CandidatEntity addCandidat(CandidatEntity candidatEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CandidatEntity findCandidatByUsername(String username) {
		CandidatEntity user = null;
		try {
			user = candidatRepository.findUserByUsername(username);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
	}
	
	

}
