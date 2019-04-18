package ch.wetwer.yts;

import ch.wetwer.yts.api.SortBy;
import ch.wetwer.yts.model.Movie;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class YtsTest {

    @Test
    public void testListMovies() {
        // Setup
        final String search = "inception";

        // Run the test
        final List<Movie> result = Yts.listMovies(search);

        // Verify the results
        assertEquals("Inception", result.get(0).getTitle());
        assertEquals("tt1375666", result.get(0).getImdbCode());
    }


    @Test
    public void testListMovies2() {
        // Setup
        final String search = "chaplin";
        final SortBy sortBy = SortBy.DATE_ADDED;

        // Run the test
        final List<Movie> result = Yts.listMovies(search, sortBy);

        // Verify the results
        assertEquals("The Chaplin Revue", result.get(0).getTitle());
        assertEquals("tt0050243", result.get(0).getImdbCode());
    }

    @Test
    public void testMovieDetails() {
        // Setup
        final int movieId = 3488;

        // Run the test
        final Movie result = Yts.movieDetails(movieId);

        // Verify the results
        assertEquals("The Lord of the Rings: The Fellowship of the Ring", result.getTitle());
        assertEquals("tt0120737", result.getImdbCode());
    }

    @Test
    public void testMovieSuggestions() {
        // Setup
        final int movieId = 1606;

        // Run the test
        final List<Movie> result = Yts.movieSuggestions(movieId);

        // Verify the results
        assertEquals("Raw Force", result.get(0).getTitle());
        assertEquals("tt0084573", result.get(0).getImdbCode());
    }
}
