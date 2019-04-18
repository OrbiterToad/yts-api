package ch.wetwer.yts.model.moviedetail;

import ch.wetwer.yts.model.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class MovieDetailContent {

    @SerializedName("movie")
    @Expose
    public Movie movie;

}
