# Exemple : csv-to-bean

## Interêt du projet

Le but du projet est de récupérer le contenu du fichier ```person.csv``` en le plaçant dans un ```CSVReader.java``` de la librairie [openCSV](http://opencv.org/documentation.html). Cette fois-ci, on utilise un stratégie de mapping permise par la classe [HeaderColumnNameTranslateMappingStrategy](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy.html).


On implémente une classe ```Person.java``` et on fait la correspondance entre les colonnes du fichier et les attributs de la classe avec une [HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html). On indique alors le mapping et la classe de conversion à la stratégie.


Finalement, c'est la classe [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) qui permet de convertir le fichier en une liste de d'objets instances de la classe ```Person.java```.

## Contenu du fichier CSV

![IMAGE ALT TEXT HERE](http://blogs.technet.com/cfs-file.ashx/__key/communityserver-blogs-components-weblogfiles/00-00-00-76-18/7140.hsg_2D00_7_2D00_11_2D00_13_2D00_04.png)

## Mise en place du projet

 1. Télécharger le projet ```csv-to-bean``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project``` 
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

On observe alors le résultat suivant :

![IMAGE ALT TEXT HERE](http://help.eclipse.org/luna/topic/org.eclipse.jdt.doc.user/reference/views/console/images/ref-console_view.PNG)