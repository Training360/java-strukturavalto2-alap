# Konzultáción elhangzó gyakorlati feladatok

Tesztesetek írása akkor is javasolt, ha ez nem szerepel a feladatleírásban.

## WEEK01

A megoldásokat a `java-sv2-daily-labs01` repositoryban, a `week01-lab-tasks` projektben valósítsd meg.

### Day02
Készítsd el a GitHub repository-kat. Az `java-sv2-labs` repository-ban hozz létre egy `selfcheck` könyvtárat, és ide töltsd fel a `week01.md` file-t, melyet a közös repóban érsz el. Valamint a `java-sv2-daily-labs01` repóban hozz létre egy `day02` mappát és ide tölts fel egy képernyőképet!  

### Day04
A `java-sv2-daily-labs01` repón készíts egy day04 mappát és ebben készíts egy `daily-solution` nevű projektet. A projektben legyen egy `week01day04` nevű csomag, ezen belül egy `Hello` nevű osztály, melynek legyen egy `main` metódusa egy kiiratással. 

## Week02
A megoldásokat a `java-sv2-daily-labs02` repositoryban, a `week02-lab-tasks` projektben valósítsd meg.

### Day01
Készíts egy `day01.Human` nevű osztályt. Attribútumai legyenek egy név és egy életkor.
Legyen egy konstruktor ami beállítja ezeket az értékeket. Készíts getter metódusokat az attribútumokhoz. 


### Day02
Készíts egy `day02.Rectangle` (téglalap) nevű osztályt, amelynek két attribútuma a téglalap kétoldalának hossza (ha tudod, akkor lehet lebegőpontos). Készt egy konstruktort, ami beállítja az attribútumok kezdeti értékét. Készíts egy `calculateArea()` nevű metódust, ami visszaadja a téglalap területét! Készíts egy `day02.Geometry` nevű osztályt melyben van egy`main` metódus, itt teszteled az elkészített téglalapokat reprezentáló osztályt! 

### Day04
Készíts egy `day04.Car` osztályt, mely attribútumként tárolja, hogy hány litert a tankoltunk bele, és hány kilométert ment el ekkora mennyiségű üzemanyaggal. Mindkét attribútumhoz legyen setter metódus! Legyen egy metódus ami kiszámolja az autó átlag fogyasztását, azaz azt hogy 100km távolságon mennyit fogyasztott átlagosan.
Legyen egy `day04.GasStation` osztály is melynek legyen egy ár attribútuma, amit konstruktoron keresztül állítunk be. Legyen egy metódusa, a tankolás, ami egy kocsit és egy liter mennyiséget vár paraméterül. Ez a metódus állítsa be a kocsi üzemanyag mennyiségét és adja vissza, hogy mennyit kellett ezért fizetni.
Teszteled az osztályokat main metódusban!

### Day05
Készíts egy `day05.Movie` osztályt. Minden filmnek van egy címe, egy gyártási éve és egy átlagos értékelése. Emellett azt is tárolja, hogy hány értékelés érkezett eddig és mennyi ezek összege. Konstruktorban csak a címet és a gyártási évet állítsd be. Legyen egy metódusa ami egy értékelést vár paraméterül (1-5, egész szám) és beállítja, majd visszaadja az átlagos értékelést. 
Legyen egy `day05.Viewer` nevű osztály is, akinek egy metódusa van a `watchMovie(Movie movie, int rating)` mely meghívja a paraméterül kapott film értékelés metódusát.
Teszteld a munkád egy main metódusban! 

## WEEK03
A megoldásokat a `java-sv2-daily-labs03` repositoryban, a `week03-lab-tasks` projektben valósítsd meg.

### Day01
Készíts egy `day01.Students` osztályt, melyben van egy lista, ami gyerekek magasságát tartalmazza, kezdetben üres.
Készíts egy `addHeight(int height)` nevű metódust, amivel hozzáadhatunk egy magasságot a listához. 
Készíts egy `isHeightsIncreasing()` nevű metódust ami igaz értéket ad vissza, ha a gyerekek magassága növekvő sorrendben van, hamisat ha nem. 
Készíts egy `day01.School` nevű osztályt, amiben van egy `main()` metódus, amiben teszteled az elkészített metódusaidat. 

### Day02
Készíts egy `day02.Mathematics` osztályt, melyben van egy `boolean isPrime(int number)` metódus ami igaz értéket ad vissza, ha a paraméterül kapott szám prím, különben hamisat.

### Day03
Írj egy számkitaláló programot a `GuessTheNumber` osztályba! A program kitalál
egy véletlenszerű számot 1 és 100 között. Majd bekér a felhasználótól ciklusban
számokat.
Mindig megmondja, hogy a szám kisebb, nagyobb vagy egyenlő-e mint a gondolt szám.
Legfeljebb 6-szor lehessen kérdezni, és a felhasználó kapjon visszajelzést arról
is, ha kitalálta és arról is, ha nem!

### Day04
A történet: A török szultán úgy dönt 100 nappal a születésnapja előtt, hogy kienged néhány rabot a 100 cellás börtönéből. A börtönben a zárak kétállásúak, tehát vagy nyitva van vagy zárva. (Nem lehet duplára zárni). Azt parancsolja az őrnek hogy a 100. szülinapjáig minden nap menjen végig a börtönben. Az első napon minden záron fordítson egyet, így minden ajtó nyitva lesz. A második napon, minden második záron fordítson egyet, így minden második ajtó bezáródik. A harmadik napon, minden harmadik záron fordítson egyet. Így ha megnézzük a 3. ajtó zárva lesz, de a 6. nyitva. És ezt a folyamatot folytatja tovább, egészen a 100. napig. Az őr ezt a procedúrát nem akarja minden nap végrehajtani, ezért segítsünk neki és mondjuk meg, hogy a 100. napon mely ajtók lesznek nyitva, azaz végül melyik cellákból szabadulhatnak a rabok.

A feladat megoldásához készíts egy `day04.Prison` nevű osztályt amiben attribútumként tárolod a cellákat valamilyen adatszerkezetben. Az osztályban legyen egy metódus, `void openFreeCells()` melyben megvalósítod, a fenti feladathoz szükséges algoritmust, és a cella attribútumban a megfeleő cellák "nyitva" lesznek. Végül legyen egy `day04.Sultan` nevű osztályod amiben van egy `main()` metódus, amiben példányosítasz egy börtönt, lefuttatod az algoritmust végül kiírod a képernyőre a szabad cellák sorszámát. 
