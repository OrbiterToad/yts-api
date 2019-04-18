package ch.wetwer.yts.model.listmovie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author Wetwer
 * @project yts-api
 * @package ch.wetwer.yts.model.listmovie
 * @created 18.04.2019
 **/

@Data
public class ListMovieResult {

    @SerializedName("status")
    @Expose
    public String status;

    @SerializedName("status_message")
    @Expose
    public String statusMessage;

    @SerializedName("data")
    @Expose
    public ListMoviesContent listMoviesContent;

}
