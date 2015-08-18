# Exemples du rapport de stage

![logo telecom](https://www.telecom-st-etienne.fr/images/logos/logo_tse.png)

## Description du répertoire

Vous trouverez dans ce répertoire les exemples d'implémentation décris dans mon rapport de stage. Les fichiers et les libraries sont également disponibles dans les différents exemples.

## Exemples présents sur le répertoire

* [while-loop-csv-loop](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/while-csv-loop) : Utilisation de la librairie [openCSV](http://opencsv.sourceforge.net/) pour récupérer le contenu d'un fichier csv à l'aide de la méthode ```readAll()``` de la classe ```CSVReader.java```.


* [csv-to-bean](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/csv-to-bean) : Nouvelle utilisation de la librairie  [openCSV](http://opencsv.sourceforge.net/) pour faire muter les lignes du fichier immédiatement en objets grâce à une stratégie de mapping.


* [csv-to-bean-sql](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/csv-to-bean-sql) : Mutation rapide des données grâce à la stratégie de mapping et l'implémentation d'une dao (data access object) avec [JDBC](http://www.cs.mun.ca/~michael/java/jdk1.1.5-docs/guide/jdbc/getstart/introTOC.doc.html).

	+ ligne du fichier CSV
	+ objet java
	+ entrée dans une table SQL


* [csv-to-bean-hibernate](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/csv-to-bean-hibernate) : Exemple de mutation de données cette fois-ci avec [Hibernate](http://docs.jboss.org/hibernate/orm/3.5/reference/fr-FR/html/).


* [quartz-scheduler-project](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/quartz-scheduler-project) : Réutilisation simple de la fonctionnalité du framework permettant d'ordonnancer une tâche. Elle s'appuie notamment sur [Quartz API](http://quartz-scheduler.org/documentation).
