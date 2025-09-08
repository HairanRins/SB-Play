# Significations importantes

- **`new`** : Crée des instances d'objets ou tableaux en allouant de la mémoire.
- **`String` vs `string`** : `String` est une classe Java pour les chaînes immuables ; `string` n'existe pas en Java.
- **`ArrayList`, `List`, `List.of`** :
  - `ArrayList` : Liste dynamique et mutable (package `java.util`).
  - `List` : Interface pour collections ordonnées, implémentée par `ArrayList`, `LinkedList`, etc.
  - `List.of` : Crée une liste immuable (Java 9+), utile pour données fixes.

## Différences et usage :

- **ArrayList** : Utilisez-la pour une liste dynamique et mutable où vous devez ajouter ou modifier des éléments.

- **List** : Utilisez l'interface `List` pour écrire du code flexible et indépendant de l'implémentation (par exemple, vous pouvez facilement passer de `ArrayList` à `LinkedList`).

- **List.of** : Utilisez-la pour des listes statiques ou immuables, souvent pour des données fixes ou pour passer des collections en lecture seule.