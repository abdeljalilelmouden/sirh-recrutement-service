package ma.supmti.app.api.service;

import java.util.List;

import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.entity.DemandeEntity;

public interface IDemandeService {
public List<DemandeEntity> getDemande();
	
	public CandidatEntity addDemande(DemandeEntity demandeEntity);
}
