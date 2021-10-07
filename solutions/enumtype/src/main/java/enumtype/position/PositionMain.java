package enumtype.position;

public class PositionMain {

    public static void main(String[] args) {

        System.out.println("Pozíció: " + Position.OPERATIVE_DIRECTOR + ", fizetés: " +
                Position.OPERATIVE_DIRECTOR.getSalary() + " Ft, béren kívüli juttatás(ok): " +
                Position.OPERATIVE_DIRECTOR.getBenefit());
        System.out.println("Pozíció: " + Position.OFFICE_MANAGER + ", fizetés: " +
                Position.OFFICE_MANAGER.getSalary() + " Ft, béren kívüli juttatás(ok): " +
                Position.OFFICE_MANAGER.getBenefit());
    }
}
