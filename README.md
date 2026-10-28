# Laboratoire 6 – Calculatrice REST avec Spring Boot

## Description du projet

Ce projet consiste à développer un service Web RESTful permettant d'effectuer quatre opérations arithmétiques : l'addition, la soustraction, la multiplication et la division.

L'application a été développée avec Kotlin et Spring Boot. Les différentes opérations sont accessibles à l'aide de requêtes HTTP GET et peuvent être testées à partir de l'interface Swagger UI.

## Technologies utilisées

- Kotlin
- Spring Boot
- Spring Web
- Gradle
- Springdoc OpenAPI (Swagger UI)

## Fonctionnalités

Le service REST offre les quatre opérations suivantes :

| Opération | Méthode HTTP | Endpoint |
|---|---|---|
| Addition | GET | `/calculator/add/{nombre1}/{nombre2}` |
| Soustraction | GET | `/calculator/subtract/{nombre1}/{nombre2}` |
| Multiplication | GET | `/calculator/multiply/{nombre1}/{nombre2}` |
| Division | GET | `/calculator/divide/{nombre1}/{nombre2}` |

Les paramètres `nombre1` et `nombre2` représentent les deux nombres utilisés pour effectuer le calcul.

Une gestion des exceptions a également été ajoutée afin d'empêcher la division par zéro. Dans ce cas, le service retourne une réponse HTTP 400 (Bad Request) accompagnée d'un message d'erreur.

## Installation et exécution

1. Cloner le dépôt GitHub et ouvrir le projet dans Visual Studio Code.
2. Vérifier que Java est installé et que la version utilisée est compatible avec le projet.
3. Ouvrir un terminal à la racine du projet.
4. Exécuter la commande suivante pour démarrer l'application :

   ```powershell
   .\gradlew.bat bootRun
   ```

5. Accéder à Swagger UI à l'adresse suivante :

   http://localhost:8080/swagger-ui.html

## Exemple d'utilisation

Pour effectuer une addition entre 10 et 5, utiliser l'URL suivante :

`http://localhost:8080/calculator/add/10/5`

**Résultat attendu :** `15.0`

Les autres opérations peuvent être testées de la même manière en modifiant l'URL et les valeurs des paramètres.

## Gestion des erreurs

Lorsqu'une division par zéro est demandée, l'application intercepte l'exception et retourne le code HTTP 400 avec le message suivant :

```json
{
  "error": "Cannot divide by zero"
}
```

## Conclusion

Ce laboratoire nous a permis de nous familiariser avec le développement de services Web RESTful à l'aide de Spring Boot et Kotlin, ainsi qu'avec l'utilisation de Swagger UI pour documenter et tester les différentes opérations d'une API.
