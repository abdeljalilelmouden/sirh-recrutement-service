package ma.supmti.app.api.controller;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.supmti.app.api.response.SirhResponse;
import ma.supmti.app.api.service.impl.DemandeService;
import ma.supmti.app.dto.DemandeDto;

@RestController
@RequestMapping("api/demande")
@CrossOrigin("*")
public class DemandeController {
	private static final Logger logger = LoggerFactory.getLogger(CandidatController.class);
	@Autowired
	private DemandeService demandeService;
	
	@GetMapping(value = "/v0") 
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COLLABORATEUR')")
	public SirhResponse getCandidat() {
		if (logger.isInfoEnabled()) {
			logger.info("get all candidat");
		}
		return new SirhResponse(DemandeDto.entitiesToDtos(demandeService.getDemande()), HttpStatus.SC_OK);
	}
}
