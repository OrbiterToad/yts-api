package ch.wetwer.yts.api;

/**
 * @author Wetwer
 * @project yts-api
 * @package ch.wetwer.yts
 * @created 17.04.2019
 **/
public enum SortBy {

    /**
     * A -> Z DESC
     */
    TITLE("title"),

    /**
     * Release year of movie DESC
     */
    YEAR("year"),

    /**
     * 10 -> 1 DESC
     */
    RATING("rating"),

    /**
     * Amount of people currently downloading DESC
     */
    PEERS("peers"),

    /**
     * Amount of people currently uploading DESC
     */
    SEEDS("seeds"),

    /**
     * Amount of torrent downloads DESC
     */
    DOWNLOAD_COUNT("download_count"),

    /**
     * Amount of people liked torrent DESC
     */
    LIKE_COUNT("like_count"),

    /**
     * Date of movie added to yts.am DESC
     */
    DATE_ADDED("date_added");

    private final String name;

    SortBy(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }


}
