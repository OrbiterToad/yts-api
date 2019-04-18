package ch.wetwer.yts.api;

/**
 * @author Wetwer
 * @project yts-api
 * @package ch.wetwer.yts
 * @created 17.04.2019
 **/
public class Api {

    public static String urlRoot = "https://yts.am/api/v2";


    // List Movies -> https://yts.am/api#list_movies

    public static String LIST_MOVIES(String search) {
        return urlRoot + "/list_movies.json?query_term=" + search;
    }

    public static String LIST_MOVIES(SortBy sortBy) {
        return urlRoot + "/list_movies.json?sort_by=" + sortBy.toString();
    }

    public static String LIST_MOVIES(String search, SortBy sortBy) {
        return urlRoot + "/list_movies.json?query_term=" + search + "&sort_by=" + sortBy.toString();
    }


    // Movie Details -> https://yts.am/api#movie_details

    public static String MOVIE_DETAILS(int movieId) {
        return urlRoot + "/movie_details.json?movie_id=" + movieId;
    }


    // Movie Suggestions -> https://yts.am/api#movie_suggestions

    public static String MOVIE_SUGGESTIONS(int movieId) {
        return urlRoot + "/movie_suggestions.json?movie_id=" + movieId;
    }
}
