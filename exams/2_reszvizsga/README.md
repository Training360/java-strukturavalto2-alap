# Vizsgafeladat
A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár, 
repository neve legyen: `sv2-2021-jvjbf-masodik-reszvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-masodik-reszvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes 
feladathoz tartoznak  előre elkészített teszt osztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk 
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!

## File szűrés (20 pont)
Adott a `humans.csv` állomány. Ebben pontosvesszővel elválasztva szerepel soronként egy-egy név és egy 
személyi szám. A feladat az, hogy olvasd be a file tartalmát, majd egy új fájlba írd ki a férfiak összes 
adatát. (A férfiak személyi száma 1-essel vagy 3-massal kezdődik, attól függően, hogy 2000 előtt vagy után 
született) A csomag, osztályok, attribútumok és metódusok elnevezését a teszt osztály alapján valósítsd meg!

## Szavak (15 pont)
Készíts egy `algorithms.Words` nevű osztályt, melyben egy lista található, benne szavakkal. Legyen 
egy `addWord(String word)` nevű metódusa, amiben arra kell figyelned, hogy csak szót lehet a listához 
adni (nincs benne szóköz) és csak kisbetűket tartalmazhat. Ha valamelyik nem teljesül, dobj `IllegalArgumentException`-t, 
a hibának megfelelő üzenettel!<br>

Mindezek után írj egy metódust, ami megnézi, hogy szerepel-e egy szó kétszer a listában. Ha igen, akkor igazat, 
ha nem, akkor hamis értéket ad vissza.

## Város 1. rész (30 pont)
A következő osztályokat a `city` comagba készítsd el.<br>

Készíts egy `Address` nevű osztályt, ami egy utcát és egy házszámot tárol.<br>
 
Legyen egy `Building` nevű absztrakt osztályod. Ennek attribútumai egy alapterület, szintek száma és a cím. 
Legyen két konstruktora. Az egyikben mindent állítsunk be, a másik csak az alapterületet és a címet várja, 
ekkor a szintek száma egy legyen. Legyen ezekhez getter illetve egy `getFullArea()` metódus, ami az alapterületet 
szorozza a szintek számával. Legyen még egy absztrakt `int calculateNumberOfPeopleCanFit()` metódus, ami azt 
reprezentálja, hogy hány ember fér be az épületbe. <br>
 
Hozd létre a `Home` nevű osztályt, ami egy otthont reprezentál és az épületből származik. Otthont is ugyanúgy 
lehessen létrehozni mint épületet, de arra figyeljünk, hogy a szintek száma legfeljebb 3 lehet. Ha ez nem teljesül, 
dobjunk kivételt! Legyen egy konstans attribútuma amit állítsunk be 20-ra. Ez az attribútum azt mutatja, hogy egy 
embernek legalább hány négyzetméterre van szüksége otthon. Ez alapján definiáld felül a `calculateNumberOfPeopleCanFit()` 
metódust. <br>

Hozd létre az `Office` nevű osztályt. Ebben extra attribútumként szerepel a cég neve, és szintenként az 
asztalok száma. Figyeljünk arra, hogy az asztalok számát úgy kell megadni, hogy egy asztalnak legalább 2 és 
legfeljebb 5 négyzetméterre van szüksége. Ha ez nem teljesül dobjunk kivételt! Minden irodában van egy emelet 
ami szórakozásra és pihenésre ad lehetőséget. Az irodába annyi ember fér be ahány asztal van emeletenként 
leszámítva a "szórakozó" emeletet. <br>

Hozd létre a `City` nevű osztályt. Minden városnak van egy neve, egy teljes területe (`long`) és épületeinek 
listája. Lehessen épületet hozzáadni a városhoz, de csak akkor, ha a hozzáadni kívánt épülettel nem lépjük 
túl a város alapterületét!

### Város 2. rész (25 pont)
A városban megvalósítandó további metódusok.
* A `Building findHighestBuildingInCity()` megkeresi a legmagasabb épületet a városban (legtöbb szintű). 
  Ha több ilyen is van akkor az elsőt.

* Szűrd le az egy utcába tartozó épületeket egy listába:  `findBuildingsByStreet(String street)`

* Írjunk metódust, ami eldönti van-e olyan épület, amibe egy bizonyos számú embernél több ember fér be. 
  (`boolean isThereBuildingWithMorePeopleThan(int numberOfPeople)`)


 
