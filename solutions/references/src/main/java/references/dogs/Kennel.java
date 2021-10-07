package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        // Hozz létre egy üres `List<Dog> dogs` listát, amelyben az osztály a hozzá tartozó kutyákat fogja nyilvántartani!
        List<Dog> dogs = new ArrayList<>();

        // Példányosíts három különböző `Dog`-ot, és mindhármat add hozzá a listához!
        Dog firstDog = new Dog("Morzsi", 5, "barna");
        dogs.add(firstDog);

        Dog secondDog = new Dog("Rex", 2, "fekete");
        dogs.add(secondDog);

        Dog thirdDog = new Dog("Cézár", 8, "fehér");
        dogs.add(thirdDog);

        // Írd ki a konzolra a lista tartalmát!
        System.out.println(dogs);

        // Majd definiálj egy új (negyedik) `Dog` típusú változót, amelynek add értékül a lista 1-es indexű elemét!
        // A most definiált változónév használatával változtasd meg a kutya színét!
        Dog fourthDog = dogs.get(1);
        fourthDog.setColour("foltos");

        // Újra írd ki a konzolra a lista tartalmát!
        System.out.println(dogs);

        // Definiálj egy újabb (ötödik) `Dog` típusú változót, melynek adj értékül egy újonnan példányosított objektumot!
        // Írd is ki a konzolra ennek a példánynak az adatait!
        Dog fifthDog = new Dog("Buksi", 12, "világosbarna");
        System.out.println(fifthDog);

        // Az előző lépésben definiált változónak add értékül a kutyalista 1-es indexű elemét! Írd ki a
        // konzolra a változó értékét!
        fifthDog = dogs.get(1);
        System.out.println(fifthDog);

        // A listához add hozzá az előző változó által hivatkozott példányt! Írd ki a konzolra a lista tartalmát!
        dogs.add(fifthDog);
        System.out.println(dogs);

        // Definiálj megint egy (hatodik) `Dog` típusú változót, majd add neki értékül a korábbi, negyedik `Dog` típusú változó
        // értékét! A most definiált változó nevének használatával változtasd meg a kutya színét!
        Dog sixthDog = fourthDog;
        sixthDog.setColour("fekete-fehér foltos");

        // Újra írd ki a konzolra a lista tartalmát!
        System.out.println(dogs);

        // Definiálj egy második `List<Dog>` típusú listát, melynek add értékül az első listát!
        List<Dog> anotherDogs = dogs;

        // Definiálj megint egy (hetedik) `Dog` típusú változót, majd ennek is add értékül a korábbi, negyedik `Dog` típusú változó
        // értékét! A most definiált változó nevének használatával újra változtasd meg a kutya színét!
        Dog seventhDog = fourthDog;
        seventhDog.setColour("csíkos");

        // Újra írd ki a konzolra a lista tartalmát, immár a második `List<Dog>` típusú változó nevének használatával!
        System.out.println(anotherDogs);

        // Az eredetileg létrehozott, másodikként definiált `Dog` típusú változó nevének használatával változtasd meg
        // a kutya színét! Írd ki újra a konzolra a lista tartalmát, a második `List<Dog>` típusú változó nevének használatával!
        secondDog.setColour("tigriscsíkos");
        System.out.println(anotherDogs);

        // Az eredetileg létrehozott, másodikként definiált `Dog` típusú változó értékét változtasd meg `null`-ra!
        // Írd ki újra a konzolra a lista tartalmát, a második `List<Dog>` típusú változó nevének használatával!
        secondDog = null;
        System.out.println(anotherDogs);

        // Definiálj egy újabb (nyolcadik) `Dog` típusú változót, majd add neki értékül az első kutyalista 1-es
        // indexű elemét! Majd állítsd át az értékét `null`-ra! Írd ki újra a konzolra a lista tartalmát, a második `List<Dog>`
        // típusú változó nevének használatával!
        Dog eighthDog = dogs.get(1);
        eighthDog = null;
        System.out.println(anotherDogs);

        // Definiálj egy utolsó (kilencedik) `Dog` típusú változót, majd add neki értékül az első lista 1-es
        // indexű elemét! A most definiált változó nevének használatával változtasd meg a kutya színét! Írd ki újra a
        // konzolra a lista tartalmát, a második `List<Dog>` típusú változó nevének használatával!
        Dog ninthDog = dogs.get(1);
        ninthDog.setColour("sárga-fekete tigriscsíkos");
        System.out.println(anotherDogs);
    }
}
