# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek).
Projekt, könyvtár, repository neve legyen: `sv2-2021-jvjbf-mintavizsga`. GroupId: `training`, artifactId: `sv2-2021-jvjbf-mintavizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden 
feladathoz tartoznak előre elkészített teszt osztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész!

A feladatok megoldásához érdemes használni a cheat sheetet:

[Cheat sheet](https://github.com/Training360/java-strukturavalto2-alap/blob/main/cheat-sheet/cheat-sheet.md)

## Unique finder

Hozd létre a `UniqueFinder` osztályt, és abban a `getUniqueChars` metódust, ami paraméternek kap egy `String`-et, és
térjen vissza az abban levő karakterek listájával. Minden karakter csak egyszer szerepeljen a listában, az inputban 
nézett első előfordulásának megfelelő helyen.

Ha a metódus null-t kap paraméterben, akkor dobj `IllegalArgumentException`-t!

## Bagolyszámlálás

A `OwlCounter` oszály egy `List<String>`,  attribútumban tárolja, hogy
melyik megyében mennyi baglyot számoltak a madárszámlálók.
A `readFromFile()` metódussal töltsd be az értékeket egy fájlból! A fájl formátuma a következő:

```
Bács-Kiskun=1000
Baranya=1050
Békés=980
Borsod-Abaúj-Zemplén=600
```

A `getNumberOfOwls()` metódus adja vissza a baglyok számát a paraméterként átadott
megyében! A `getNumberOfAllOwls()` pedig adja vissza a számlált baglyok összesített számát az egész országban!

A metódusok paraméterezése, visszatérési értéke és az esetleges hiányzó adatok kiderülnek a tesztesetekből.

## Akvárium

### 1. rész

Hozzunk létre egy egyszerű alkalmazást, amivel egy akvárium működését modellezhetjük!

Minden halnak van neve, súlya grammban és színe. Emellett minden hal számára elérhetőek az alábbi metódusok:

* `getStatus()`: adja vissza a hal adatait egy Stringben, pl. `Dory, weight: 9, color: blue, short-term memory loss: true`
* `feed()`: megnöveli a hal súlyát, a pontos implementáció a hal fajtájától függ.

A következő halak ismeretesek:

* Clownfish: A bohóchal 1 grammot hízik etetéskor.
* Tang: A tang 1 grammot hízik etetéskor, és rövidtávú-memória zavarban szenvedhet. 
* Kong: A kong 2 grammot hízik etetéskor.

### 2. rész

Az `Aquarium` osztálynak van egy attribútuma, amelyben a halakat tartja nyilván, és van egy konstans
attribútuma, amely megmondja, mekkora az akvárium maximum kapacitása. Legyen ennek az értéke most 20 (deciliter)!

Az `Aquarium`-nak az alábbi metódusai vannak:

* `addFish()`, amivel halakat lehet hozzáadni. A metódus csak abban az esetben adja hozzá az új 
  halat, amennyiben van az akváriumban ehhez megfelelő menniységű víz. Minden halnak 5-5 dl víz élettérre 
  van szüksége. Ha az akváriumhoz új hal már nem adható, akkor a metódus dobjon kivételt!
* `feed()`, ami megeteti az összes halat az akváriumban, és ezzel megnöveli a súlyukat.
* `removeFish(int maxWeight)`, eltávolít minden túlsúlyos halat az akváriumból (ami a megadott paraméternél nagyobb).
* `getStatus()`, ami visszaadja a halak státuszát egy String listában.
* `getNumberOfFishWithMemoryLoss()`, ami visszaadja a memóriazavaros halak számát.
* `isThereFishWithGivenColor(String color)`, ami visszaadja, hogy van-e olyan színű hal az akváriumban, mint a paraméterben megadott.
* `getSmallestFish()`, ami visszaadja az akvárium legkisebb halát.