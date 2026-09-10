# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer.
Oppgaven er levert av følgende studenter:
* elbih9230, elbih9230@oslomet.no


## Oppgavebeskrivelser

### Oppgave 0
I oppgave 0 lagde jeg metoden `gruppeMedlemmer()`.
Metoden skal returnere antall personer som arbeider på gruppen.
Returtypen er `int`, siden antall gruppemedlemmer er et heltall.
Siden jeg arbeider alene, returnerer metoden verdien 1.

### Oppgave 1
I oppgave 1 lagde jeg metoden `maks(int[] a)` som finner den største verdien i en tabell.
Jeg sammenligner to nabotall om gangen og bytter plass dersom tallet til venstre er størst.
På denne måten flyttes den største verdien til slutten av tabellen og kan returneres.
Metoden `ombyttinger(int[] a)` bruker samme algoritme, men teller hvor mange ombyttinger som blir gjort.
Hvis tabellen er tom, kaster `maks()` en `NoSuchElementException`.

### Oppgave 2
I oppgave 2 lagde jeg en metode som teller antall ulike verdier i en sortert tabell.
Først går jeg gjennom tabellen og sjekker at alle verdiene er sortert stigende.
Deretter sammenligner jeg hvert element med det forrige og teller nye verdier.
Hvis tabellen ikke er sortert, kaster metoden en `IllegalStateException`.
Hvis tabellen er tom, returnerer metoden 0.

### Oppgave 3
I oppgave 3 lagde jeg en metode som teller antall ulike verdier i en usortert tabell.
For hvert element går jeg gjennom de tidligere elementene og sammenligner verdiene.
Hvis den samme verdien finnes fra før, blir den ikke lagt til i antallet.
Hvis verdien ikke finnes fra før, øker jeg telleren med en.
Metoden bruker ingen hjelpetabell og endrer ikke den originale tabellen.

### Oppgave 4
I oppgave 4 lagde jeg en metode som sorterer en bestemt del av en heltallstabell.
Metoden sorterer fra indeks `fra` til indeks `til`, der `til` ikke er inkludert.
Før sorteringen sjekker jeg at indeksene ligger innenfor grensene til tabellen.
Hvis grensene er ugyldige, kaster metoden en `IndexOutOfBoundsException`.
Hvis intervallet er tomt, gjør metoden ingen endringer i tabellen.

### Oppgave 5
I oppgave 5 lagde jeg en metode som deler tabellen i oddetall og partall.
Oddetallene flyttes til venstre side, mens partallene flyttes til høyre side.
Deretter bruker jeg `sorter`-metoden til å sortere de to delene hver for seg.
Metoden fungerer også dersom tabellen inneholder både positive og negative tall.
Tomme tabeller og tabeller med bare oddetall eller partall fungerer også.

### Oppgave 6
I oppgave 6 lagde jeg en metode som roterer en `char`-tabell et steg mot høyre.
Først lagrer jeg det siste elementet slik at verdien ikke forsvinner under flyttingen.
Deretter flytter jeg alle de andre elementene en plass mot høyre i tabellen.
Til slutt legger jeg det lagrede elementet på den første plassen i tabellen.
Hvis tabellen har null eller et element, gjør metoden ingen endringer.

### Oppgave 8
I oppgave 8 lagde jeg to metoder som brukes til å flette sammen flere strenger.
Den første metoden henter annenhver bokstav fra hver av de to strengene.
Hvis strengene har ulik lengde, blir de resterende tegnene lagt til bakerst.
Den andre metoden går gjennom flere strenger og henter et tegn fra hver etter tur.
Tomme eller oppbrukte strenger hoppes over før resultatet returneres som en ny streng.