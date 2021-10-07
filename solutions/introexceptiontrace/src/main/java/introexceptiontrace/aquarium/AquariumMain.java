package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Fish firstFish = new Fish("guppi", "piros-sárga");
        Fish secondFish = new Fish("guppi", "kék-fehér");
        Fish thirdFish = new Fish("zebradánió", "fekete-fehér csíkos");

        aquarium.addFish(firstFish);
        aquarium.addFish(secondFish);
        aquarium.addFish(thirdFish);

        System.out.println(aquarium.getNumberOfFish());
    }
}





// A kivétel azért keletkezik, mert az Aquarium osztályban található lista sehol nincs példányosítva,
// tehát az értéke null. Amikor az Aquarium osztály addFish() metódusát hívjuk, az továbbhív a
// lista add() metódusára, ezért keletkezik a kivétel.