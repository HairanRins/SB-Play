# Les variables

Une variable nous fournit un espace de stockage nommé que nos programmes peuvent le manipuler.
Chaque variable en Java a un type spécifique, qui détermine la taille et la disposition des variables en mémoire;
La gamme de valeurs qui peuvent être stockées dans cette mémoire; Et l’ensemble des opérations qui peuvent être appliquées à la variable.

Vous devez déclarer toutes les variables avant qu’elles ne puissent être utilisées. Voici la forme de base d’une déclaration

```
type variable [ =  valeur][, variable [ =  valeur] ...] ;
```

Ici, le type de données est l’un des types de données de Java tels que int, float, String, etc.
et variable indique le nom d’une variable. Pour déclarer plus d’une variable de type spécifique, vous pouvez utiliser une liste séparée par des virgules.

Exemple :

```
int x, y, z;  // Déclaration de trois entiers, x, y et z.
int x = 10, y = 10;   // Exemple d'initialisation
byte X = 22;  // initialisation d'une variable de type byte.
double pi = 3.14159;  // déclaration et affectation de la valeur de PI.
char z = 'z';  // la variable z est initialisée avec la valeur 'z'
```

Il existe trois types de variables :

- Variables locales
- Variables d’instance
- Variables de classe / Variables statiques

Java 10 a introduit `var` pour l’inférence de type (uniquement pour les variables locales), et Java 21 a ajouté des améliorations de pattern matching et records, mais ça ne touche pas la nature des variables elles-mêmes.

## Les variables locales

- Déclarées **à l’intérieur d’une méthode, d’un constructeur ou d’un bloc.**

- Elles sont **créées lors de l’appel de la méthode et détruites à sa fin.**

- Elles **n’ont pas de valeur par défaut** → il faut les initialiser avant utilisation.

* Les modificateurs d’accès (public et private) ne peuvent pas être utilisés pour des variables locales.

* Les variables locales ne sont visibles que dans la méthode déclarée, le constructeur ou le bloc.

* Les variables locales sont mises en œuvre au niveau de la pile en interne.
  (elles existent uniquement le temps de l’exécution de la méthode)

Exemple :
Ici, solde est une variable locale. Ceci est défini dans la méthode `addSolde()` et sa portée est limitée à cette méthode.

```
public class Test {
   public void addSolde() {
      int solde = 0;
      solde = solde + 100;
      System.out.println("Votre solde est : " + solde);
   }

   public static void main(String args[]) {
      Test test = new Test();
      test.addSolde();
   }
}
```

Cela produira le résultat suivant :

```
Votre solde est : 100
```

Exemple
L’exemple suivant utilise solde sans l’initialiser, donc il affiche une erreur au moment de la compilation.

```
public class Test {
   public void addSolde() {
      int solde;
      solde = solde + 100;
      System.out.println("Votre solde est : " + solde);
   }

   public static void main(String args[]) {
      Test test = new Test();
      test.addSolde();
   }
}
```

Cela produira l’erreur suivante lors de la compilation :

```
Test.java:4: error: variable solde might not have been initialized
      solde = solde + 100;
              ^
1 error
```

## Les variables d’instance

- Les variables d’instance sont déclarées dans une classe, mais en dehors d’une méthode, d’un constructeur ou d’un bloc quelconque.

- Lorsqu’un espace est alloué à un objet dans le tas, un emplacement pour chaque valeur de variable d’instance est créé.

- Les variables d’instance sont créées lorsqu’un objet est créé avec l’utilisation du mot-clé `new` et détruit lorsque l’objet est détruit.

- Les variables d’instance contiennent des valeurs qui doivent être référencées par plus d’une méthode, constructeur ou bloc ou parties essentielles
  de l’état d’un objet qui doivent être présentes dans toute la classe.

- Les variables d’instance peuvent être déclarées au niveau de la classe avant ou après l’utilisation.

- Les modificateurs d’accès (public et private) peuvent être donnés pour des variables d’instance.

- Les variables d’instance sont visibles pour toutes les méthodes, constructeurs et bloc dans la classe.
  Normalement, il est recommandé de rendre ces variables privées.
  Cependant, la visibilité pour les sous-classes peut être donnée pour ces variables avec l’utilisation de modificateurs d’accès.

