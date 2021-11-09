# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, `Main osztályok`).
Projekt, könyvtár, repository neve legyen: `sv2-2021-jvjbf-elso-reszvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-elso-reszvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes feladathoz tartozik 
egy-egy előre elkészített `Main` osztály, mindegyikben egy-egy `main()` metódussal. Ezekkel a megoldásod helyességét 
ellenőrizheted, ugyanis minden utasítás után ott szerepel komment formájában az az érték, amelynek az utasítás 
lefuttatása után a konzolon kell szerepelnie. Ha mégsem az szerepel a konzolon, ami az elvárt érték lenne, akkor ne a 
`main()` metóduson változtass, hanem a saját megoldásodat nézd át újra!

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk ellenőrizni a megoldásod.
Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!


## Szövegmanipuláció (10 pont)

Készíts egy `stringmanipulation.StringManipulation` nevű osztályt. Legyen benne egy `String everyEvenCharacter(String s)` nevű metódus,
ami visszaadja a paraméterül kapott `String` objektum minden páros indexű karakterét egy új `String` objektumba összefűzve!

Példa:<br>
input: "This is a String" <br>
output: "Ti saSrn"

## Játék számokkal (15 pont)

Tökéletes számnak nevezzük azokat a természetes számokat, amelyek megegyeznek az önmaguknál kisebb osztóik összegével. (Forrás: Wikipédia)
Készits egy `numbers.PerfectNumbers` osztályt, amiben van egy `boolean isPerfectNumber(int number)` metódus, ami eldönti egy számról, hogy tökéletes szám-e.

Például: A 6 tökéletes szám mert a nála kisebb osztóinak összege 1+2+3=6

## Autókereskedés (20 + 30 pont)

### 1. rész

Készítsd el a `cars.Car` osztályt. Minden autónak van egy márkája (szöveg), egy motormérete (lebegőpontos szám),
egy színe (felsorolásos típus, a következő felsorolókkal: `RED,BLACK,BLUE,GREY`) és egy ára (egész szám).

Az osztályban legyen egy konstruktor, ami beállítja az attribútumok kezdőértékeit, illetve getterek.

Ha egy autót nem sikerül eladni, akkor dönthetnek úgy, hogy csökkentik az árát egy bizonyos százalékkal. Ezt valósítsa meg
a `void decreasePrice(int percent)` metódus. Figyelj arra, hogy az ár a csökkentés után is egész szám legyen méghozzá a kiszámított ár egészrésze.

Készítsd el a `cars.CarShop` osztályt. Az osztálynak három attribútuma az autókereskedés neve (szöveg), egy ár, ami azt jelöli, hogy legfeljebb mekkora értékű autókkal kereskedik (egész szám), és autók listája.
A kereskedés nevét és a felső limitet konstruktorban állítsd be, a lista kezdetben legyen üres.
Minden attribútumhoz tartozzon getter metódus. 

Legyen az osztályban egy `boolean addCar(Car car)` metódus, ami a paraméterül kapott autót hozzáadja a listához és
igazat ad vissza, ha az autó ára nem haladja meg a max limitet. Ellenkező esetben ne kerüljön a kocsi a listába és hamis értékkel térjen vissza.

### 2. Rész

Bővitsd a `CarShop` osztályt egy metódussal, ami visszaadja a kereskedésben található autók összértékét.
A metódus neve legyen `double sumCarPrice()`.

Legyen egy metódus, ami vár egy árat és visszaadja a kapott árnál nem drágább autók darabszámát.
A metódus neve legyen `int numberOfCarsCheaperThan(int price)`.

Legyen egy metódus, ami paraméterül vár egy márkát és visszaadja az összes olyan márkájú autót. 
A metódus neve legyen `List<Car> carsWithBrand(String brand)`. 
