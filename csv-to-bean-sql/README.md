# Exemple : csv-to-bean-sql

## Interêt du projet

La stratégie de mapping permise par les classes [HeaderColumnNameTranslateMappingStrategy](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy.html) et [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) de la librairie [openCSV](http://opencv.org/documentation.html) est de nouveau utilisée (cf le projet [csv-to-bean](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/csv-to-bean) pour plus de précisions).


On y ajoute un [dao](http://cyrille-herby.developpez.com/tutoriels/java/mapper-sa-base-donnees-avec-pattern-dao/) pour sauvegarder les entités récupérées du fichier ```person.csv```. La persistance des objets est assurée par l'[API JDBC](http://docs.oracle.com/javase/tutorial/jdbc/basics/index.html) et le langage [SQL](http://sql.sh/).


:memo: **memo** : Ce mini-projet est une première implémentation du principe de mutation rapide des données. 

## Contenu du fichier CSV

![contenu du fichier CSV](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/csv-to-bean-file.PNG?raw=true)

## Mise en place

### Mise en place de la table

Sous [MySQL Workbench](http://dev.mysql.com/downloads/workbench/), procéder aux étapes suivantes :

1. Créer une base de données ```account_database```

```sql
CREATE SCHEMA `account_database` DEFAULT CHARACTER SET utf8 ;
```

2. Créer la table ```PERSON```

```sql
CREATE TABLE PERSON(
PERSON_ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
FIRSTNAME VARCHAR(30) NOT NULL,
LASTNAME VARCHAR(30) NOT NULL,
AGE INT NOT NULL
)
```
:children_crossing: **memo** : créer un utilisataur de la base dont le login et le mot de passe est ```root``` pour les deux. 

### Mise en place du projet sous eclipse

1. Télécharger le projet ```csv-to-bean-sql``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project``` 
2. Importer les librairies contenues dans le dossier le dossier ```Jar``` en se rendant dans le ```Java Build Path``` du projet puis ```Add External Jar```

![csv to bean sql lib](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/csv-to-bean-sql-lib.PNG?raw=true)

3. Se rendre dans la classe ```MainService.java``` du package ```csv.loop.service```
4. Modifier le ```filePath``` suivant l'emplacement local du fichier ```person.csv``` 

```java
private final static String filePath = "path/rapport-stage-exemples/csv-to-bean-sql/file/person.csv";
```
5. Lancer le service principal ```MainService.java```

:children_crossing: Attention : Il faut bien utiliser le fichier ```person.csv```  contenu dans le dossier ```file``` de ```csv-to-bean```.   

## Résultat

Résultat pour le parsage du fichier :

![resultat console](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/result-console-csv-to-bean-sql.PNG)

Resultat pour la table :

![table SQL obtenue](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/table-person-csv-to-bean-sql.png)