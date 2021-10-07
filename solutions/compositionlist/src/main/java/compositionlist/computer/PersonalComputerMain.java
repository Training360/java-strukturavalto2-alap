package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel Pentium 4", 1.5);
        PersonalComputer pc = new PersonalComputer(cpu);

        Hardware monitor = new Hardware("monitor", "LG 25UM58-P");
        Hardware keyBoard = new Hardware("billentyűzet", "Samsung VG-KBD1500/XH");
        Hardware mouse = new Hardware("egér", "Acer Pmw920 Predator Cestus 310");
        pc.addHardware(monitor);
        pc.addHardware(keyBoard);
        pc.addHardware(mouse);

        Software windows = new Software("Windows", 10.0);
        Software idea = new Software("IntelliJ IDEA", 2021.2);
        pc.addSoftware(windows);
        pc.addSoftware(idea);

        System.out.println(cpu);
        System.out.println(monitor);
        System.out.println(keyBoard);
        System.out.println(mouse);
        System.out.println(windows);
        System.out.println(idea);

        System.out.println(pc.getCpu());
        System.out.println(pc.getHardwares());
        System.out.println(pc.getSoftwares());

        System.out.println(pc);
    }
}
