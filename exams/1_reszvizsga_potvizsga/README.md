# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztelésre való `Main` osztályok).
Projekt, könyvtár, repository neve legyen: `sv2-2021-jvjbf-elso-reszvizsga_potvizsga`. GroupId: `training360`, 
artifactId: `sv2-2021-jvjbf-elso-reszvizsga_potvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes feladathoz tartozik
egy-egy előre elkészített `Main` osztály, mindegyikben egy-egy `main()` metódussal. Ezekkel a megoldásod helyességét
ellenőrizheted, ugyanis minden utasítás után ott szerepel komment formájában az az érték, amelynek az utasítás
lefuttatása után a konzolon kell szerepelnie. Ha mégsem az szerepel a konzolon, ami az elvárt érték lenne, akkor ne a
`main()` metóduson változtass, hanem a saját megoldásodat nézd át újra!

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk ellenőrizni a megoldásod.
Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!


## Az első szám a szövegből (10 pont)

Készíts egy `firstnumber.FirstNumber` nevű osztályt. Legyen benne egy `char getFirstNumber(String s)` nevű metódus,
ami visszaadja a paraméterül kapott Stringből az első, benne talált számjegy karaktert! Ha nincs benne számjegy,
akkor egy szóköz karaktert adjon vissza a metódus!

Példa:<br>
input: "This is a String" <br>
output: ' ' (a konzolon ilyenkor egy üres sor látszik) <br>
input: "Thi3s is4 a St5ring" <br>
output: '3' (ez a konzolra természetesen aposztróf nélkül kerül)

## Számjegyek összege (15 pont)

A `sumofdigits.SumOfDigits` osztályban készíts egy `int getSumOfDigits(int number)` metódust, amely paraméterül egy
egész számot kap, és visszaadja a szám számjegyeinek összegét!

Példa:<br>
input: 123456 <br>
output: 21 <br>

## Fordított sorrend (15 pont)

A `reversedorder.ReversedOrder` osztályban a `String getWordsInReversedOrder(String[] words)` metódus
paraméterként egy szavakat tartalmazó tömböt kapjon, és az legyen a feladata, hogy adja vissza a tömb
szavait egy szövegként, fordított sorrendben, vesszővel elválasztva!

Példa:<br>
input: {"alma", "körte", "barack"} <br>
output: "barack, körte, alma" (ez a konzolra természetesen idézőjel nélkül kerül)

## Teaház (összesen: 35 pont)

a `teahouse` csomagba dolgozz!

### 1. feladatrész (15 pont):

Hozd létre a `Tea` osztályt, amelynek attribútumai: (fantázia)név (szöveg), ár (egész szám) és fajta! Ez utóbbit egy `Sort` nevű enummal
add meg, amely a következő felsorolókat tartalmazza: `BLACK_TEA, GREEN_TEA, ROOIBOS, HERBAL_TEA, FRUIT_TEA`! Az enumnak legyen egy
`String additionalInfo` attribútuma is, amely az egyes teafajtákhoz tartozó plusz tudnivalókat tartalmazza: a fekete
tea "élénkítő hatású", a zöld tea "méregtelenít", a rooibos tea "tele van antioxidánsokkal", a gyógyteának "sok különféle
gyógyhatása van", a gyümölcstea pedig egyszerűen csak "finom, édes ízű".

Az osztályban legyen egy konstruktor, ami beállítja az attribútumok kezdőértékeit, illetve getterek. Az árhoz legyen
setter metódus is! Az enumban is legyen konstruktor és getter! Készíts az osztályban egy felülírt `toString()`
metódust is!

### 2. feladatrész (20 pont):

Hozd létre a `TeaHouse` osztályt, amelynek legyen egy neve (szöveg), egy listája a náluk kapható teafajtákról
(`List<Tea>` típusú), egy nyitási és egy zárási időpontja (mindkettő `LocalDateTime` típusú)! A lista kezdetben ne legyen üres,
hanem eleve tartalmazzon már két teafajtát (`new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA)` és
`new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA)` adatokkal)! De tartozzon a listához egy `void addTea(Tea tea)` metódus is,
amellyel fel lehet tölteni további elemekkel! Minden attribútumhoz tartozzon getter!
Legyen az osztályban egy `void setActionPrices(Sort sort, int percent)` metódus, amelynek segítségével minden, a listában szereplő,
megadott fajtájú tea árát egyszerre lehet csökkenteni egy megadott százalékkal. Az akciós ár `int` típusú legyen, az adott százalékkal
való csökkentés után kapott árat kerekítsd lefelé!
Legyen az osztályban egy `double getAveragePrice()` is, amely visszaadja a listában található teák átlagárát!
