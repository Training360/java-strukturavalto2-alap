package videos;

public class Channel {

    private String channelName;

    private int numberOfSubscriptions;

    private int numberOfVideos;

    public Channel(String channelName, int numberOfSubscriptions, int numberOfVideos) {
        this.channelName = channelName;
        this.numberOfSubscriptions = numberOfSubscriptions;
        this.numberOfVideos = numberOfVideos;
    }

    public String getChannelName() {
        return channelName;
    }

    public int getNumberOfSubscriptions() {
        return numberOfSubscriptions;
    }

    public int getNumberOfVideos() {
        return numberOfVideos;
    }
}
