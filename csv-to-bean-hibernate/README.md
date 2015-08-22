# Exemple : csv-to-bean-hibernate

## Interêt du projet

La stratégie de mapping permise par les classes [HeaderColumnNameTranslateMappingStrategy](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy.html) et [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) de la librairie [openCSV](http://opencv.org/documentation.html) est de nouveau utilisée (cf le projet [csv-to-bean](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/csv-to-bean) pour plus de précisions).


On y ajoute un [dao](http://cyrille-herby.developpez.com/tutoriels/java/mapper-sa-base-donnees-avec-pattern-dao/) pour sauvegarder les entités récupérées du fichier ```person.csv```. La persistance des objets est assurée par [Hibernate](http://docs.jboss.org/hibernate/orm/3.5/reference/fr-FR/html/).


> :memo: **memo** : Ce mini-projet est la deuxième implémentation du principe de mutation rapide des données. La stratégie de mapping permettait déjà de générer les objets. Hibernate permet de générer les entrées dans la table. 

## Contenu du fichier CSV

![contenu du fichier csv](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/csv-to-bean-file.PNG?raw=true)

### Configuration d'Hibernate

Le fichier ```hibernate.cfg.xml``` permet de renseigner entre autres : 

1. le dialecte du SGBD utilisé : spécificités liées au SGBD choisi. 
2. L'implémentation du JDBC dédié à l'interaction avec le SGBD choisi.
3. Les paramétres de connexion à la base de données (user, pass, url)
4. Les classes mappées avec leurs classes associées.

![configuration d'hibernate](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/hibernate-cfg.png?raw=true)

Le fichier ```Person.hbm.xml``` permet de : 

1. Créer et mettre à jour la table ```PERSON``` liée à la classe ```Person.java```.
2. Générer les méthodes telles que save, get, delete, update pour une instance de la ```Person.java```.
3. etc...

![mapping de la classe person](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/classe-person-mapping.png?raw=true)

### Construction de la table PERSON

Sous [MySQL Workbench](http://dev.mysql.com/downloads/workbench/), Créer une base de données ```account_database```.

:paperclip: Dans ce projet, on fait en sorte que la table ```person``` soit générée automatiquement au lancement de l'application. Pour cela, se rendre dans le fichier de configuration ```hibernate.cfg.xml``` et décommenter la ligne :

```xml
<property name="hbm2ddl.auto">create</property>
```

:paperclip: On utilise cette propriété au premier lancement de l'application lorsque la table n'existe pas. Si la table est amenée à évoluer, on utilisera la propriété :

```xml
<property name="hbm2ddl.auto">update</property>
```

:memo: **memo :** créer un utilisataur de la base dont le login et le mot de passe est ```root``` pour les deux. 

:books: **remarque :** La génération de la table ```person``` est possible grâce au fichier mapping ```Person.hbm.xml``` qui fait le lien entre la structure de la table et celle de la classe.   

### Mise en place du projet sous eclipse

1. Télécharger le projet ```csv-to-bean-hibernate``` et l'importer sous ```Eclipse``` en tant que simple ```Java Project```. 

![import project](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/import-project.png?raw=true)

2. Importer les librairies contenues dans le dossier le dossier ```Jar``` en se rendant dans le ```Java Build Path``` du projet puis ```Add External Jar```

![hibernate external lib](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/hibernate-ext-lib.png)

3. Se rendre dans la classe ```MainService.java``` du package ```csv.to.bean.service```
4. Modifier le ```filePath``` suivant l'emplacement local du fichier ```person.csv``` 

```java
private final static String filePath = "path/rapport-stage-exemples/csv-to-bean-hibernate/file/person.csv";
```
5. Lancer le service principal ```MainService.java```

:children_crossing: Attention : Il faut bien utiliser le fichier ```person.csv```  contenu dans le dossier ```file``` de ```csv-to-bean-hibernate```.   

## Résultat

:chart_with_downwards_trend: **Résultat :** pour le parsage du fichier :

![résultat du parsage du fichier](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/hibernate-ext-lib.png?raw=true)

:chart_with_downwards_trend: **Résultat :** pour la gestion de la persistance d'une donnée (1ère ligne du csv) par Hibernate.

![résultat de la persistance d'une donnée](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/hibernate-ext-lib.png?raw=true)

:chart_with_downwards_trend: **Résultat :** pour l'insertion dans la table ```PERSON``` des données :

![données en base](https://github.com/oliviermarin/rapport-stage-exemples/blob/master/images/hibernate-ext-lib.png?raw=true)

:heavy_plus_sign: **Plus :** On constate que la préparation des requêtes SQL n'est plus assuré par le code métier par directement par Hibernate. Ceci allège considérablement les dao.