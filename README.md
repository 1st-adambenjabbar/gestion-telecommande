# TP1 — Gestion de télécommande

Le dépôt contient les étapes de conception demandées dans l’énoncé.

## Version 1 — avant l’ajout de la Hi-Fi

Dossier : [`version-1-sans-hifi/src`](version-1-sans-hifi/src)

Fichiers : `Lampe.java`, `Telecommande.java`, `Main.java`.

La télécommande contrôle uniquement des lampes.

## Version 2 — après l’ajout de la Hi-Fi

Dossier : [`version-2-avec-hifi/src`](version-2-avec-hifi/src)

Fichiers : `Lampe.java`, `Hifi.java`, `Telecommande.java`, `Main.java`.

La classe `Telecommande` a été modifiée directement pour gérer séparément les lampes et les chaînes Hi-Fi avec `ajouterHifi`, `activerHifi` et `desactiverHifi`.

## Version 3 — conception généralisée avec Appareil.java

Dossier : [`version-3-generalisee/src`](version-3-generalisee/src)

Fichiers : `Appareil.java`, `Lampe.java`, `Hifi.java`, `Television.java`, `Telecommande.java`, `Main.java`.

`Appareil.java` définit l’interface commune `allumer()` / `eteindre()`. `Lampe`, `Hifi` et `Television` l’implémentent. `Telecommande` utilise alors une seule `List<Appareil>` et n’a plus besoin d’être modifiée pour chaque nouvel appareil.

Cette troisième version correspond aux questions 8 et 9 de l’énoncé.

## Compilation

Avec un JDK installé :

```bash
javac -d version-1-sans-hifi/bin version-1-sans-hifi/src/*.java
javac -d version-2-avec-hifi/bin version-2-avec-hifi/src/*.java
javac -d version-3-generalisee/bin version-3-generalisee/src/*.java
```

Exécution :

```bash
java -cp version-1-sans-hifi/bin Main
java -cp version-2-avec-hifi/bin Main
java -cp version-3-generalisee/bin Main
```
