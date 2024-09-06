import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Used to generate API queries from the OpenF1 API.
 */
public class ApiSearch {
  URL url = null;

  /**
   * Used to get the needed information from the provided request to the OpenF1 API
   * @param givenURL given URL to access
   * @return StringBuilder containing required information
   * @throws MalformedURLException if the url is invalid
   * @throws IllegalArgumentException if no output can be generated
   */
  public StringBuilder generateReference(String givenURL) {
    try {
      url = new URL(givenURL);
    } catch (MalformedURLException e) {
      throw new RuntimeException("The OpenF1 API has either changed or "
              + "no longer works");
    }

    InputStream in = null;
    StringBuilder output = new StringBuilder();

    try {
      in = url.openStream();
      int b;

      while ((b = in.read()) != -1) {
        output.append((char) b);
      }
    } catch (IOException e) {
      throw new IllegalArgumentException("No such data is available");
    }
    return output;
  }
}
