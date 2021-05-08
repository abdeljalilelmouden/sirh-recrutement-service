package ma.supmti.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supmti.app.api.entity.NiveauEtudeEntity;

@Repository
public interface INiveauEtudeRepository extends JpaRepository<NiveauEtudeEntity, Long> {

}
