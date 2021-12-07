package week9.day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {


    public static void main(String[] args) {
//        Person person = new Person(new Ticket("Queen",LocalDateTime.now(),20000));
//        Person person2 = new Person(new FrontOfStageTicket("Queen",LocalDateTime.now(),30000,"#54253"));
//
//        Concert concert = new Concert();
//
//
//        concert.addPerson(person2, LocalTime.of(15,30));
//        System.out.println("OK");
//        concert.addPerson(person, LocalTime.of(15,30));


        Ticket frontTicket = new FrontOfStageTicket("Queen",LocalDateTime.now(),30000,"#23123");
        System.out.println(frontTicket.entryTime());


        //Csak olyan metódust hívhatok, ami a statikus típusban szerepel (bal oldal)
        //Ha a statikus és a dinamikur típusban is szerepel a metódus, akkor a dinamikus diktál (jobb oldal)




    }
}
