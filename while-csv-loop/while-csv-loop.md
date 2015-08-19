# Exemple : while-csv-loop

## Interêt du projet

Le but du projet est de récupérer le contenu du fichier ```person.csv``` en le plaçant dans un ```CSVReader.java``` 
de la librairie [openCSV](http://opencv.org/documentation.html). En utilisant sa méthode ```readAll()```, on récupère 
une liste où chaque élément est un tableau de chaines de caractères (= une ligne du fichier CSV).

## Contenu du fichier CSV

![IMAGE ALT TEXT HERE](http://blogs.technet.com/cfs-file.ashx/__key/communityserver-blogs-components-weblogfiles/00-00-00-76-18/7140.hsg_2D00_7_2D00_11_2D00_13_2D00_04.png)

## Mise en place du projet

 1. Télécharger le projet ```while-csv-loop``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project``` 
 2. Importer les librairies contenues dans le dossier le dossier ```Jar``` en se rendant dans le ```Java Build Path``` du projet puis ```Add External Jar```

![IMAGE ALT TEXT HERE](http://wiki.lwjgl.org/images/1/15/Eclipse3.png)

 3. Se rendre dans la classe ```MainService.java``` du package ```csv.loop.service```
 4. Modifier le ```filePath``` suivant l'emplacement local du fichier ```person.csv``` 

```java
private final static String filePath = "path/person.csv";
```
5. Lancer le service principal ```MainService.java```

## Résultat

On observe alors le résultat suivant :

![IMAGE ALT TEXT HERE](http://help.eclipse.org/luna/topic/org.eclipse.jdt.doc.user/reference/views/console/images/ref-console_view.PNG)