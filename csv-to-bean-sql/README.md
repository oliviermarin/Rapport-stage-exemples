# Exemple : csv-to-bean-sql

## Interêt du projet

La stratégie de mapping permise par les classes [HeaderColumnNameTranslateMappingStrategy](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy.html) et [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) de la librairie [openCSV](http://opencv.org/documentation.html) est de nouveau utilisée (cf le projet [csv-to-bean](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/csv-to-bean) pour plus de précisions).


On y ajoute un [dao](http://cyrille-herby.developpez.com/tutoriels/java/mapper-sa-base-donnees-avec-pattern-dao/) pour sauvegarder les entités récupérées du fichier ```person.csv```. La persistance des objets est assurée par l'[API JDBC](http://docs.oracle.com/javase/tutorial/jdbc/basics/index.html) et le langage [SQL](http://sql.sh/).


:memo: **memo** : Ce mini-projet est une première implémentation du principe de mutation rapide des données. 

## Contenu du fichier CSV

![IMAGE ALT TEXT HERE](http://blogs.technet.com/cfs-file.ashx/__key/communityserver-blogs-components-weblogfiles/00-00-00-76-18/7140.hsg_2D00_7_2D00_11_2D00_13_2D00_04.png)

## Mise en place

### Mise en place de la table

Sous [MySQL Workbench](http://dev.mysql.com/downloads/workbench/), procéder aux étapes suivantes :

 1. Créer une base de données ```account_database```
 2. Créer la table ```person```

```sql
CREATE TABLE person(
	PERSON_ID INT AUTO_INCREMENT PRIMARY NOT NULL,
    FIRSTNAME VARCHAR(30) NOT NULL,
    LASTNAME VARCHAR(30) NOT NULL,
    AGE INT NOT NULL
)
```
:children_crossing: **memo** : créer un utilisataur de la base dont le login et le mot de passe est ```root``` pour les deux. 

### Mise en place du projet sous eclipse

 1. Télécharger le projet ```csv-to-bean-sql``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project``` 
 2. Importer les librairies contenues dans le dossier le dossier ```Jar``` en se rendant dans le ```Java Build Path``` du projet puis ```Add External Jar```

![IMAGE ALT TEXT HERE](http://wiki.lwjgl.org/images/1/15/Eclipse3.png)

 3. Se rendre dans la classe ```MainService.java``` du package ```csv.loop.service```
 4. Modifier le ```filePath``` suivant l'emplacement local du fichier ```person.csv``` 

```java
private final static String filePath = "path/person.csv";
```
5. Lancer le service principal ```MainService.java```

:children_crossing: Attention : Il faut bien utiliser le fichier ```person.csv```  contenu dans le dossier ```file``` de ```csv-to-bean```.   

## Résultat

Résultat pour le parsage du fichier :

![IMAGE ALT TEXT HERE](http://help.eclipse.org/luna/topic/org.eclipse.jdt.doc.user/reference/views/console/images/ref-console_view.PNG)

Resultat pour la table :

![IMAGE ALT TEXT HERE](http://origin-symwisedownload.symantec.com/library/BUSINESS/TECH199666/workbench.png)