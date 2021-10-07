package enumtype.solarsystem;

public class SolarSystemMain {

    public static void main(String[] args) {
        System.out.println(SolarSystem.MARS);
        System.out.println(SolarSystem.MARS.getMoon());

        System.out.println(SolarSystem.SATURN);
        System.out.println(SolarSystem.SATURN.getMoon());
    }
}
