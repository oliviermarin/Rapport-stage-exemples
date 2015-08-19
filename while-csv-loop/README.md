# Exemple : while-csv-loop

## Interêt du projet

Le but du projet est de récupérer le contenu du fichier ```person.csv``` en le plaçant dans un ```CSVReader.java``` 
de la librairie [openCSV](http://opencsv.sourceforge.net/). En utilisant sa méthode ```readAll()```, on récupère 
une liste où chaque élément est un tableau de chaines de caractères (= une ligne du fichier CSV).

## Contenu du fichier CSV

![IMAGE ALT TEXT HERE](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/csv-while-loop-file.PNG?raw=true)

## Mise en place du projet

1. Télécharger le projet ```while-csv-loop``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project``` 

![import project](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/import-project.png?raw=true)

2. Importer les librairies contenues dans le dossier le dossier ```Jar``` en se rendant dans le ```Java Build Path``` du projet puis ```Add External Jar```

![se rendre dans les librairies](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/conf-build-path.png?raw=true)

![ajouter les librairies](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/ext-lib.png?raw=true)

3. Se rendre dans la classe ```MainService.java``` du package ```csv.loop.service```
4. Modifier le ```filePath``` suivant l'emplacement local du fichier ```person.csv``` 

```java
private final static String filePath = "path/rapport-stage-exemples/while-csv-loop/file/person.csv";
```
5. Lancer le service principal ```MainService.java```

## Résultat

On observe alors le résultat suivant :

![résultat en console](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/console-csv-while-loop.PNG?raw=true)

:bulb: **Résultat :** La liste d'objets affichée en console correspond bien à celle présente dans le fichier ```person.csv```.