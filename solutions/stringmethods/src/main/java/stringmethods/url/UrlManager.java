package stringmethods.url;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocolFromUrl(url);
        this.host = getHostFromUrl(url);
        this.port = getPortFromUrl(url);
        this.path = getPathFromUrl(url);
        this.query = getQueryFromUrl(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }

    public String getProperty(String key) {
        String[] properties = query.split("&");
        for (String str : properties) {
            String[] prop = str.split("=");
            if (prop[0].equals(key)) {
                return prop[1];
            }
        }
        return null;
    }

    private String getProtocolFromUrl(String url) {
        int endIndex = url.indexOf("://");
        return url.substring(0, endIndex).toLowerCase();
    }

    private String getHostFromUrl(String url) {
        String host;
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf(":", startIndex);
        if (endIndex == -1) {
            endIndex = url.indexOf("/", startIndex);
        }
        if (endIndex == -1) {
            host = url.substring(startIndex).toLowerCase();
        } else {
            host = url.substring(startIndex, endIndex).toLowerCase();
        }
        return host;
    }

    private Integer getPortFromUrl(String url) {
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf(":", startIndex);
        if (startIndex == -1) {
            return null;
        }
        int endIndex = url.indexOf("/", startIndex);
        if (endIndex == -1) {
            return Integer.valueOf(url.substring(startIndex + 1));
        }
        return Integer.valueOf(url.substring(startIndex + 1, endIndex));
    }

    private String getPathFromUrl(String url) {
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf("/", startIndex);
        if (startIndex == -1) {
            return "";
        }
        int endIndex = url.indexOf("?");
        if (endIndex == -1) {
            return url.substring(startIndex);
        }
        return url.substring(startIndex, endIndex);
    }

    private String getQueryFromUrl(String url) {
        int startIndex = url.indexOf("?");
        if (startIndex == -1) {
            return "";
        }
        return url.substring(startIndex + 1);
    }

    public static void main(String[] args) {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(url);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getPort());

        String urlWithPortAtEnd = "HTTPS://EarthQuake.USgs.gov:80";
        urlManager = new UrlManager(urlWithPortAtEnd);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getPort());

        String urlWithPort = "HTTPS://EarthQuake.USgs.gov:80/query?a=4";
        urlManager = new UrlManager(urlWithPort);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getPort());

        String urlWithProperty = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        urlManager = new UrlManager(urlWithProperty);

        System.out.println(urlManager.hasProperty("format"));
        System.out.println(urlManager.getProperty("format"));
        System.out.println(urlManager.hasProperty("place"));
        System.out.println(urlManager.getProperty("place"));
        System.out.println(urlManager.hasProperty("time"));
        System.out.println(urlManager.getProperty("time"));
    }
}
