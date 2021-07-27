package sk.scout.api.scoutapi.repository;

import org.springframework.data.repository.CrudRepository;
import sk.scout.api.scoutapi.data.program.expert.Expert;

public interface ExpertRepository extends CrudRepository<Expert, Integer> {
}
