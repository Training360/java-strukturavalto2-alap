package week8.day05;

public class Position {

    private int start;

    private int end;

    public Position(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getAsString(String line) {
        return line.substring(start, end).trim();
    }

    public int getAsInt(String line) {
        return Integer.parseInt(getAsString(line));
    }
}
