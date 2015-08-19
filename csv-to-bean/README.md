# Exemple : csv-to-bean

## Interêt du projet

Le but du projet est de récupérer le contenu du fichier ```person.csv``` en le plaçant dans un ```CSVReader.java``` de la librairie [openCSV](http://opencv.org/documentation.html). Cette fois-ci, on utilise un stratégie de mapping permise par la classe [HeaderColumnNameTranslateMappingStrategy](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy.html).


On implémente une classe ```Person.java``` et on fait la correspondance entre les colonnes du fichier et les attributs de la classe avec une [HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html). On indique alors le mapping et la classe de conversion à la stratégie.


Finalement, c'est la classe [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) qui permet de convertir le fichier en une liste de d'objets instances de la classe ```Person.java```.

## Contenu du fichier CSV

:mag_right: **contenu :** A la difference du projet précédant, le fichier ```person.csv``` ne contient plus la date de naissance des personnes mais leur âge. Cela signifie que la classe ```Person.java``` ne contiendra plus un attribut de type [Date](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html) mais de type [Integer](http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html).

![contenu du fichier csv](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/csv-to-bean-file.PNG?raw=true)

## Mise en place du projet

1. Télécharger le projet ```csv-to-bean``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project``` 

![import project](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/import-project.png?raw=true)

2. Importer les librairies contenues dans le dossier le dossier ```Jar``` en se rendant dans le ```Java Build Path``` du projet puis ```Add External Jar```

![import a java project](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/conf-build-path.png?raw=true)

![csv to bean library](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/ext-lib-csv-to-bean.png?raw=true)

3. Se rendre dans la classe ```MainService.java``` du package ```csv.loop.service```
4. Modifier le ```filePath``` suivant l'emplacement local du fichier ```person.csv``` 

```java
private final static String filePath = "path/rapport-stage-exemples/csv-to-bean/file/person.csv";
```
5. Lancer le service principal ```MainService.java```

:children_crossing: Attention : Il faut bien utiliser le fichier ```person.csv```  contenu dans le dossier ```file``` de ```csv-to-bean```.   

## Résultat

:chart_with_downwards_trend: **Résultat :** Les objets dynamiquement par l'intance de la classe [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) correspondent bien à ceux du fichier ```person.csv```. En se référant à l'implémentation de la classe ```Person.java```, on notera que l'intance de la [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) a pris soin de bien caster l'âge en [Integer](http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html). 

![IMAGE ALT TEXT HERE](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/csv-to-bean-console.png?raw=true)

:heavy_plus_sign: **Plus :** On notera qu'il n'y a plus besoin d'itérer sur le ```CSVReader.java``` comme c'était le cas dans l'exemple précédant.