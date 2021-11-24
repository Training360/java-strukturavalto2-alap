package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private List<String> classRegister = Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
            "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");

    public String getTodayReferringStudent(int number) {
        return classRegister.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return classRegister.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        return classRegister.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }
}
