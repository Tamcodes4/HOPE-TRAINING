package DAY_17.task.com.Url_parser.parser;
import DAY_17.task.com.Url_parser.model.UrlData;
public class UrlParser {

    public UrlData parse(String url) {
        try {
            if (url == null || url.equals("")) {
                throw new Exception("url is empty");
            }

            String protocol = url.substring(0, url.indexOf("://"));
            String rest = url.substring(url.indexOf("://") + 3);

            String host = "";
            String path = "";
            String query = "";

            if (rest.contains("/")) {
                host = rest.substring(0, rest.indexOf("/"));
                rest = rest.substring(rest.indexOf("/"));

                if (rest.contains("?")) {
                    path = rest.substring(0, rest.indexOf("?"));
                    query = rest.substring(rest.indexOf("?") + 1);
                } else {
                    path = rest;
                }
            } else {
                host = rest;
            }

            return new UrlData(protocol, host, path, query);

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return null;
        }
    }
}
