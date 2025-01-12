package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendationEngine {

    public List<Movie> recommendMovies(List<Movie> movies, User user) {
        List<Movie> movieRecommendations = new ArrayList<>();
        Map<Movie, Double> movieMap = new HashMap<Movie, Double>();

        for (Movie movie : movies) {
            Movie lowestScoreMovieInMap = null;
            double similarityScore = getSimilarityScore(movie, user);
            if (movieMap.keySet().size() < 3){
                movieMap.put(movie, similarityScore);
                if (similarityScore < movieMap.get(lowestScoreMovieInMap)){
                    lowestScoreMovieInMap = movie;
                }
                continue;
            }

            if (similarityScore > movieMap.get(lowestScoreMovieInMap)) {
                movieMap.remove(lowestScoreMovieInMap);
                movieMap.put(movie, similarityScore);
                lowestScoreMovieInMap = getLowestScoreMovie(movieMap);
                continue;
            }
        }

        return getRecommendationList(movieMap);

    }


    private double getSimilarityScore(Movie movie, User user){
        return 0;

    }

    private Movie getLowestScoreMovie(Map<Movie, Double> map) {
        return null;
    }

    private List<Movie> getRecommendationList(Map<Movie, Double> map) {

        return null;

    }

}
