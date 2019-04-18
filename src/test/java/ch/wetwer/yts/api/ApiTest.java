package ch.wetwer.yts.api;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

@SuppressWarnings({"ResultOfMethodCallIgnored", "ConstantConditions"})
public class ApiTest {

    @Test
    public void testLIST_MOVIES() {
        // Setup
        final String search = "movie";
        final String expectedResult = "https://yts.am/api/v2/list_movies.json?query_term=movie";

        // Run the test
        final String result = Api.LIST_MOVIES(search);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testLIST_MOVIES1() {
        // Setup
        final SortBy sortBy = null;

        // Run the test
        Api.LIST_MOVIES(sortBy);
    }

    @Test(expected = NullPointerException.class)
    public void testLIST_MOVIES2() {
        // Setup
        final String search = "search";
        final SortBy sortBy = null;

        // Run the test
        Api.LIST_MOVIES(search, sortBy);
    }

    @Test
    public void testMOVIE_DETAILS() {
        // Setup
        int id = new Random().nextInt();

        final String expectedResult = "https://yts.am/api/v2/movie_details.json?movie_id=" + id;

        // Run the test
        final String result = Api.MOVIE_DETAILS(id);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMOVIE_SUGGESTIONS() {
        // Setup
        int movieId = new Random().nextInt();

        final String expectedResult = "https://yts.am/api/v2/movie_suggestions.json?movie_id=" + movieId;

        // Run the test
        final String result = Api.MOVIE_SUGGESTIONS(movieId);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
