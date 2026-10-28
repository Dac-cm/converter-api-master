# Laboratoire 6 – Calculatrice REST avec Spring Boot

## 1. Description du projet

Ce projet consiste à développer un service Web RESTful permettant d'effectuer quatre opérations arithmétiques : l'addition, la soustraction, la multiplication et la division.

L'application a été développée avec Kotlin et Spring Boot. Les différentes opérations sont accessibles à l'aide de requêtes HTTP GET et peuvent être testées à partir de l'interface Swagger UI.

## 2. Technologies utilisées

- Kotlin
- Spring Boot
- Spring Web
- Gradle
- Springdoc OpenAPI (Swagger UI)
- Visual Studio Code

## 3. Fonctionnalités

Le service REST offre les quatre opérations suivantes :

| Opération | Méthode HTTP | Endpoint |
|---|---|---|
| Addition | GET | `/calculator/add/{nombre1}/{nombre2}` |
| Soustraction | GET | `/calculator/subtract/{nombre1}/{nombre2}` |
| Multiplication | GET | `/calculator/multiply/{nombre1}/{nombre2}` |
| Division | GET | `/calculator/divide/{nombre1}/{nombre2}` |

Les paramètres `nombre1` et `nombre2` représentent les deux nombres utilisés pour effectuer le calcul. Ils acceptent des valeurs numériques de type `Double`, ce qui permet notamment d'utiliser des nombres décimaux.

Une gestion des exceptions a également été ajoutée afin d'empêcher la division par zéro. Dans ce cas, le service retourne une réponse HTTP 400 (Bad Request) accompagnée d'un message d'erreur.

## 4. Installation et exécution

1. Cloner le dépôt GitHub et ouvrir le projet dans Visual Studio Code.
2. Vérifier que Java est installé et que sa version est compatible avec le projet Spring Boot.
3. Ouvrir un terminal à la racine du projet.
4. Exécuter la commande suivante pour démarrer l'application :

   ```powershell
   .\gradlew.bat bootRun
   ```

5. Attendre le démarrage du serveur Spring Boot sur le port 8080.
6. Accéder à Swagger UI à l'adresse suivante :

   http://localhost:8080/swagger-ui/index.html

**Remarque :** Le terminal reste en cours d'exécution tant que le serveur Spring Boot est actif. Pour arrêter l'application, utiliser `Ctrl + C`.

## 5. Exemple d'utilisation

Pour effectuer une addition entre 10 et 5, utiliser l'URL suivante :

`http://localhost:8080/calculator/add/10/5`

**Résultat attendu :** `15.0`

Les autres opérations peuvent être testées de la même manière en modifiant l'URL et les valeurs des paramètres.

## 6. Documentation et tests de l'API

La documentation de l'API est générée automatiquement à l'aide de Springdoc OpenAPI et accessible à partir de Swagger UI.

L'interface présente les quatre opérations disponibles, les paramètres nécessaires et les réponses retournées par le serveur.

La documentation a également été personnalisée avec le titre « Calculatrice REST - Laboratoire 6 », une description du service et le numéro de version 1.0.0.

**Pour tester une opération :**

1. Démarrer l'application Spring Boot.
2. Accéder à `http://localhost:8080/swagger-ui/index.html`.
3. Sélectionner l'une des quatre opérations disponibles.
4. Cliquer sur **Try it out** et saisir les valeurs de `nombre1` et `nombre2`.
5. Cliquer sur **Execute** pour envoyer la requête HTTP GET.
6. Vérifier le code de réponse HTTP ainsi que le résultat retourné.

## 7. Gestion des erreurs

Lorsqu'une division par zéro est demandée, l'application intercepte l'exception et retourne le code HTTP 400 (Bad Request) avec le message suivant :

```json
{
  "error": "Cannot divide by zero"
}
```

Cette gestion des exceptions permet de retourner une réponse explicite lorsqu'une opération invalide est demandée.

## 8. Conclusion

Ce laboratoire nous a permis de mettre en pratique le développement de services Web RESTful avec Kotlin et Spring Boot. Nous avons implémenté quatre opérations arithmétiques accessibles par des requêtes HTTP GET, ajouté une gestion des exceptions pour la division par zéro et utilisé Swagger UI pour documenter et tester notre API.
