package ch.wetwer.yts;

import ch.wetwer.yts.api.Api;
import ch.wetwer.yts.api.SortBy;
import ch.wetwer.yts.model.Movie;
import ch.wetwer.yts.model.Torrent;
import ch.wetwer.yts.model.listmovie.ListMovieResult;
import ch.wetwer.yts.model.moviedetail.MovieDetailResult;
import ch.wetwer.yts.model.moviesuggestion.MovieSuggestionResult;
import com.google.gson.Gson;

import java.util.List;

/**
 * @author Wetwer
 * @project yts-api
 * @package ch.wetwer.yts
 * @created 17.04.2019
 **/
public class Yts {

    public static List<Movie> listMovies(String search) {
        return new Gson().fromJson(
                getContent(Api.LIST_MOVIES(search)),
                ListMovieResult.class).getListMoviesContent().getMovies();
    }

    public static List<Movie> listMovies(String search, SortBy sortBy) {
        return new Gson().fromJson(getContent(Api.LIST_MOVIES(search, sortBy)), ListMovieResult.class).getListMoviesContent().getMovies();
    }

    public static Movie movieDetails(int movieId) {
        return new Gson().fromJson(
                getContent(Api.MOVIE_DETAILS(movieId)),
                MovieDetailResult.class).getMovieDetailContent().getMovie();
    }

    public static List<Movie> movieSuggestions(int movieId) {
        return new Gson().fromJson(
                getContent(Api.MOVIE_SUGGESTIONS(movieId)),
                MovieSuggestionResult.class).getMovieSuggestionContent().getMovies();
    }

    private static String getContent(String url) {
        return WebHandler.getContent(url);
    }

}
