package ch.wetwer.yts.model.moviesuggestion;

import ch.wetwer.yts.model.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class MovieSuggestionContent {

    @SerializedName("movie_count")
    @Expose
    public Integer movieCount;

    @SerializedName("movies")
    @Expose
    public List<Movie> movies = null;

}
