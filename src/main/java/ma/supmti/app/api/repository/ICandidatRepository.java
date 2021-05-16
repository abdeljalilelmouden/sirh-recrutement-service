package ma.supmti.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.supmti.app.api.entity.CandidatEntity;


@Repository
public interface ICandidatRepository extends JpaRepository<CandidatEntity, Long> {

	@Query("SELECT u FROM CollaborateurEntity u  WHERE u.username = :username")
	CandidatEntity findUserByUsername(@Param("username") String username);
}
