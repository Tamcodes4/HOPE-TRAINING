package Day_17.Task.Com.Url_parser.model;

public class UrlData {
    String protocol;
    String host;
    String path;
    String query;

    public UrlData(String protocol, String host, String path, String query) {
        this.protocol = protocol;
        this.host = host;
        this.path = path;
        this.query = query;
    }

    public void display() {
        System.out.println("Protocol : " + protocol);
        System.out.println("Host : " + host);
        System.out.println("Path : " + path);
        System.out.println("Query : " + query);
    }
}