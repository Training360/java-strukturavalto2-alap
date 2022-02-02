# Vizsgafeladat
A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár,
repository neve legyen: `sv2-2021-jvjbf-harmadik-reszvizsga-potvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-harmadik-reszvizsga-potvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes
feladathoz tartoznak előre elkészített teszt osztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!

## Apartmanbérlés (20 pont)

Készítsd el az `streams.Apartment` osztályt. Minden lakásnak van egy lokációja (város), egy mérete (négyzetméter), egy fürdőszoba típusa mely
a következő típusokat veheti fel `ONE_FOR_CORRIDOR, ONE_FOR_TWO_ROOMS, ONE_PER_ROOM`. Ezeken felül még legyen egy extrák listája. Minden 
attribútum konstruktorban kapjon értéket.<br>
Készítsd el az `ApartmentRental` osztályt, melyben legyen egy lista apartmanokkal és egy metódus amivel apartmant lehet hozzáadni.<br>
Készítsd el a következő funkciókat <b>streamek</b> segítségével!

* Legyen egy metódus, ami `location` alapján leszűri a lakásokat.
* Legyen egy metódus, ami paraméterül vár valamennyi extrát és visszaadja azokat a lakásokat amik ezt tartalmazzák. 
* Legyen egy metódus, ami egy beérkezett fürdőszoba típus alapján visszaadja, hogy van-e olyan lakás a listában
* Legyen egy metódus, ami kigyűjti egy listába, hogy milyen méretű apartmanok vannak a listában. 


## Vizsgapontozás (30 pont)

Adott a `data.txt` fájl melyben egy sor a következőképpen néz ki. `{név};{elméleti pont} {gyakorlati pont}`. A fájl egy sora egy vizsgázó
nevét majd, elméleti és gyakorlati vizsgán szerzett pontjait tárolja. Olvasd be a fájl tartalmát egy `Map` adatszerkezetbe melynek kulcsai a nevek,
értékei pedig a pontszámokat tartalmazó osztály. Vigyázz! A fájl első sora a maxpontot mutatja,`{elméletmax} {gyakorlatmax}` ezt is olvasd be! Figyelj arra, hogy a `Map` abc sorrendben
legyen!<br>
Miután beolvastad oldd meg a következő feladatokat! (<b>Nem kötelező </b> streamekkel dolgoznod!)

* Az elméleti és gyakorlati vizsgán is 51% az átmenetel követelménye. Listázd ki azokat a neveket, akiknek valamelyik vizsgájuk nem sikerült!
* Adjuk vissza annak az embernek a nevét aki a legjobban teljesített. Legtöbb pontot érte el a két vizsgán együtt és nem bukott! (Pontok összegét nézzük!)
Ha többen egyenlő pontszámuak, akkor abc sorrendben az elsőt adjuk vissza. 


## Tartalom megosztó (45 pont)
A `contentsite` csomagban dolgozz <br>

Készíts egy `Content` interfacet melynek absztrakt metódusai, `boolean isPremiumContent()`, `String getTitle()` , `List<User> clickedBy()` és `void click(User user)`.
Az első kettővel azt lehet lekérdezni, hogy prémium tartalomról van-e szó illetve a tartalom címét. A harmadik metódus majd visszaadja, hogy kik kattintottak a tartalomra, a negyedik pedig magát a kattintást valósítja meg.<br>

Kétféle tartalmunk van a `Video` és a `Podcast`. A podcastok mindig meghallgathatók, nem prémiumak.  
A videókhoz szükséges prémium tagság, ha 15 percnél hosszabbak. A videóknak tehát van egy hossz attribútuma, melyet a címmel együtt konstruktorban állítsunk be.
Ezenfelül van egy listája ami tárolja, hogy kik klikkeltek rá. A `click(User user)` metódus egyszerűen hozzáadja a felhasználót a listához.<br>
A podcastoknak nem a hosszát tároljuk, hanem azt, hogy kik szerepelnek a felvételen egy `String` listában, melyet a címmel együtt konstruktorban állítunk be.
Minden más ugyanaz, mint a `Video`-ban. Mindkét esetben figyeljünk arra, hogy amikor a `clickedBy()` metódust meghívjuk, akkor másolatot adjunk vissza a listából.

A `User`-nek négy attribútuma van. A felhasználó neve a jelszava, hogy prémium tag-e és hogy be van-e jelentkezve. Konstruktorban csak a felhasználónév és jelszó attribútumokat állítjuk be, de úgy, hogy a jelszó, a felhasználónév és jelszó összefűzéséből képzett `String` `hashCode()`-ja legyen.
Az utolsó kettőhöz legyen egy `upgradeForPremium()` és egy `setLogIn(boolean value)` metódus, ami első esetben igaz, második esetben pedig a paraméterül kapott értékre állítja az attribútumokat. 

A `ContentService` osztály valósítja meg az üzleti logikát. Legyen benne attribútumként felhasználók és kontentek hamaza. És a következő metódusokat valósítsa meg:

* `void registerUser(String name, String password)` megnézi, hogy foglalt-e már a felhasználónév és ha nem, akkor belerakunk egy új felhasználót a halmazba.
* `void addContent(Content content)` megnézi, hogy van-e már ilyen című tartalom és ha nincs, akkor belerakja a halmazba. 
* `logIn(String username, String password)` megkeresi a felhasználónév alapján a felhasználót és ellenőrzi a jelszót, amit úgyanúgy képzünk mint a tárolásnál és ha a felhasználó vagy a jelszó hibás dobjunk kivételt!
* `clickOnContent(User user, Content content)` metódus ellenőrzi, hogy a felhasználó be van-e jelentkezve, ha prémium tagság kell a tartalom megtekintéséhez, akkor azt is és ha minden rendben meghívja a tartalom `click(User user)` metódusát. 




