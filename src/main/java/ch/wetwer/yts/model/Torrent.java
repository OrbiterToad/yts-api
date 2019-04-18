package ch.wetwer.yts.model;

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
public class Torrent {

    @SerializedName("url")
    @Expose
    public String url;

    @SerializedName("hash")
    @Expose
    public String hash;

    @SerializedName("quality")
    @Expose
    public String quality;

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("seeds")
    @Expose
    public Integer seeds;
    @SerializedName("peers")
    @Expose
    public Integer peers;

    @SerializedName("size")
    @Expose
    public String size;

    @SerializedName("size_bytes")
    @Expose
    public Double sizeBytes;

    @SerializedName("date_uploaded")
    @Expose
    public String dateUploaded;

    @SerializedName("date_uploaded_unix")
    @Expose
    public Integer dateUploadedUnix;

}
