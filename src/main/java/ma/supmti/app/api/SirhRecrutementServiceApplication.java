package ma.supmti.app.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import ma.supmti.app.api.entity.AdresseEntity;
import ma.supmti.app.api.entity.CandidatEntity;
import ma.supmti.app.api.entity.DemandeEntity;
import ma.supmti.app.api.entity.FormationEntity;
import ma.supmti.app.api.entity.LangueEntity;
import ma.supmti.app.api.entity.SourceEntity;
import ma.supmti.app.api.repository.IAdresserepository;
import ma.supmti.app.api.repository.ICandidatRepository;
import ma.supmti.app.api.repository.ICompetenceRepository;
import ma.supmti.app.api.repository.IDemandeRepository;
import ma.supmti.app.api.repository.IFormationRepository;
import ma.supmti.app.api.repository.ILangueRepository;
import ma.supmti.app.api.repository.INiveauEtudeRepository;
import ma.supmti.app.api.repository.IProjetRepository;
import ma.supmti.app.api.repository.ISourceRepository;

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient 
public class SirhRecrutementServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SirhRecrutementServiceApplication.class, args);
	}
	@Autowired(required = true)
	private IFormationRepository formationRepository;
	
	@Autowired(required = true)
	private IDemandeRepository demandeRepository;
	
	@Autowired(required = true)
	private ICandidatRepository candidatRepository;
	
	@Autowired(required = true)
	private ILangueRepository langueRepository;
	
	@Autowired(required = true)
	private INiveauEtudeRepository niveauEtudeRepository;
	
	@Autowired(required = true)
	private IProjetRepository projetRepository;
	
	@Autowired(required = true)
	private IAdresserepository adresserepository;
	
	@Autowired(required = true)
	private ICompetenceRepository competenceRepository;
	
	@Autowired(required = true)
	private ISourceRepository sourceRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		  FormationEntity f1=new FormationEntity();
		  f1.setIdFormation(null);
		  f1.setNomFormation("JAVA");
		  
		  FormationEntity f2=new FormationEntity(); 
		  f2.setIdFormation(null);
		  f2.setNomFormation("Angular"); 
		  formationRepository.save(f1);
		  formationRepository.save(f2);
		  
		  LangueEntity l1=new LangueEntity();
		  
		  l1.setIdLangue(null);
		  l1.setLangue("Francais");
		  l1.setNiveau("Advance");
		  
		  LangueEntity l2=new LangueEntity();
		  l1.setIdLangue(null);
		  l1.setLangue("Anglais");
		  l1.setNiveau("Intermidiaire");
		 
		  langueRepository.save(l1);
		  langueRepository.save(l2);
		  
			
			  AdresseEntity a1=new AdresseEntity(); 
			  a1.setId_villes(null);
			  a1.setVille("rabat");
			  AdresseEntity a2=new AdresseEntity(); 
			  a2.setId_villes(null);
			  a2.setVille("casa");
			 adresserepository.save(a1);
			 adresserepository.save(a2);
		  
			 SourceEntity s1=new SourceEntity(); 
		  s1.setSource("LinkedIn");
		  
		  SourceEntity s2=new SourceEntity(); 
		  s2.setSource("Indeed");
		 sourceRepository.save(s1);
		 sourceRepository.save(s2);
		 
		CandidatEntity c1=new CandidatEntity();
		c1.setIdCandidat(null);
		c1.setAnneeExperience(new Date());
		c1.setDateCreation(new Date());
		c1.setDernierEmployeur("Taha");
		c1.setEmailPersonnel("taha@gmail.com");
		c1.setMoisExperience(new Date());
		c1.setUsername("admin");
		c1.setPassword(passwordEncoder.encode("admin"));
		c1.setNom("Alami");
		c1.setPrenom("taha");
		c1.setPreavis_unite("immédiate");
		c1.setNumeroCin("AB8789");
		c1.setPretentionSalariale("8000DH");
		c1.setTelephone("0678981676");
		c1.setVilles(c1);
		c1.setSource(c1);
		c1.setSalaire("7897DH");
		candidatRepository.save(c1);
		
		DemandeEntity d1=new DemandeEntity();
		d1.setIdDemande(null);
		d1.setDateCreation(new Date());
		d1.setDateDebutSouhaite(new Date());
		d1.setDeplacement("rabat");
		d1.setEtatDemande("urgent");
		d1.setNombreAnneExperience(new Date());
		d1.setNombreRessources("2");
		d1.setSeniorite("junior");
		demandeRepository.save(d1);
		
		DemandeEntity d2=new DemandeEntity();
		d2.setIdDemande(null);
		d2.setDateCreation(new Date());
		d2.setDateDebutSouhaite(new Date());
		d2.setDeplacement("casa");
		d2.setEtatDemande("immédiatement");
		d2.setNombreAnneExperience(new Date());
		d2.setNombreRessources("1");
		d2.setSeniorite("consultant");
		demandeRepository.save(d2);
		
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}	
 
	
	
}