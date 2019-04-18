package ch.wetwer.yts;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("ConstantConditions")
public class WebHandlerTest {

    @Test
    public void testGetContent() {
        // Setup
        final String url = "https://www.w3.org/TR/PNG/iso_8859-1.txt";

        // Run the test
        final String result = WebHandler.getContent(url);

        // Verify the results
        assertTrue(result.startsWith("The following are the graphical"));
    }

}
