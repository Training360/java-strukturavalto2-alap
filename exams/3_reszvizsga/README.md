# Vizsgafeladat
A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár,
repository neve legyen: `sv2-2021-jvjbf-harmadik-reszvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-harmadik-reszvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes
feladathoz tartoznak  előre elkészített teszt osztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!

## Dalok  (20 pont)
Készítsd el a `streams.Song` nevű osztályt. Minden dalnak legyen egy címe, egy hossza (másodpercben), egy előadók listája (`String` lista)
és egy megjelenés dátuma. Ezeket mind konstruktorban állítsd be. Készíts az osztályban gettereket! <br>
Készítsd el a `SongService` nevű osztályt, legyen benne egy privát lista dalokkal. Készíts egy metódust, amivel dalokat lehet
hozzáadni a listához.Az osztályokat nyugodtan bővítheted egyéb metódusokkal, ha szükséges.<br>
Készítsd el a következő metódusokat <b>streamek</b> használatával! 
*  Add vissza a legrövidebb dalt, `Optional`-ként! 
*  Add vissza dalok listáját cím alapján! (Két dalnak lehet ugyanaz a címe)
*  Lehessen lekérdezni, hogy egy előadó szerepel-e egy konkrét dal előadóinak listájában!
* Gyűjtsd ki az összes dal címét, ami egy paraméterül átadott dátum előtt jelent meg! 


## Járműbérlés (35 pont)

A `vehiclerental` csomagba dolgozz! <br>

Készítsd el a `Rentable` interface-t, melynek négy absztrakt metódusa a `int calculateSumPrice(long minutes)`, a `LocalTime getRentingTime()`, `void rent(LocalTime time)` és a `closeRent()`. Az interface terjessze ki a `Comparable<Rentable>` interface-t és a `compareTo()` metódust úgy definiálja felül alapértelmezetten,
hogy a természetes rendezés a bérlési idő szerint legyen növekvő sorrendben.<br>

Készíts egy `Car` és egy `Bike` osztályt. Minkettő implementálja a `Rentable` interface-t! <br>

A biciklinek legyen egy egyedi azonosítója, melyet konsrtuktorban állíts be. Ezen felül legyen egy
`rentingTime` attribútuma. Biciklit fixen 15 forint/perc áron lehet bérelni, ez alapján definiáljuk felül a `calculateSumPrice(long minutes)` metódust.<br>

Az autóknak is van egyedi azonosítójuk és bérlési idejük, és itt szerepel egy percdíj attribútum is, amit konstruktorban kap meg.
A fizetendő összeget itt ez alapján a percdíj alapján számoljuk.<br>

A `rent(LocalTime time)` és a `closeRent()` metódus mindkettőben egy dolgot csinál. A bérléskor beállítjuk a bérlési időt a paraméterül kapott időre,
a bérlés lezárásakor pedig `null`-ra.<br>

Készíts még egy `User` osztályt. Minden felhasználónak legyen felhasználóneve, e-mail címe és egy kezdeti egyenlege. Az egyenleget lehessen csökkenteni.<br>

A `RentService` valósítja meg magát a bérlést. Az osztály tartalmazza a bérelhető járművek és felhasználók halmazát, valamint
egy aktuális rendelés nyilvántartást, ahol jármű, felhasználó párokat tárolunk egy adatszerkezetben. 
Lehessen felhasználót és járművet hozzáadni a megfelelő halmazokhoz. Ha egy felhasználnév már foglalt dobjunk saját
`UserNameIsAlreadyTakenException` kivételt.<br>

Ugyanebben az osztályban valósítsuk meg a `rent(User user, Rentable rentable,LocalTime time)` metódust. Fontos, hogy egy járművet 
legfeljebb 3 órára lehet kibérelni. Ha egy felhasználó bérelni akar, nézzük meg, hogy járműnek be van-e állítva már bérlési idő, és hogy a felhasználónak van-e elég pénze a 3 órás bérlésre. Ha igen, akkor állítsuk be a bérlési időt és
rakjuk be a párost az aktuális bérlések közé. Ha valami nem stimmel dobjunk `IllegalStateExceptiont`.<br>

Készítsünk egy `closeRent(Rentable rentable, int minutes)` metódust is, ekkor ellenőrzés után vegyük ki a rendelést az aktuális
rendelésekből és a rendeléshez tartozó felhasználótól vonjuk le az egyenleget<br>

Fontos, hogy az aktuális rendelések mindig időrendben legyenek tárolva! 


## Moziműsor I. rész (25 pont)

Adott a `moviesintheaters.txt`szöveges állomány. Egy sor a következőképpen épül fel`{mozi neve}-{filmcím};{óra}:{perc}`.
Olvasd be a fájl tartalmát egy Map adatszerkezetbe, melynek kulcsai a mozik, értékek pedig a mozikban játszott filmek listája időpont szerint rendezve.<br>
Egy film reprezentálásához hozd létre a `Movie` osztályt. Két filmet egyenlőnek tekintünk, ha azonos a címe. Valósítsd meg ez alapján az `equals()` metódust.<br>

Az, hogy a kulcshoz tartozó lista rendezett legyen, úgy kell megvalósítani, hogy az első lekérdezés pillanatában legyen rendezett. 
Ha nem sikerül valamelyik feltétel a megvalósításnál, akkor saját ízlésed szerinti adatszerkezetbe dolgozd fel a fájlt. Ekkor legfeljebb a pontok felét kaphatod meg! Ha rendezés nem sikrül, az 4 pontot ér. 
<br>

(Hint: Az óra:percet a `LocalTime.parse()` metódussal tudod átkonvertálni.)


## Moziműsor II. rész (15 pont)
A feladatokra akkor is teljes értékű pont jár, ha előzőleg a filebeolvasás nem sikerült.
A következő feladatokat <b> Nem Kötelező</b> streamekkel megoldani, se plusz se minuszpont nem jár érte.<br>

* Legyen egy `findMovie(String title)` metódus, ami visszaadja a mozik listáját, ahol a filmet adják.
* Legyen egy metódus ami paraméterül vár egy filmcímet és visszadja azt a legkésőbbi időpontot amikor játsszák. 
Ha nem játsszák dobjunk `IllegalArgumentException`-t.



