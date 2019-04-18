package ch.wetwer.yts.model.moviedetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author Wetwer
 * @project yts-api
 * @package ch.wetwer.yts.model.moviedetail
 * @created 18.04.2019
 **/

@Data
public class MovieDetailResult {

    @SerializedName("status")
    @Expose
    public String status;

    @SerializedName("status_message")
    @Expose
    public String statusMessage;

    @SerializedName("data")
    @Expose
    public MovieDetailContent movieDetailContent;

}
