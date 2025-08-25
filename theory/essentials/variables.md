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
