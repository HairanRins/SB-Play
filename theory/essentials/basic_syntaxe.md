# Syntaxe de base

Un programme Java peut être défini comme une collection d’objets qui communiquent via l’invocation des méthodes.
Important : une classe, objet, méthode et variables d’instance.

- **Objet** – Les objets ont des propriétés et des comportements.
  Exemple: Un chien a des propriétés comme la couleur, le nom, etc. ainsi que des comportements comme remuer, aboyer, manger, etc.

  Un objet est une instance d’une classe.
  En Java, une classe, c'est comme une recette de gâteau. La recette explique comment faire le gâteau. Un objet, c'est le gâteau qu'on prépare en suivant cette recette.
  Par exemple, la classe "Gâteau" peut créer des objets comme "gâteau au chocolat" ou "gâteau à la vanille".
  En Java, `instance` est égal à une référence (ou pointeur) vers l'objet créé en mémoire.

En Java, le mot qui se rapproche le plus d'**instance** est **objet**.

Un **objet** est une instance d'une classe. Pensez à une classe comme un plan ou un modèle, et à l'objet comme la chose réelle construite à partir de ce plan. Par exemple, si vous avez une classe nommée `Voiture`, une instance de cette classe pourrait être un objet spécifique comme votre propre voiture, avec sa couleur, son modèle et son année.

---

### Explication plus détaillée

- **Classe** : C'est le modèle. Elle définit les caractéristiques (attributs) et les comportements (méthodes) que tous les objets de ce type auront. Par exemple, une classe `Chien` peut avoir des attributs comme `couleur` et `race`, et une méthode `aboyer()`.

- **Instance (Objet)** : C'est la réalisation concrète de ce modèle. C'est une entité qui a ses propres valeurs pour les attributs définis par la classe. Par exemple, vous pouvez créer deux instances de la classe `Chien` : `monChien`, un caniche noir, et `votreChien`, un labrador marron. Chaque objet est une instance unique de la classe `Chien`.

En résumé, vous créez une **instance** (un **objet**) de la classe pour pouvoir l'utiliser dans votre programme.

---

- **Classe** – Une classe peut être définie comme un modèle qui décrit les comportements ou les états de l’objet.

* **Méthodes** –

  - Une classe peut contenir plusieurs méthodes.
  - Une méthode est un comportement.
  - C’est dans les méthodes où les traitements sont écrites, les données sont manipulées et toutes les actions sont exécutées.

* **Variables d’instance** – Chaque objet possède une variables d’instance. L’état d’un objet est créé par les valeurs affectées à ces variables d’instance.
  Ces variables d’instance peuvent être modifiées par des méthodes.

---

## Premier programme en Java

Regardons un code simple qui va afficher le mot Hello World!.

