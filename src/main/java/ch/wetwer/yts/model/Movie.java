package ch.wetwer.yts.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author Wetwer
 * @project yts-api
 * @package ch.wetwer.yts.model.moviedetail
 * @created 18.04.2019
 **/

@Data
public class Movie {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("imdb_code")
    @Expose
    public String imdbCode;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("title_english")
    @Expose
    public String titleEnglish;
    @SerializedName("title_long")
    @Expose
    public String titleLong;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("year")
    @Expose
    public Integer year;
    @SerializedName("rating")
    @Expose
    public Double rating;
    @SerializedName("runtime")
    @Expose
    public Integer runtime;
    @SerializedName("genres")
    @Expose
    public List<String> genres = null;
    @SerializedName("download_count")
    @Expose
    public Integer downloadCount;
    @SerializedName("like_count")
    @Expose
    public Integer likeCount;
    @SerializedName("description_intro")
    @Expose
    public String descriptionIntro;
    @SerializedName("description_full")
    @Expose
    public String descriptionFull;
    @SerializedName("yt_trailer_code")
    @Expose
    public String ytTrailerCode;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("background_image")
    @Expose
    public String backgroundImage;
    @SerializedName("background_image_original")
    @Expose
    public String backgroundImageOriginal;
    @SerializedName("small_cover_image")
    @Expose
    public String smallCoverImage;
    @SerializedName("medium_cover_image")
    @Expose
    public String mediumCoverImage;
    @SerializedName("large_cover_image")
    @Expose
    public String largeCoverImage;
    @SerializedName("torrents")
    @Expose
    public List<Torrent> torrents = null;
    @SerializedName("date_uploaded")
    @Expose
    public String dateUploaded;
    @SerializedName("date_uploaded_unix")
    @Expose
    public Integer dateUploadedUnix;

}
