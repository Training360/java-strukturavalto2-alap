# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár,
repository neve legyen: `sv2-2021-jvjbf-zarovizsga-potvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-zarovizsga-potvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes
feladathoz tartoznak  előre elkészített tesztosztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!

## Armstrong számok (Algoritmus feladat, 20 pont)

Armstrong-számnak nevezünk egy n jegyű számot, ha minden számjegyét az n-edik hatványra emelve és összeadva az eredeti számot kapjuk.(<i>Forrás:Wikipedia</i>)
Például: A 153, hossza 3. 1^3+5^3+3^3 = 1+125+27 = 153. (A ^ jel hatványt jelöl: 3^2 = három a másodikon)
A `ArmstrongNumbers` osztályban írj egy `isArmstrongNumber(int number)` metódust, ami igaz értékkel tér vissza, ha egy szám Armstrong-szám!
Negatív szám nem lehet Armstrong-szám, így ebben az esetben dobj kivételt!


## Újság (OOP, 20 pont)

Ebben a feladatban egy újság felépítését kell modellezned!<br>

Először készítsd el a `Header` osztályt, ez fogja reprezentálni egy cikk címét. Két adattagja a tartalom (`String content`) és a cím mérete (`int level`). Ezeket konstruktorban
állítsd be és legyen hozzájuk getter!<br>

Készítsd el az `Article` absztrakt osztályt, mely implementálja a `Comparable<Article>` interface-t. Adattagjai a cikk szerzője, egy `Header` és a bekezdések listája.
(`List<String> paragraphs`). Ezeket mind konstruktorban állítsd be. Készíts hozzájuk gettert. Legyen még egy `getImportance()` metódusa, melyet a leszármazott osztályok implementálnak majd. 
A természetes rendezettség a fontosság alapján valósuljon meg, úgy, hogy a fontosabb cikkek előrébb vannak! Fontos még, hogy két
cikket egyenlőnek tekintünk, ha ugyanaz a címe és ugyanazok a bekezdések vannak benne!  (Természetesen ebben az esetben a rendezettségnek és
az ekvivalenciának nem szükséges összhangban lenniük.)<br>

Készítsd el a `MainArticle` osztályt, mely a cikkből származik, és definiáld felül az absztrakt metódusát úgy, hogy a fontosság a bekezdések számának és a cím méretének az összege!<br>

Készítsd el a `YellowPressArticle` (yellow press = bulvár) osztályt, mely szintén a cikkből származik. Figyeljünk arra, hogy bulvár cikket nem lehet
5-nél nagyobb címmel létrehozni, ha mégis ilyen paramétert kap, dobjunk kivételt. A bulvár cikkek fontossága minden esetben 1.<br>

## Újság (Kollekciók, 20 pont)

Készítsd el a `NewsPaper` osztályt. Minden újságnak van egy neve (`name`) és attribútuma még a cikkek rendezett halmaza! Konstruktorban csak a nevet kapja meg. Készítsünk ezekhez gettert és egy metódust, amivel
cikket lehet az újsághoz adni!

* Készíts egy metódust, amiben egy szerző összes cikkét visszaadod egy listában!
* Készíts egy metódust, amiben bekezdés részlet alapján lehet keresni, azaz paraméterül kap egy szöveget és ha 
valamelyik cikk valamelyik bekezdésében megtalálható a szöveg, akkor visszaadja a cikket!

## Osztályzatok (File kezelés, 20 pont)

Adott a `data.csv` file. A file egy sora tartalmazza egy tanuló nevét, melyik osztályba jár, és utána a biológia érdemjegyeit. Figyelem,
nem mindenkinek ugyanannyi jegye van!<br>
Hozd létre a `Student` osztályt, melynek adattagjai a fájlban lévő megfelelő adatokat reprezentálják. A jegyeket egy listában tárold, melyet nem konstruktorban kap meg, hanem egy `addGrade(int grade)` metódussal lehet hozzá értéket adni.
Ha így nem tudod megoldani a beolvasást akkor opcionálisan létrehozhatsz még egy konstruktort, amiben a listát is megkapja a tanuló.<br>
Készíts egy `TeacherNotebook` nevű osztályt, melynek adattagja egy tanulókat tartalmazó lista. Készíts egy metódust, ami paraméterül vár egy
`Path` objektumot és beolvassa a kapott fájl tartalmát a listába.

Készíts egy `List<String> findFailingStudents()` metódust, ami visszaadja a bukásra álló tanulók nevét. Bukásra az áll, aki nem éri el a legalább 2-es átlagot!


## Üzenetek (Adatbáziskezelés, 20 pont)

Ebben a feladatban felhasználókat és felhasználók közötti üzenetváltásokat fogunk megvalósítani!<br>

Készíts egy `User` osztályt akinek egy id és egy felhasználónév adattagja van. Lehessen létrehozni felhasználót csak felhasználónév, vagy mindkettő megadásával.<br>

Készítsd el a `UserRepository` osztályt melyben a `users` táblát fogod manipulálni. A `users` táblának két oszlopa az azonosító és a felhasználónév!
Készíts egy `insertUser(String username)` beszúró metódust, ami paraméterül kap egy felhasználónevet és beszúrja a táblába. Készíts egy `Optional<User> findUserByName(String username)` metódust,
ami visszatér egy `User` minden adatával, ha a név alapján megtalálta azt az adatbázisban. 

Készítsd el a `MessageRepository` osztályt melyben a `messages` táblába fogsz adatokat beszúrni.
A tábla oszlopai rendre `id`, `sender_id`, `receiver_id`, `message`. Készíts egy metódust, ami megkapja a küldő azonosítót, a fogadó azonosítót és 
az üzenetet. Készíts egy másik metódust is, ami `sender_id` alapján visszaadja az összes üzenetet, amit az illető küldött! <br>
Mindkét adatbázist kezelő osztály a `DataSource`-t konstruktorban kapja!<br>

Készítsd el a `MessageService` osztályt mely mindkét adatbázist kezelő osztályból kap egy példányt konstruktorban!
Legyen benne egy `void registerUser(String username)` metódus, ami megnézi, hogy a felhasználónév szerepel-e már az adatbázisban, és ha nem, akkor kivételt dob!
Legyen egy `void sendMessage(User sender, User receiver, String message)` metódus, ami megnézi, hogy a felhasználók szerepelnek-e az adatbázisban. Ha igen, akkor
a megfelelő id-kkal beszúr egy sort a `messages` táblába. 





