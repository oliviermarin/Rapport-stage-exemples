# Exemple : quartz-scheduler-project

## Interêt du projet

:mag_right: **Description :** Java fournit nativement une solution d'ordonnancement ([Thread](http://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html)). Toutefois, elle n'est pas assez évoluée pour executer une tâche pour une date ou encore un jour donné. Pour requérir à ce besoin, on a décidé d'utiliser [Quartz Scheduler](http://quartz-scheduler.org/).

![Quartz Scheduler](http://quartz-scheduler.org/images/logos/logo-quartz-scheduler.png)

Ce mini projet a pour but de faire une démonstration de [Quartz Scheduler](http://quartz-scheduler.org/). Les 3 principales classes permettant de faire de l'ordonnancement sont :

1. ```Job.java``` : tâche à réaliser
2. ```Trigger.java``` : déclencher la tâche suivant une commande CRON 
3. ```Scheduler.java``` : associer un ou plusieurs déclencheurs à une tâche

:heavy_check_mark: **Objectif :** Le but ici n'est de lancer une tâche toute les minutes comme l'aurait permit un [Thread](http://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html) classique. C'est de lancer la tâche au début de chaque minute système. 

## Mise en place du projet sous eclipse

1. Télécharger le projet ```quartz-scheduler-project``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project```. 
2. Importer les librairies contenues dans le dossier le dossier ```quartz``` en se rendant dans le ```Java Build Path``` du projet puis ```Add External Jar```

![se rendre dans les librairies](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/conf-build-path.png?raw=true)

![IMAGE ALT TEXT HERE](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/ext-lib-qtz-schlr.png?raw=true)

3. Se rendre dans la classe ```MainService.java``` du package ```quartz.scheduler.project.service```
4. Lancer le service principal ```MainService.java```   

## Résultat

:chart_with_downwards_trend: **Résultat :** En observant les logs de la console, on voit que la méthode ```execute()``` de la classe ```SayHelloJob.java``` est bien appelée en début de chaque minute de l'heure système.

![IMAGE ALT TEXT HERE](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/console-quartz-scheduler-project.PNG?raw=true)
