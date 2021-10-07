package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        System.out.println(Continent.EUROPE);
        System.out.println(Continent.ASIA);
        System.out.println(Continent.AMERICA);
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.AUSTRALIA);
        System.out.println(Continent.ANTARCTICA);
        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("INDIAN"));

        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.RIGHT_FULLBACK.name());
        System.out.println(Football.LEFT_FULLBACK.name());
        System.out.println(Football.CENTER_BACK.name());
        System.out.println(Football.DEFENDING_MIDFIELDER.name());
        System.out.println(Football.RIGHT_WINGER.name());
        System.out.println(Football.LEFT_WINGER.name());
        System.out.println(Football.STRIKER.name());
    }
}
