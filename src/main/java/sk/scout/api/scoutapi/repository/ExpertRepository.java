package sk.scout.api.scoutapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.scout.api.scoutapi.data.program.expert.Expert;

public interface ExpertRepository extends JpaRepository<Expert, Integer> {
}
