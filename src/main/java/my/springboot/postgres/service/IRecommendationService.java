package my.springboot.postgres.service;

import my.springboot.postgres.model.Recommendation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by gladivs on 18.05.2017.
 */
public interface IRecommendationService {
    List<Recommendation> createUserRecommendations(Long userId, List<Recommendation> recommendations);
}
