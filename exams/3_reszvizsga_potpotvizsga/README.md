# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár,
repository neve legyen: `sv2-2021-jvjbf-harmadik-reszvizsga-pot-potvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-harmadik-reszvizsga-pot-potvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes
feladathoz tartoznak előre elkészített teszt osztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!


### Videók (20 pont)

A `streams` csomagba dolgozz! <br>
Készíts egy osztályt `Video` néven melynek attribútumai a videó címe, a hossza (másodpercben), a feltöltés dátuma, és a videóhoz tartozó
hashtagek (címkék) szöveges listája. Ezeket konstruktorban állítjuk be és rendelkeznek getter metódusokkal<br>
Hozd létre a `VideoService` osztályt, melyben videók listája szerepel. Legyen benne egy metódus amivel videót lehet hozzáadni a listához.<br>
Készítsd el a következő metódusokat <b>streamek</b> használatával!

* `List<Video> findVideosByTitle(String titlePart)` metódus adja vissza egy listában azokat a videókat, amiknek címe tartalmazza a paraméterül kapott Stringet, dátum szerint rendezve, a legkésőbbi legyen az első.
* `long countVideosWithHashTag(String hashTag)` visszaadja, hogy hány olyan videó van, aminek címkéi között szerepel az átadott hashtag.
* `Video firstVideoByDate()` visszaadja a dátum szerint először feltöltött vidót. Ha üres a lista, kivételt dob!
* `long sumOfVideoLengths()` visszaadja, hogy összesen hány percnyi video van a listában!

## Síkölcsönző (30 pont)

Adott a `skirental.txt` fájl, melyben egy sor a következőképpen néz ki: `{név};{síléc mérete} {síbakancs mérete}`. 
A fájl egy sora egy személy nevét, valamint az általa kölcsönzött felszerelés méreteit tárolja. Nem mindenki kölcsönöz mindenféle
felszerelést, ezekben az esetekben a méretet 0-val jelölik (olyan természetesen nincs, aki egyiket sem kölcsönzi). 
Olvasd be a fájl tartalmát egy `Map` adatszerkezetbe, melynek kulcsai a nevek, értékei pedig a méreteket tartalmazó osztály. 
Vigyázz! A fájl első sora egy fejléc, erre nem lesz szükséged. Figyelj arra, hogy a `Map` ábécé-sorrendben legyen! <br>

Miután beolvastad, oldd meg a következő feladatokat (<b>Nem kötelező </b> streamekkel dolgoznod!):

* Listázd ki a gyerekek neveit (gyereknek számít az, akinek legfeljebb 37-es méretű síbakancsra és 120-as lécre van szüksége)! 
  Figyelj arra, hogy a 0-val jelölt értékek nem feltétlenül tartoznak gyerekhez!
* Adjuk vissza annak az embernek a nevét, akinek a kölcsönző ügyfelei közül a legnagyobb méretű lába van, és ráadásul még sílécet is 
  kölcsönzött (vagyis nem 0 szerepel egyik mérete helyén sem)! Ha több ilyen van, akkor ábécé-sorrendben az elsőt!
  
### Email Szolgáltató (45 pont)

Az `emailservice` csomagba dolgozz! <br>

Készítsd el az `Email` interface-t. Legyenek benne a következő absztrakt metódusok: `User getFrom()`, `User getTo()`, ` String getSubject()`
`String getContent()`. Illetve legyen még benne, egy `boolean isImportant()` metódus, ami alapértelmezetten hamis értékkel tér vissza. <br>

Az `Email` interfacenek két implementációja legyen, a `Normal` és a `Spam`. A `Normal` email-nek négy attribútuma, a kitől, 
kinek, tárgy és tartalom, melyeket az interface metódusok felüldefiniálásával lehet lekérdezni. Ebben az osztályban 
definiáljuk felül az `isImportant()` metódust úgy, hogyha az email tárgya bármilyen formában tartalmazza az "important" szót,
akkor igazzal térjünk vissza. <br>

A `Spam` osztálynak három attribútuma van, a kinek, a tartalom és a tárgy. Ezeket konstruktorban állítsuk be és defináljuk felül az interface metódusokat 
úgy, hogy le lehessen őket kérdezni. 
A `getFrom()` metódust definiáljuk felül úgy, hogy létrehoz egy felhasználót "spam@spam.com" email címmel és ezt adja vissza.<br> 

A `User` osztálynak négy attribútuma van, az emailcím, a bejövő levelek listája, az elküldött levelek listája és egy logikai típusú `hasSpamFilter` attribútum. 
Konstruktorban csak az emailcímet adjuk át. 
Legyen egy `getEmail(Email email)` metódus. Ha a felhasználónak van spamfiltere és a bejövő üzenet email címében szerepel a "spam" szó, akkor
dobjunk kivételt. Minden más esetben adjuk hozzá az e-mailt a bejövő levelekhez. Legyen egy `sendEmail(String subject, String content, User to)` metódus,
amiben összeállítunk egy `Normal` emailt, úgy, hogy a feladó az aktuális objektum és ezt hozzáadjuk az elküldött levelekhez, és meghívjuk a fogadó `getEmail()` metódusát.
Legyen egy `spamFilterChange()` metódus, ami "átkapcsolja" a `hasSpamFilter` attribútumot az aktuálissal ellentétes állapotra. A listákat lehessen lekérdezni
getterekkel, fontos hogy a bejövőkben a fontos emailek legyenek elöl.<br>

Készítsd el az `EmailService` osztályt. Ebben legyen egy halmaz, ami a felhasználókat tárolja. Lehessen felhasználót regisztrálni, 
a `registerUser(String emailAddress)` metódus segítségével.
Ebben a metódusban ellenőrizzük, hogy az email cím megfelelő formátumú-e és hogy nem foglalt. (Formátum: Van benne @ jel és az nem az első 
karakter és a @ jel után nem közvetlenül van egy . karakter)
Ha minden oké, létrehozzuk a `User` -t és hozzáadjuk a halmazhoz. Legyen benne még egy `sendEmail(String from, String to, String subject, String content)` metódus,
ami megkeresei a feladót és a fogadót a listában és a megfelelő paraméterezéssel meghívja a feladó `sendEmail()` metódusát. 
Legyen még egy `sendSpam(String subject, String content)`
metódus, ami a halmazban lévő összes felhasználónak kiküld egy, a paraméterekből összeállított `Spam`-et, meghívva mindegyik `getEmail()` metódusát. 






