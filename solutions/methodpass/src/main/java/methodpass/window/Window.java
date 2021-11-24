package methodpass.window;

public class Window {

    private String roomName;
    private int width;
    private int height;

    public Window(String roomName, int width, int height) {
        this.roomName = roomName;
        this.width = width;
        this.height = height;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
