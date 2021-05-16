package ma.supmti.app.api.service;

import java.util.List;

import ma.supmti.app.api.entity.CandidatEntity;


public interface ICandidatService {

public List<CandidatEntity> getCandidat();
	
	public CandidatEntity addCandidat(CandidatEntity candidatEntity);
	
	public CandidatEntity findCandidatByUsername(String username);
}
