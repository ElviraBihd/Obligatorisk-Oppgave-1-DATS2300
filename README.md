# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer.
Oppgaven er levert av følgende studenter:
* elbih9230, elbih9230@oslomet.no


## Oppgavebeskrivelser

### Oppgave 0
I oppgave 0 lagde jeg metoden gruppeMedlemmer() som skal returnere en verdi av typen int som samsvarer antallet personer på teamet.

### Oppgave 1
I oppgave 1 lagde jeg metoden maks(int[] a) som finner den største verdien i en tabell. Jeg sammenligner to nabotall om gangen og bytter plass hvis tallet til venstre er størst. Slik flyttes den største verdien til slutten av tabellen, og returneres. Hvis tabellen er tom, kastes en NoSuchElementException.

### Oppgave 2
I oppgave 2 teller vi hvor mange ulike verdier det er i en sortert tabell. Først sjekker vi at tabellen er sortert stigende. Deretter sammenligner vi hvert element med det forrige og øker telleren når verdiene er forskjellige. Hvis tabellen ikke er sortert, kastes en `IllegalStateException`. En tom tabell returnerer 0.

### Oppgave 3
I oppgave 3 teller vi hvor mange ulike verdier det er i en usortert tabell. For hvert element sjekker vi om den samme verdien finnes tidligere i tabellen. Hvis verdien ikke er funnet tidligere, øker vi telleren. Vi bruker ingen hjelpetabell og endrer ikke innholdet i den originale tabellen. Til slutt returneres antall forskjellige verdier.

### Oppgave 4
I oppgave 4 lager vi en metode som sorterer en bestemt del av en tabell. Metoden sorterer elementene fra indeks `fra` til, men ikke med, indeks `til`. Sorteringen skal gjøres uten bruk av hjelpetabeller og må være effektiv også for store tabeller. Hvis `fra` eller `til` er utenfor de gyldige grensene, kastes en `IndexOutOfBoundsException`.

### Oppgave 5
I oppgave 5 deler vi tabellen i oddetall og partall. Alle oddetall skal ligge først i tabellen og alle partall skal ligge etter dem. Deretter bruker vi `sorter`-metoden fra oppgave 4 til å sortere begge delene. Metoden skal også fungere for tomme tabeller, negative tall og tabeller med bare oddetall eller partall.

### Oppgave 6
I oppgave 6 roterer vi elementene i en `char`-tabell ett steg mot høyre. Det siste elementet flyttes til starten, mens resten av elementene forskyves en plass mot høyre. For eksempel blir `{A, B, C, D}` til `{D, A, B, C}`. Hvis tabellen er tom eller bare inneholder ett element, skal metoden ikke gjøre noe.

### Oppgave 8