Exemple :

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Affiche Hello World!
    }
}
```

Regardons maintenant comment enregistrer le fichier, compiler et exécuter le programme.
Veuillez suivre les étapes suivantes :
Ouvrez soit le VS code / NotePad++ / Sublime et ajoutez le code ci-dessus.
Enregistrez le fichier sous la forme: `HelloWorld.java`.
Ouvrez une fenêtre d’invite de commandes et allez dans le répertoire où vous avez enregistré la classe HelloWorld. Supposons que c’est C: .
Tapez `javac HelloWorld.java` et appuyez sur Entrée pour compiler votre code. S’il n’y a pas d’erreurs dans votre code, l’invite de commande vous amène à la ligne suivante.
Tapez `java HelloWorld` pour exécuter votre programme.

Sortie : Hello World!

---

A propos des programmes Java, il est très important de garder à l’esprit les points suivants.

**Sensibilité à la casse** – Java est sensible à la casse, ce qui signifie que l’identifiant Voiture et voiture aurait une signification différente en Java.

**Noms de la classe** – Pour tous les noms de classe, la première lettre doit être en majuscule.
Si plusieurs mots sont utilisés pour former un nom de la classe, la première lettre de chaque mot intérieur doit être en majuscule.
Exemple: ClasseTestJava

**Nom des méthodes** – Tous les noms de méthodes doivent commencer par une lettre minuscule.
Si plusieurs mots sont utilisés pour former le nom de la méthode, la première lettre de chaque mot intérieur doit être en majuscule.
Exemple: `public void myFirstMethode()`

**Le nom du fichier** – Le nom du fichier doit correspondre exactement au nom de la classe.

Exemple: Supposons que `ClasseTestJava` est le nom de la classe. Ensuite, le fichier doit être enregistré en tant que `ClasseTestJava.java`

`public static void main(String[] args)`
Obligatoire ?
👉 Oui, si tu veux lancer un programme Java standard avec java NomDeClasse.
👉 Mais non, toutes les classes n’ont pas besoin de main.

Les librairies ou classes utilitaires n’ont souvent pas de main.
Depuis Java 21 (et déjà avant), tu peux avoir des tests JUnit, des applications Jakarta EE, du Spring Boot, etc., qui démarrent autrement.

Depuis Java 11+ : on peut même exécuter directement un fichier `.java` sans compilation préalable (`java HelloWorld.java`), mais la présence d’un `main` reste nécessaire si tu veux un vrai point d’entrée.

## Les identifiants en Java

Tous les composants Java nécessitent des noms. Les noms utilisés pour les classes, les variables et les méthodes sont appelés identificateurs.

En Java, il y a plusieurs points à retenir sur les identificateurs. Ils sont les suivants :

- Tous les identificateurs doivent commencer par une lettre (A à Z ou a à z), un caractère de devise ($) ou un trait de soulignement (\_).

- Les identifiants sont sensibles à la casse.

- Exemples d’identifiants légaux: nom, $solde, \_valeur, \_\_1_exemple.

- Exemples d’identificateurs illégaux: 999xyz, -solde.

- En Java 21, les identificateurs peuvent aussi commencer par des lettres Unicode
  Cela permet d’utiliser des caractères non latins dans les noms de variables, classes ou méthodes.
  Exemple :

```
int café = 5;      // valide
String πValue = "Pi"; // valide
```

## Les modificateurs Java

Comme d’autres langages, il est possible de modifier des classes, des méthodes, etc., en utilisant des modificateurs.
Il existe des catégories de modificateurs :

### 1. **Modificateurs d’accès**

Contrôlent **la visibilité** d’une classe, méthode ou variable.

- `public` → accessible partout
- `protected` → accessible dans le même package + sous-classes
- `private` → accessible uniquement dans la classe
- _(aucun mot clé)_ → **package-private** (par défaut, accessible uniquement dans le package)

---

### 2. **Modificateurs sans accès (classiques)**

Contrôlent le **comportement** des classes, méthodes ou variables.

- `final` → empêche modification (classe non héritée, méthode non redéfinie, variable constante)
- `abstract` → classe/méthode incomplète à implémenter
- `strictfp` → force les calculs flottants à suivre strictement IEEE 754

---

### 3. **Modificateurs liés au cycle de vie/partage**

- `static` → partagé par toutes les instances, ou défini sans objet
- `synchronized` → contrôle l’accès multithread
- `volatile` → assure que la variable est lue/écrite directement en mémoire principale (utile en concurrence)
- `transient` → exclut un champ lors de la sérialisation

---

### 4. **Modificateurs modernes (Java 17+)**

Introduits avec la programmation orientée **scellée (sealed classes)** :

- `sealed` → limite quelles classes peuvent hériter
- `non-sealed` → lève la restriction sur une sous-classe d’une classe `sealed`
- `permits` → liste les classes autorisées à hériter

---

## Les variables Java

Voici les types de variables en Java :

- Variables locales

- Variables de classe (variables statiques)

- Variables d’instance (variables non statiques)

En résumé :
Locale = temporaire, doit être initialisée.

Instance = appartient à chaque objet.

Classe (statique) = partagée par toutes les instances.

## Les tableaux en Java

Les tableaux sont des objets qui stockent plusieurs variables du même type. Toutefois, un tableau lui-même est un objet.

## Enums en Java

Enums ont été introduits dans Java 5.0. Enums restreignent une variable pour avoir seulement quelques valeurs prédéfinies.
Les valeurs de cette liste énumérée sont appelées enums.

Avec l’utilisation d’enums il est possible de réduire le nombre de bugs dans votre code.

Par exemple, si l’on considère une demande pour un magasin de jus de fruits frais, il serait possible de limiter la taille du verre à petites, moyennes et grandes.
Cela permettrait de s’assurer qu’il ne permettrait à personne de commander toute taille autre que les petites, moyennes ou grandes.

Exemple :

```
// Définition de l'énumération
enum JuiceSize {
    SMALL, MEDIUM, LARGE
}

