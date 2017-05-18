package my.springboot.postgres.service.impl;

import my.springboot.postgres.model.Recommendation;
import my.springboot.postgres.repository.IRecommendationRepository;
import my.springboot.postgres.repository.IUserRepository;
import my.springboot.postgres.service.IRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gladivs on 18.05.2017.
 */
@Service
public class RecommendationServiceImpl implements IRecommendationService {
    @Autowired
    private IRecommendationRepository recommendationRepository;

    @Override
    public List<Recommendation> createUserRecommendations(Long userId, List<Recommendation> recommendations) {
        if(userId == null || recommendations == null || recommendations.size() == 0) {
            throw  new IllegalArgumentException("Illegal Arguments");
        }

        for(Recommendation recommendation : recommendations) {
            recommendation.setUserId(userId);
        }

        return (List<Recommendation>)recommendationRepository.save(recommendations);
    }
}
