package my.springboot.postgres.repository;

import my.springboot.postgres.model.Recommendation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gladivs on 18.05.2017.
 */
public interface IRecommendationRepository extends CrudRepository<Recommendation, Long> {
}
