package ma.supmti.app.api.controller;

import java.security.Principal;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.response.SirhResponse;
import ma.supmti.app.api.service.impl.CandidatService;
import ma.supmti.app.dto.CandidatDto;
import ma.supmti.app.dto.FormationDto;

@RestController
@RequestMapping("api/candidat")
@CrossOrigin("*")
public class CandidatController {
private static final Logger logger = LoggerFactory.getLogger(CandidatController.class);
	
	@Autowired
	private CandidatService candidatService;
	
	@GetMapping(value = "/v0") 
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COLLABORATEUR')")
	public SirhResponse getCandidat() {
		if (logger.isInfoEnabled()) {
			logger.info("get all candidat");
		}
		return new SirhResponse(CandidatDto.entitiesToDtos(candidatService.getCandidat()), HttpStatus.SC_OK);
	}
	
	
	
	@GetMapping(value = "/profil")
	public CandidatEntity profile(Principal principal) {
		return candidatService.findCandidatByUsername(principal.getName());
	}

}
