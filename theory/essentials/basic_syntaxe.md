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
