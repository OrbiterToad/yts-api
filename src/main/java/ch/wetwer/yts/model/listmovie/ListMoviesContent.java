package ch.wetwer.yts.model.listmovie;

import ch.wetwer.yts.model.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ListMoviesContent {

    @SerializedName("movie_count")
    @Expose
    public Integer movieCount;

    @SerializedName("limit")
    @Expose
    public Integer limit;

    @SerializedName("page_number")
    @Expose
    public Integer pageNumber;

    @SerializedName("movies")
    @Expose
    public List<Movie> movies = null;

}
