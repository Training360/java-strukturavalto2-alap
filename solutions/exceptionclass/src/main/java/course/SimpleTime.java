package course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        set(hour, minute);
    }

    public SimpleTime(String timeString) {
        if (timeString == null)
            throw new InvalidTimeException("Time is null");
        if (timeString.length() != "hh:mm".length() || timeString.charAt(2) != ':')
            throw new InvalidTimeException("Time is not hh:mm");
        int hour;
        try {
            hour = Integer.parseInt(timeString.substring(0,2));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int minute;
        try {
            minute = Integer.parseInt(timeString.substring(3, 5));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        set(hour, minute);
    }

    private void set(int hour, int minute) {
        if (hour < 0 || hour > 23)
            throw new InvalidTimeException("Hour is invalid (0-23)");
        if (minute < 0 || minute > 59)
            throw new InvalidTimeException("Minute is invalid (0-59)");
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
