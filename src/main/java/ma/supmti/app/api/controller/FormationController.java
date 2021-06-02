package ma.supmti.app.api.controller;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.response.SirhResponse;
import ma.supmti.app.api.service.impl.FormationService;
import ma.supmti.app.dto.FormationDto;

@RestController
@RequestMapping("api/formation")
@CrossOrigin("*")
public class FormationController {
private static final Logger logger = LoggerFactory.getLogger(FormationController.class);
	
	@Autowired
	private FormationService formationService;
	
	@GetMapping(value = "/v0") 
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COLLABORATEUR')")
	public SirhResponse getFormation() {
		if (logger.isInfoEnabled()) {
			logger.info("get all formation");
		}
		return new SirhResponse(FormationDto.entitiesToDtos(formationService.getFormation()), HttpStatus.SC_OK);
	}
	@PostMapping(value = "/v0")
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('COLLABORATEUR')")
	public SirhResponse addFormation(@RequestBody FormationEntity formation) {
		if (logger.isInfoEnabled()) {
			logger.info("add ville");
		}
		System.out.print(formation.toString());
		return new SirhResponse(FormationDto.entityToDto(formationService.addFormation(formation)), HttpStatus.SC_OK);
	}
	@DeleteMapping(value = "v0/{id}")
	public SirhResponse deleteFormation(@PathVariable Long id) {
		if (logger.isInfoEnabled()) {
			logger.info("[ INFO - Formation Controller - delete formation ]");
		}

		formationService.deleteFormation((id));
		return new SirhResponse(id, HttpStatus.SC_OK);
	}	
}
