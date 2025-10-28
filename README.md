# GestioneDipendenti

![Java](https://img.shields.io/badge/Language-Java-orange)
![GitHub last commit](https://img.shields.io/github/last-commit/damianisilvia/GestioneDipendenti)
![License](https://img.shields.io/badge/License-MIT-green)

Progetto Java per la gestione dei dipendenti di un’azienda, con calcolo dello stipendio per:

- Manager
- Operai
- Sviluppatori

## Struttura del progetto

Tutte le classi si trovano nella cartella `src/`:

- `Dipendente.java` – classe astratta base
- `Manager.java` – classe Manager con stipendio e bonus
- `Operaio.java` – classe Operaio con calcolo stipendio per ore lavorate
- `Sviluppatore.java` – classe Sviluppatore con bonus
- `Azienda.java` – contiene i dipendenti e calcola la spesa mensile
- `GestioneDipendenti.java` – main di esempio con stampa stipendi
- `TestFormat.java` – test formattazione Euro
- `Costant.java` – costante MENSILITA
- `Main.java` – main alternativo pronto per esecuzione

## Come compilare ed eseguire

Dal terminale nella cartella principale del progetto:

```bash
javac src/*.java
java src.Main

Oppure apri il progetto in un IDE come IntelliJ IDEA o Eclipse e lancia Main.java.
