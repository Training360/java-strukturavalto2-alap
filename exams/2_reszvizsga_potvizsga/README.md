# Vizsgafeladat
A feladatok megoldásához az IDEA fejlesztőeszközt használd! Bármely régebbi osztályt megnyithatsz.

Új repository-ba dolgozz! Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztek). Projekt, könyvtár,
repository neve legyen: `sv2-2021-jvjbf-masodik-reszvizsga-potvizsga`. GroupId: `training360`, artifactId: `sv2-2021-jvjbf-masodik-reszvizsga-potvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes
feladathoz tartoznak  előre elkészített teszt osztályok. Ezekkel a megoldásod helyességét ellenőrizheted.

A feladatra 3 órád van összesen!

Ha letelik az idő, mindenképp commitolj, akkor is, ha nem vagy kész! A commit időpontja alapján fogjuk
ellenőrizni a megoldásod. Ha nincs commitod az idő lejárta előtt, akkor sajnos nem tudjuk értékelni a megoldásod!

## Mondatok (16 pont)
Készíts egy `algorithms.Sentences` nevű osztályt, melyben egy lista található, benne mondatokkal. Legyen
egy `addSentence(String sentence)` nevű metódusa, amiben arra kell figyelned, hogy csak mondatot lehet a listához
adni. Mondatról akkor beszélünk, ha nagybetűvel kezdődik és a végén mondatvégi írásjel található (.,?,!) 
Ha valamelyik nem teljesül, dobj `IllegalArgumentException`-t,
a hibának megfelelő üzenettel!<br>

Mindezek után írj egy metódust, ami megkeresi a leghosszabb mondatot a listában! Ha több ilyen van akkor az elsőt.

## File szűrés (20 pont)
Adott a `products.csv` állomány. Ebben pontosvesszővel elválasztva szerepel soronként egy-egy termék azonosítója,neve és ára. 
A feladat az, hogy olvasd be a file tartalmát, majd egy új fájlba írd ki azokat a termékeket, amik egy paraméterül kapott 
árnál drágábbak. Csomag, osztályok, attribútumok és metódusok elnevezését a tesztosztály alapján valósítsd meg!

## Vizsga 1. rész (30 pont)
A következő osztályokat az `exams` comagba készítsd el.<br>

Készíts egy `ExamResult` nevű enumot a következő értékekkel: `PASSED,NOT_PASSED,OK,PERFECT`. <br>

Készítsd el az `Exam` nevű osztályt, úgy, hogy ne lehessen azt példányosítani! 
Minden vizsgának legyen egy `long studentId`, `String topic` és egy `int maxPoints`.
nevű attribútuma. Az osztálynak két konstruktora van, az egyikben minden értéket be lehet állítani, 
a másik csak egy azonosítót és egy témát kap. Ezeken kívül még legyen egy `ExamResult examResult`
 nevű attribútuma. Ezt nem konstruktorban állítjuk be, hanem a következő metódus és setter segítségével.<br>
Legyen továbbá egy `void calculateExamResult(int actualPoints)` nevű metódusa, aminek nincsen törzse. 
Majd a különböző megvalósításoknál figyeljünk arra, hogy a paraméter 0 és maxpont között legyen!<br>

Készítsd el a `MultipleChoiceExam` (feleletválasztós vizsga) osztályt, mely a vizsgából származik. 
Ezen vizsgákban a konstruktorok úgy működnek mint a szülő osztályban.<br>
A vizsgának két kimenete lehet `PASSED` vagy `NOT_PASSED`, vagyis átment vagy nem ment át. A határ 51 százalék! 
Ennek alapján állítsd be az`examResult` attribútumot.<br>

Készíts egy `PracticeExam` (gyakorlati vizsga) osztályt, mely szintén a vizsgából származik. Itt nem kapjuk 
meg a maximumpontot, helyette egy egész számokból
álló listát kapunk a konstruktorban, ami megmondja, hogy feladatonként hány pontot lehetett elérni. 
Ennek segítségével állítsuk be a maximum pontszámot a konstruktorban,
de figyeljünk arra, hogy ebben az esetben a maximumpont 10 és 150 között kell, hogy legyen.<br>
A gyakorlati vizsgánál az eredmény háromféle lehet: `NOT_PASSED,OK,PERFECT` vagyis, nem ment át, 
oké, vagy tökéletes. A százalék határok
51 és 76 százalék. Ennek alapján állítsd be az`examResult` attribútumot. <br>

Készítsd el az `ExamDB` osztályt, ami a vizsgákat tárolja egy listában. Itt legyen egy olyan metódus, 
amivel vizsgát lehet hozzáadni a listához. Ez kapjon egy vizsgát és egy aktuális pontszámot. Először 
számítsuk ki a vizsga eredményét, majd adjuk hozzá a listához. Valamint legyen getter amivel visszaadjuk a lista másolatát!


### Vizsga 2. rész (24 pont)
Egészítsd ki a `ExamDB` osztályt a kövtekező metódusokkal:

* Számold meg, hogy hány darab átment vizsga van a vizsgák között! (`int countPassedExams()`)
* Válogasd ki egy ember azonosítója alapján az összes vizsgáját! (`List<Exam> findById(long studentId)`)
* Szűrd le azokat a listákat amiknek a témája a paraméterül kapott szórészlettel kezdődik! 
  Csak a témakörök nevét add vissza és mindegyik egyszer szerepeljen(`List<String> findTopicByPrefix(String prefix)`)

 
