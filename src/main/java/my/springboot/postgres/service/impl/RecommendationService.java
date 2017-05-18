package my.springboot.postgres.service.impl;

import my.springboot.postgres.model.Recommendation;
import my.springboot.postgres.repository.IRecommendationRepository;
import my.springboot.postgres.repository.IUserRepository;
import my.springboot.postgres.service.IRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gladivs on 18.05.2017.
 */
public class RecommendationService implements IRecommendationService {
    @Autowired
    private IRecommendationRepository recommendationRepository;

    //TODO : Make via CrudRepository.save<S extends T> Iterable<S> save(Iterable<S> var1);
    @Override
    public List<Recommendation> createUserRecommendations(Long userId, List<Recommendation> recommendations) {
        if(userId == null || recommendations == null || recommendations.size() == 0) {
            throw  new IllegalArgumentException("Illegal Arguments");
        }
        List<Recommendation> recommendationList = new ArrayList<>();
        for(Recommendation recommendation : recommendations) {
            recommendation.setUserId(userId);
            recommendationList.add(recommendationRepository.save(recommendation));
        }

        return recommendationList;
    }
}
