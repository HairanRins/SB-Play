## Road 0 (une feuille de route Java)

Avant de se lancer dans l'univers de Spring Boot, il est indispensable de posséder des bases solides en Java.
Un socle de connaissances robuste vous permettra de comprendre la "magie" de Spring Boot et d'en tirer le meilleur parti.

Voici une feuille de route Java détaillée, conçue spécifiquement pour vous préparer à aborder Spring Boot.

### Étape 1 : Les Fondamentaux de Java (Le Socle Incontournable)

Cette première étape est cruciale. Ne la survolez pas, même si certains concepts vous semblent simples. Une compréhension profonde ici facilitera tout le reste.

- **Syntaxe de Base et Environnement :**

  - Installation du **JDK (Java Development Kit)**, de préférence une version LTS (Long-Term Support) comme **Java 17 ou 21**. En 2025, Java 21 est la référence.
  - Comprendre le rôle de la **JVM (Java Virtual Machine)**, du JRE et du JDK.
  - Écrire, compiler et exécuter un programme "Hello, World!" en utilisant la ligne de commande (`javac`, `java`).
  - Maîtriser les variables, les types de données primitifs et les opérateurs.

- **Structures de Contrôle :**

  - Conditions : `if`, `else if`, `else`.
  - Instructions `switch` (y compris les "switch expressions" modernes introduites depuis Java 14).
  - Boucles : `for`, `while`, `do-while`, et la boucle `for-each`.

- **Programmation Orientée Objet (POO) - Le Cœur de Java :**

  - **Classes et Objets :** Comprendre la différence entre un plan (classe) et une instance (objet).
  - **Les 4 Piliers de la POO :**
    1.  **Encapsulation :** Cacher les détails d'implémentation (avec les modificateurs d'accès `private`, `public`, `protected`).
    2.  **Héritage :** Créer des hiérarchies de classes (`extends`).
    3.  **Polymorphisme :** La capacité d'un objet à prendre plusieurs formes (`@Override`).
    4.  **Abstraction :** Utiliser des classes abstraites (`abstract`) et des interfaces (`interface`). C'est **fondamental** pour comprendre Spring.
  - **Constructeurs, `this` et `super`**.

- **Structures de Données Essentielles :**

  - **Tableaux (`Array`)**.
  - **Le Framework `Collections` :**
    - `List` (et ses implémentations `ArrayList`, `LinkedList`).
    - `Set` (et ses implémentations `HashSet`, `LinkedHashSet`).
    - `Map` (et ses implémentations `HashMap`, `LinkedHashMap`).
    - Comprendre quand utiliser chaque structure.

- **Gestion des Erreurs :**
  - **Exceptions :** `try`, `catch`, `finally`, `throw`, `throws`.
  - La différence entre les exceptions vérifiées (`checked`) et non vérifiées (`unchecked`).

### Étape 2 : Concepts Intermédiaires (La Clé pour Spring)

Ces concepts sont directement utilisés par Spring Boot au quotidien. Les maîtriser vous fera gagner un temps précieux.

- **Java Moderne (depuis Java 8 jusqu'à 21) :**

  - **Expressions Lambda :** Une syntaxe concise pour les interfaces fonctionnelles. C'est partout dans le code moderne.
  - **API Stream :** Pour le traitement de collections de données de manière déclarative (`filter`, `map`, `collect`, `reduce`). Essentiel pour la manipulation de données.
  - **`Optional` :** Pour gérer élégamment les valeurs potentiellement nulles et éviter les `NullPointerException`.
  - **Records (depuis Java 16) :** Une syntaxe concise pour créer des classes de données immuables (DTOs). Très utilisé avec Spring.
  - **Pattern Matching pour `instanceof` :** Simplifie le casting conditionnel.

- **Génériques (`Generics`) :**

  - Comprendre comment créer des classes et des méthodes qui peuvent travailler avec différents types de données (ex: `List<String>`). C'est la base de Spring Data.

- **Annotations :**

  - Comprendre ce qu'est une annotation (`@Override`, `@Deprecated`). C'est le mécanisme principal sur lequel repose la configuration de Spring Boot (`@Component`, `@Service`, `@Autowired`, etc.).

- **Gestion des Dépendances et Build Tools :**

  - **Maven ou Gradle :** Apprenez les bases de l'un de ces deux outils. Spring Boot les utilise pour gérer les dépendances (les "starters") et construire le projet. Comprenez la structure d'un fichier `pom.xml` (Maven) ou `build.gradle` (Gradle).

- **Principes de Base du Multi-threading :**
  - Comprendre ce qu'est un `Thread`.
  - Connaître les bases de la concurrence (`synchronized`).
  - **Threads Virtuels (Project Loom - Java 21) :** Avoir une compréhension conceptuelle de ce qu'ils apportent en termes de performance pour les applications web, car c'est une fonctionnalité clé exploitée par les versions récentes de Spring Boot.

### Étape 3 : Notions Essentielles pour le Backend

Ces sujets ne sont pas du Java pur, mais sont indispensables dans l'écosystème du développement backend avant de passer à Spring.

- **Bases de Données Relationnelles et SQL :**

  - Connaître les requêtes SQL de base : `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `JOIN`.

- **Protocoles du Web :**

  - Comprendre le fonctionnement de **HTTP/HTTPS** (requêtes, réponses, méthodes GET/POST/PUT/DELETE, codes de statut).

- **Format de Données :**
  - Savoir ce qu'est le **JSON** et comment il est structuré. C'est le format standard pour les API REST.

Une fois que vous êtes à l'aise avec tous les concepts de ces trois étapes, vous n'êtes plus un simple "apprenant Java" ; vous êtes un développeur Java prêt à être productif. **Passer à la roadmap Spring Boot sera alors une étape logique et beaucoup plus fluide.** Vous comprendrez _pourquoi_ Spring fait les choses d'une certaine manière, au lieu de simplement copier-coller du code.
