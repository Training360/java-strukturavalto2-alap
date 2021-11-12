# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztelésre való `Main` osztályok).
Projekt, könyvtár, repository neve legyen: `sv2-2021-jvjbf-elso-reszvizsga_potpotvizsga`. GroupId: `training360`,
artifactId: `sv2-2021-jvjbf-elso-reszvizsga_potpotvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes feladathoz tartozik
egy-egy előre elkészített `Main` osztály, mindegyikben egy-egy `main()` metódussal. Ezekkel a megoldásod helyességét
ellenőrizheted, ugyanis minden utasítás után ott szerepel komment formájában az az érték, amelynek az utasítás
lefuttatása után a konzolon kell szerepelnie. Ha mégsem az szerepel a konzolon, ami az elvárt érték lenne, akkor ne a
`main()` metóduson változtass, hanem a saját megoldásodat nézd át újra!

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk ellenőrizni a megoldásod.
Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!


## Tömb művelet (15 pont)

A `arrayopoeration.ArrayOperation` osztályban a `String getWordsBackwards(String[] words)` metódus
paraméterként egy szavakat tartalmazó tömböt kapjon, és az legyen a feladata, hogy adja vissza a tömb
szavait egy szövegként, fordított sorrendben, vesszővel elválasztva!

## Minden második (10 pont)

Készíts egy `everysecond.EverySecond` nevű osztályt. Legyen benne egy `String getEverySecondLetter(String s)` nevű metódus,
ami visszaadja a paraméterül kapott `String` objektum minden páros indexű karakterét egy új `String` objektumba összefűzve!

## Tökéletes! (15 pont)

Tökéletes számnak nevezzük azokat a természetes számokat, amelyek megegyeznek az önmaguknál kisebb osztóik összegével. (Forrás: Wikipédia)
Készits egy `absolute.Absolute` osztályt, amiben van egy `boolean isAbsolute(int number)` metódus, ami eldönti egy számról, hogy tökéletes szám-e.

## Vörös Oroszlán (összesen: 35 pont)

A `redlion` csomagba dolgozz!

### 1. feladatrész (15 pont):

Hozd létre a `Cup` osztályt, amelynek attribútumai: (fantázia)név (szöveg), ár (egész szám) és fajta! Ez utóbbit egy `Sort` nevű enummal
add meg, amely a következő felsorolókat tartalmazza: `BLACK_TEA, GREEN_TEA, ROOIBOS, HERBAL_TEA, FRUIT_TEA`! Az enumnak legyen egy
`String additionalInfo` attribútuma is, amely az egyes teafajtákhoz tartozó plusz tudnivalókat tartalmazza: a fekete
cup "élénkítő hatású", a zöld cup "méregtelenít", a rooibos cup "tele van antioxidánsokkal", a gyógyteának "sok különféle
gyógyhatása van", a gyümölcstea pedig egyszerűen csak "finom, édes ízű".

Az osztályban legyen egy konstruktor, ami beállítja az attribútumok kezdőértékeit, illetve getterek. Az árhoz legyen
setter metódus is! Az enumban is legyen konstruktor és getter! Készíts az osztályban egy felülírt `toString()`
metódust is!

### 2. feladatrész (20 pont):

Hozd létre a `RedLion` osztályt, amelynek legyen egy neve (szöveg), egy listája a náluk kapható teafajtákról
(`List<Cup>` típusú), egy nyitási és egy zárási időpontja (mindkettő `LocalTime` típusú)! A lista kezdetben ne legyen üres,
hanem eleve tartalmazzon már két teafajtát (`new Cup("Kamillavirágzat", 1256, Sort.HERBAL_TEA)` és
`new Cup("Cseresznyés álom", 1745, Sort.FRUIT_TEA)` adatokkal)! De tartozzon a listához egy `void addCup(Cup cup)` metódus is,
amellyel fel lehet tölteni további elemekkel! Minden attribútumhoz tartozzon getter!
Legyen az osztályban egy `void setActionPrices(Sort sort, int percent)` metódus, amelynek segítségével minden, a listában szereplő,
megadott fajtájú cup árát egyszerre lehet csökkenteni egy megadott százalékkal. Az akciós ár `int` típusú legyen, az adott százalékkal
való csökkentés után kapott árat kerekítsd lefelé!
Legyen az osztályban egy `double getAveragePrice()` is, amely visszaadja a listában található teák átlagárát!