- Les variables d’instance ont des valeurs par défaut. Pour les nombres, la valeur par défaut est 0, pour Boolean elle est fausse, et pour les références d’objet elle est nulle.
  Les valeurs peuvent être affectées pendant la déclaration ou dans le constructeur.

- Les variables d’instance peuvent être consultées directement en appelant le nom de la variable dans la classe.
  Cependant, dans les méthodes statiques (lorsque les variables d’instance ont accès), elles doivent être appelées à l’aide du nom complet.
  `ObjectReference.VariableName`.

Exemple :

```
import java.io.*;
public class Person {

   // cette variable d'instance est visible pour toute classe enfant.
   public String name;

   // variable age est visible dans la classe Personne seulement.
   private int age;

   // La variable nom est affectée dans le constructeur.
   public Person(String n) {
      nom  = n;
   }

   // La variable age reçoit une valeur.
   public void setAge(int a) {
      age= a;
   }

   // Cette méthode affiche les détails de la personne.
   public void printPerson() {
      System.out.println("nom : " + nom);
      System.out.println("age :" + age);
   }

   public static void main(String args[]) {
      Person p = new Person("Alex");
      p.setAge(22);
      p.printPerson();
   }
}
```

Cela produira le résultat suivant :

```
nom : Alex
age :22
```

## Les variables de classe / Variables statique

- Les variables de classe également appelées variables statiques sont déclarées avec le mot-clé `static` dans une classe,
  mais en dehors d’une méthode, d’un constructeur ou d’un bloc.

- Il n’y aurait qu’une seule copie de chaque variable de classe, quel que soit le nombre d’objets créés à partir de celle-ci.

- Les variables statiques sont rarement utilisées autre que d’être déclaré en tant que constantes.
  Les constantes sont des variables déclarées publiques / privées, finales et statiques. Les variables constantes ne changent jamais de leur valeur initiale.

- Les variables statiques sont stockées dans la mémoire statique.

- Les variables statiques sont créées lorsque le programme démarre, et est détruit lorsque le programme s’arrête.

- La visibilité est similaire aux variables d’instance. En revanche, la plupart des variables statiques sont déclarées publiques car elles doivent être disponibles pour les utilisateurs de la classe.

- Les valeurs par défaut sont identiques aux variables d’instance. Pour les nombres, la valeur par défaut est 0; Pour les booléens, c’est « false »;
  Et pour les références d’objets, elle est « null ». Les valeurs peuvent être affectées pendant la déclaration ou dans le constructeur.
  En outre, les valeurs peuvent être affectées dans des blocs d’initialisation statique spéciaux.

- Les variables statiques sont accessibles en appelant avec le nom de classe `ClassName.VariableName`.

- Lors de la déclaration des variables de classe comme public static final, les noms de variable (constantes) sont tous en majuscules.
  Si les variables statiques ne sont pas publiques et finales, la syntaxe de nommage est identique à la déclaration des variables d’instance et aux variables locales.

Exemple :

```
import java.io.*;

public class Person{

   // variable age est une variable statique privée
   private static int age;

   // NOM est une constante
   public static final String NAME = "Alex";

   public static void main(String args[]) {
      age = 22;
      System.out.println(NAME+" votre age est : " + age);  // Alex votre age est : 22
   }
}
```

Remarque – Si les variables sont accessibles à partir d’une classe externe, la constante doit être accédée par `Person.NAME`

---

![Capture d’écran_31-8-2025_1221_chatgpt com](https://github.com/user-attachments/assets/1bbf767b-b8ec-434e-9699-494475b4ded8)


Exemple simple pour comparer :

```
class Person {
    // Variable d’instance
    int age;

    // Variable de classe (statique constante)
    public static final String SPECIES = "Human";

    public void showInfo() {
        // Variable locale
        String localMessage = "Hello";
        System.out.println(localMessage + " I am " + age + " years old.");
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 25; // variable d’instance

        // accès à variable locale -> impossible ici (uniquement dans la méthode)
        // accès à variable statique
        System.out.println(Person.SPECIES);
    }
}
```

✅ Résumé rapide :

- Instance (non static) = chaque objet a sa copie, liée à l’état de l’objet.

- Classe (static) = une seule copie partagée par tous les objets.

// constante : public + static + final

👉 Résumé simple :

- Variable d’instance → accès via un objet : p.name.

- Variable statique (constante) → accès via la classe : Person.NAME.
