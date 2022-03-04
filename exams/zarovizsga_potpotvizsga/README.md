# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár,
repository neve legyen: `sv2-2021-jvjbf-zarovizsga-potpotvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-zarovizsga-potpotvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes
feladathoz tartoznak  előre elkészített tesztosztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!

## Emelkedő számok (Algoritmus feladat, 20 pont)

Egy természetes számot emelkedőnek nevezünk, ha két szomszédos számjegye különböző, 
és a számjegyei balról jobbra haladva növekszenek. A `RisingNumbers` osztály 
`getNumberOfSixDigitRisingNumbers(List<Integer> numbers)` metódusával add vissza, hogy hány hatjegyű 
emelkedő szám van a paraméterként kapott listában! 
(Példa: emelkedő szám a 125789, de nem emelkedő szám a 167899.)

## Bisztro (OOP, 20 pont)

Hozd létre az `Address` nevű osztályt. Minden címnek legyen egy utca és egy házszám attribútuma (`street`,`number`).<br>

Hozd létre a `MenuItem` osztályt. Ez fog reprezentálni egy étlapon lévő elemet. Minden ilyen elemnek legyen egy neve (`name`), egy ára(`price`) és egy típusa(`type`). Ez utóbbi
`MenuItemType` felsorolás típusú. A `MenuItemType`-ban két felsoroló van a `FOOD` és `DRINK`. Mindegyiknek legyen egy `tax`, azaz adó attribútuma,
ami az ételnél 20 az italnál 27. (Ez százalékos értéket fejez ki). A `MenuItem` `double getPrice()` metódusát úgy valósítsd meg, hogy az árát a típusának megfelelő százalékkal növeljük!

Hozd létre a `Bistro` nevű osztályt. Egy bisztónak legye egy neve, egy címe és egy `MenuItem` listája. Ezekhez legyen getter 
metódus és egy `addMenuItem(MenuItem menuItem)` amivel a listához lehet elemet hozzáadni.<br>
Legyen még egy `Bar` osztály ami a `Bistro` osztályból származik. Az `addMenuItem(MenuItem menuItem)` metódusát definiáljuk felül úgy,
hogy csak olyan elemet lehet hozzáadni, aminek a típusa `DRINK`. Egyéb esetben dobjunk kivételt! A `getName()` metódust is definiáljuk felül úgy,
hogy a név után hozzáfűzzük a "(Drinks Only)" szöveget!<br>

Legyen még egy `City` nevű osztály, ami `Bistro` -k halmazát tárolja egy halmazban. Fontos, hogy két bisztrót egyenlőnek 
tekintünk, ha ugyanaz a neve és a címe!
Legyen benne egy metódus amivel Bistrokat lehet hozzáadni a halmazhoz!

## Bisztro (Kollekciók, 20 pont)

A következő metódusokat a `City` osztlyban valósítsd meg. <br>

* Írj egy metódust, amiben egy Bisztrót lehet megtalálni a címe alapján! Ha nincs ezen a címen, akkor dobjunk kivételt! (`Bistro findBistroByAddress(Address address)`)
* Írj egy metódust, amiben a leghosszabb menüvel rendelkező Bisztrót adod vissza! (`Bistro findLongestMenu()`)
* Add vissza azokat a Bisztrókat amikben lehet kapni egy bizonyos menü elemet. (`List<Bistro> findBistroWithMenuItem(String menuItemName)`)

## Vizsgaidőszak (File kezelés, 20 pont)

Egyetemisták körében felmérést végeznek, hogy a vizsgaidőszak egy adott napján mennyi időt töltenek tanulással. 
A hallgatók feladata az, hogy negyedórára kerekítve feljegyezzék az aznapi összes időszakaszt, amelyben a 
vizsgáikra készültek. A felmérés eredménye az `examlearnings.csv` fájlban található. Minden sorban egy hallgató és az 
általa feljegyzett időtartamok, órában megadva. (Tehát az a sor, hogy `John Doe;2,5;1,25;0,75` azt jelenti, hogy a 
John Doe nevű hallgató először tanult egyben 2 óra 30 percet, majd a nap folyamán később 1 óra 15 percet, végül 
pedig háromnegyed órát. Figyelj rá, hogy az egyes diákok különböző mennyiségű időtartamokat adtak meg.)
A feladat az, hogy olvasd be a fájlt az `ExamLearnings` osztályban egy ehhez megfelelő adatszerkezetbe, amelyben 
el tudod tárolni, hogy egy hallgató mennyi időt töltött tanulással. Majd írj egy `getAverageLearningInMinutes()` metódust, 
amelyben pedig visszaadod, hogy az egyetem hallgatói átlagosan hány percet töltöttek tanulással ezen a vizsgált napon!

## Telepesek és ültetvények (Adatbáziskezelés, 20 pont)

Egy távoli sziget telepesei dohányt termesztenek. Az évi várható termésmennyiséget mindig egy adatbázisban tárolják, 
a következő formában: a telepes egyedi azonosítója, a telepes neve, várható termésmennyiség (tonnában mérve), 
a termés eladása után várható összes bevétel. 
A telepest reprezentáló osztályt (`Settler`) tehát ezekkel az adattagokkal kell létrehozni, ám a termés tonnánkénti árát 
(az idei évben 500 pénz) az osztály konstans értékként tárolja (tehát a várható bevételt is ez alapján kell kiszámolni).
A `SettlerRepository` osztály felelős az adatbázissal való kommunikációért. Az osztály a `DataSource`-ot konstruktorban 
kapja meg. A következő metódusokat valósítsd meg:

* `long saveNewSettler(Settler settler)`: Ez a metódus elment az adatbázisba egy új telepest, minden adatával együtt. 
  Az elmentett telepes egyedi azonosítóját az adatbázis generálja. Valósítsd meg, hogy a metódus kérje vissza ezt az egyedi 
  azonosítót az adatbázistól és annak értékével térjen vissza!
* `Settler findSettlerById(long id)`: Ez a metódus `id` alapján kikeres az adatbázisból egy telepest és visszaadja azt, minden 
  adatával együtt. Ha nem talál ilyet, dobjon kivételt a megfelelő üzenettel!
* `void updateGrowthAndIncome(long id, int amount)`: Ez a metódus paraméterként egy telepes egyedi azonosítóját kapja, és 
  az a feladata, hogy kikeresse az adatbázisból a megfelelő telepest, majd csökkentse a hozzá tartozó várható termés- és 
  bevételi értéket, ha esetleg valamilyen körülmény ezt megkívánja (aszály, kártevő elszaporodása, stb.)