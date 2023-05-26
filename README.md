# Jasmin

![Logo](./doc/images/Logo-defaut.png)

# Installation

1. Cloner le repository

# Qu'il a t-il sous le capot ?

1. [Java jdk-8u202-linux-x64](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
1. [apache maven project](https://maven.apache.org/)
1. [Mysql](https://www.mysql.com/fr/)

# Organisation du code

1. /src/main/java/fr/jasmin/Main.java : Point d'entrée de l'application
1. /src/main/java/fr/jasmin/entity/: Les Pojos et beans
1. /src/main/java/fr/jasmin/common/: Les constantes commun au projet
1. /src/main/java/fr/jasmin/entity/: Les Pojos et beans
1. /src/main/java/fr/jasmin/enums/: Les types enumérés
1. /src/main/java/fr/jasmin/model/connection: Les connexions vers l'extérieur
1. /src/main/java/fr/jasmin/model/interfaces: Les interface s d'acces aux bases de données
1. /src/main/java/fr/jasmin/model/implements: Les class d'acces aux bases de données
1. /src/main/java/fr/jasmin/model/connect: Les class de connexion
1. /src/main/java/fr/jasmin/utils: Les class utilitaires
1. /src/main/resources/ Les fichiers de ressources
1. /src/test/java/fr/jasmin/ Les class de tests unitaire

## branch feature-emile ok

# Web

# problèmes rencontré

## bug JSF (intermitent)

note de projet ;

le bouton n'a pas de listener :

https://stackoverflow.com/questions/22658185/java-lang-classnotfoundexception-javax-faces-webapp-facesservlet

Right click on project properties and follow below steps

"Project Properties" --> "Deployment Assembly", adding "Java Build Path Entries" -> "Maven Dependencies" solves the problem!
