package methodparam.marriage;

import java.util.List;

public class Man {

    private String name;
    private List<RegisterDate> registerDates;

    public Man(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }
}