// Classe d'exemple
public class JuiceOrder {
    JuiceSize size; // variable de type enum

    // Constructeur
    public JuiceOrder(JuiceSize size) {
        this.size = size;
    }

    // Affichage
    public void printOrder() {
        System.out.println("Juice size: " + size);
    }

    // Main pour tester
    public static void main(String[] args) {
        JuiceOrder order1 = new JuiceOrder(JuiceSize.SMALL);
        JuiceOrder order2 = new JuiceOrder(JuiceSize.LARGE);

        order1.printOrder(); // Juice size: SMALL
        order2.printOrder(); // Juice size: LARGE
    }
}
```

**Remarque** : les enums peuvent être déclarés comme étant propres ou à l’intérieur d’une classe.
Méthodes, variables, constructeurs peuvent être définis à l’intérieur des enums.

## Les mots clés de Java

La liste suivante montre les mots-clés réservés en Java. Ces mots réservés ne peuvent pas être utilisés comme constantes ou variables ou tout autre nom d’identifiant.

(reserveJava img)

## Les commentaires en Java

Java prend en charge les commentaires d’une seule ligne et de plusieurs lignes très similaires à C et à C ++.
Tous les caractères disponibles dans tout commentaire sont ignorés par le compilateur Java.

Exemple :

```
public class Test {

    /* C'est mon premier programme java.
     * Ceci affichera 'Hello World!' comme sortie
     * Ceci est un exemple de commentaires multi-lignes.
     */

   public static void main(String []args) {
     // Voici un commentaire en une seul ligne
     /* Ceci est également un commentaire en une seul ligne. */
      System.out.println("Hello World!");  // Hello World!
   }
}
```

## Héritage

En Java, une classe peut hérité une autre classe.
Généralement, si vous avez besoin de créer une nouvelle classe et vous avez déjà une classe qui a une partie du code dont vous avez besoin, alors il est possible d’hériter cette classe.
Ce concept vous permet de réutiliser les champs et les méthodes de la classe existante sans devoir réécrire le code dans une nouvelle classe.
Dans ce scénario, la classe existante est appelée superclasse ou classe mère et la classe héritée est appelée sous-classe ou classe fille.

Exemple: Ici, `Animal` est la superclasse, et `Dog` est une sous-classe qui hérite.

```
// Superclasse (classe mère)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Sous-classe (classe fille)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // hérité de Animal
        myDog.bark(); // méthode spécifique à Dog
    }
}
```

## Interfaces

En langage Java, une interface peut être définie comme un contrat entre les objets sur la façon de communiquer les uns avec les autres.
Interfaces jouent un rôle vital quand il s’agit de la notion d’héritage.
Une interface définit les méthodes, qui doivent être utiliser par une classe dérivée (sous-classe). Mais la mise en œuvre des méthodes est totalement dans la sous-classe.

Exemple : Ici, `Playable` définit une méthode que `Guitar` doit implémenter.

```
// Interface (contrat)
interface Playable {
    void play();
}

// Classe qui implémente l'interface
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("The guitar is playing.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Playable instrument = new Guitar();
        instrument.play();
    }
}
```

- **Héritage (extends)** → réutilisation d’une classe existante.

- **Interface (implements)** → définir un contrat que la classe doit respecter.
