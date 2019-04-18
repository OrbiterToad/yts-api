package ch.wetwer.yts;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Wetwer
 * @project yts-api
 * @package ch.wetwer.yts
 * @created 17.04.2019
 */
public class WebHandler {

    /**
     * @returns the text contents on the website
     */
    public static String getContent(String url) {
        try {
            URLConnection con = new URL(url).openConnection();
            InputStream in = con.getInputStream();
            String encoding = con.getContentEncoding();
            encoding = encoding == null ? "UTF-8" : encoding;
            return IOUtils.toString(in, encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
