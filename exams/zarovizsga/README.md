# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár,
repository neve legyen: `sv2-2021-jvjbf-zarovizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-zarovizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes
feladathoz tartoznak  előre elkészített tesztosztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!

## Mondat transzformáció (Algoritmus feladat, 20 pont)

A `SentenceTransformer` osztályban írj egy `shortenSentence(String sentence)` metódust, ami egy mondatot vár paraméterül. Egy szöveget akkor tekintünk mondatnak, 
ha nagybetűvel kezdődik, és mondatvégi írásjel van a végén (. vagy ! vagy ?). Ha valamelyik nem teljesül, dobjunk kivételt!<br>
A metódusnak az a feladata, hogy rövidítsen le hosszú mondatokat. Hosszúnak számít a mondat, ha legalább 5 szóból áll. 
(A szavakat szóköz választja el egymástól.) Ha hosszú a mondat, akkor a metódus adja vissza az első és az utolsó szót, 
és közte szerepeljen egy " ... " karaktersorozat. 


## Szállítmányozó cég (Objektumok, 20 pont)

A feladatban egy szállítmányozó céget kell modellezni. <br>

Készíts egy `Transportable` interface-t a következő absztrakt metódusokkal: ` int getWeight()`, `boolean isBreakable()` és `int calculateShippingPrice()`.
Legyen benne egy `String getDestinationCountry()` metódus, ami alapértelmezetten "Hungary"-t ad vissza. <br>

Készítsd el a `NationalPackage` nevű osztályt, mely implementálja a `Transportable` interface-t. Attribútuma legyen a súlya és az, hogy
törékeny-e, ezeket konstruktorban állítsuk be. Definiáljuk felül értelemszerűen a kötelezően felüldefiniálandó interface metódusokat. 
A szállítás országon belül fixen 1000 ft, ha törékeny az áru, akkor ennek kétszerese.<br>

Készítsd el az `InternationalPackage` nevű osztályt, mely implementálja a `Transportable` interface-t. Attribútuma legyen a csomag súlya, törékeny-e, a célország 
és a távolság, amit meg kell tennie (kilométer). A szállítás alapára itt 1200, ami törékeny áru esetén duplázódik,
illetve a szállítási díjra rájön egy 10 forintos kilométerdíj.<br>

Készítsd el a `ShippingService` nevű osztályt, melyben egy lista található szállítható csomagokkal. Legyen egy`void addPackage(Transportable transportable)` metódus,
amivel csomagot lehet hozzáadni a listához.

## Szállítmányozó cég (Kollekciók, 20 pont)
A `ShippingService` osztályban valósítsd meg a következő funkciókat:

* Legyen egy `collectItemsByBreakableAndWeight(boolean breakable, int weight)` metódus, ami a paramétereknek megfelelően kiszűri a csomagokat. A súly paraméter alsó határt határoz meg.
* Legyen egy `collectTransportableByCountry()` metódus, ami megfelelő adatszerkezetbe kigyűjti, hogy melyik országba hány csomagot kell szállítani.
* Legyen egy `sortInternationalPackagesByDistance()` metódus, ami távolság alapján növekvő sorrendben visszaadja a nemzetközi csomagokat. Figyeljünk arra, hogy az eredeti lista sorrendjét ne változtassuk!


## Videomegosztó (File kezelés, 20 pont)

Adott a `data.csv` file. A file egy sora tartalmazza egy csatorna nevét, feliratkozók számát, és a csatornára feltöltött videók számát. Figyelem,
a file tartalmaz fejlécet!<br>
Hozd létre a `Channel` osztályt, melynek adattagjai a fájlban lévő megfelelő adatokat reprezentálják.<br>
Készíts egy `VideoPlatform` nevű osztályt, melynek adattagja egy csatornákat tartalmazó lista. Készíts egy metódust, ami paraméterül vár egy
`Path` objektumot és beolvassa a kapott fájl tartalmát a listába. 

Készíts egy `calculateSumOfVideos()` metódust, ami a platformra feltöltött videók összes számát adja vissza!

## Webshop (Adatbáziskezelés, 20 pont)

Ebben a feladatban termékeket és eladásokat fogunk kezelni.<br>
Egy terméknek van egy egyedi azonosítója (adatbázis generálja), egy neve, egy ára és egy darabszáma. Készítsd el a `ProductRepository`
osztályt, mely az adatbázissal való kommunikációért felelős. Legyen benne egy  `long insertProduct(String productName, int price, int stock)`
metódus, amivel egy terméket be tudok szúrni a `products` táblába, és visszaadja az adatbázis által generált kulcsot. Legyen továbbá egy ` Product findProductById(long id) ` metódus,
amivel id alapján tudom lekérdezni a termékeket, valamint egy `void updateProductStock(long id, int amount)`, amivel pedig az id alapján kikeresett termék stock értékét tudom csökkenteni az `amount`-ban átadott értékkel.<br>
 
Készítsd el a `ProductService` osztályt, melynek attribútuma egy `ProductRepository`, amit konstruktorban kap meg.
Legyen benne egy `void saleProduct(long id, int amount)` metódus, ami megkeresi a terméket, megnézi, hogy van-e belőle elég: 
ha nem, akkor kivételt dob, ha igen, akkor csökkenti a mennyiséget. 

Figyelj arra, hogy az adatbázis elérési paramétereit a teszteléshez megfelelően állítsd be!
