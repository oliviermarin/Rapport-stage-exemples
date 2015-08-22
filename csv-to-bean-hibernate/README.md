# Exemple : csv-to-bean-hibernate

## Interêt du projet

La stratégie de mapping permise par les classes [HeaderColumnNameTranslateMappingStrategy](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy.html) et [CsvToBean](http://javadox.com/net.sf.opencsv/opencsv/2.3/au/com/bytecode/opencsv/bean/CsvToBean.html) de la librairie [openCSV](http://opencv.org/documentation.html) est de nouveau utilisée (cf le projet [csv-to-bean](https://github.com/oliviermarin/rapport-stage-exemples/tree/master/csv-to-bean) pour plus de précisions).


On y ajoute un [dao](http://cyrille-herby.developpez.com/tutoriels/java/mapper-sa-base-donnees-avec-pattern-dao/) pour sauvegarder les entités récupérées du fichier ```person.csv```. La persistance des objets est assurée par [Hibernate](http://docs.jboss.org/hibernate/orm/3.5/reference/fr-FR/html/).


> :memo: **memo** : Ce mini-projet est la deuxième implémentation du principe de mutation rapide des données. La stratégie de mapping permettait déjà de générer les objets. Hibernate permet de générer les entrées dans la table. 

## Contenu du fichier CSV

![IMAGE ALT TEXT HERE](http://blogs.technet.com/cfs-file.ashx/__key/communityserver-blogs-components-weblogfiles/00-00-00-76-18/7140.hsg_2D00_7_2D00_11_2D00_13_2D00_04.png)

## Mise en place

### Mise en place de la table

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

![IMAGE ALT TEXT HERE](http://wiki.lwjgl.org/images/1/15/Eclipse3.png)

 3. Se rendre dans la classe ```MainService.java``` du package ```csv.to.bean.service```
 4. Modifier le ```filePath``` suivant l'emplacement local du fichier ```person.csv``` 

```java
private final static String filePath = "path/person.csv";
```
5. Lancer le service principal ```MainService.java```

:children_crossing: Attention : Il faut bien utiliser le fichier ```person.csv```  contenu dans le dossier ```file``` de ```csv-to-bean-hibernate```.   

## Résultat

:chart_with_downwards_trend: **Résultat :** pour le parsage du fichier :

![IMAGE ALT TEXT HERE](http://help.eclipse.org/luna/topic/org.eclipse.jdt.doc.user/reference/views/console/images/ref-console_view.PNG)

:chart_with_downwards_trend: **Résultat :** pour la table :

![IMAGE ALT TEXT HERE](http://origin-symwisedownload.symantec.com/library/BUSINESS/TECH199666/workbench.png)