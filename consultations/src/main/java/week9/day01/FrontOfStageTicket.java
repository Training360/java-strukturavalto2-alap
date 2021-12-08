package week9.day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    private String extraCode;

    public FrontOfStageTicket(String band, LocalDateTime startTime, int price,String extraCode) {
        super(band, startTime, price);
        this.extraCode = extraCode;
    }

    private String saySometing(){
        return "Im a fron ticket";
    }

    @Override
    public LocalTime entryTime(){
        return super.entryTime().minusHours(1);
    }

    public String getExtraCode() {
        return extraCode;
    }

    @Override
    public String toString(){
        return saySometing();
    }
}
