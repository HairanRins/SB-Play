# Le fonctionnement global de la mémoire en Java\*\*

---

## 🔹 Fonctionnement global de la mémoire en Java

En Java, la mémoire est principalement gérée par la **JVM (Java Virtual Machine)**. Elle se divise en deux grandes parties :

### 1. **Stack (Pile d’exécution)**

- Chaque thread possède sa propre **pile**.
- Contient :

  - Les **variables locales** (int, double, références d’objets, etc.)
  - Les **adresses de retour** des méthodes
  - Les **frames d’exécution** (chaque appel de méthode crée une nouvelle frame dans la pile).

- ⚡ Caractéristique : allocation/désallocation rapide, gérée automatiquement quand une méthode se termine.

---

### 2. **Heap (Tas mémoire)**

- Zone mémoire **partagée par tous les threads**.
- Contient :

  - Les **objets** créés avec `new`
  - Les **instances des classes**
  - Les **tableaux**

- ⚡ Gérée par le **Garbage Collector (GC)** → libère la mémoire des objets qui ne sont plus référencés.

---

### 3. **Method Area (aussi appelée Metaspace depuis Java 8)**

- Contient :

  - Le **bytecode des classes chargées**
  - Les **méthodes** et **attributs statiques**
  - Les **pools de constantes** (par ex. les Strings littérales).

---

### 4. **PC Register & Native Method Stack**

- **PC Register** : stocke l’adresse de la prochaine instruction à exécuter pour chaque thread.
- **Native Method Stack** : utilisée pour exécuter les méthodes natives (bibliothèques externes, souvent en C/C++).

---

## 🔹 Schéma résumé (mémoire Java)

```
+----------------------------------+
|          JVM Memory              |
+----------------------------------+
|          Method Area             | <-- Bytecode, classes, méthodes, statiques
|----------------------------------|
|              Heap                | <-- Objets, instances, tableaux (GC ici)
|----------------------------------|
|   Stack (Thread 1)   Stack (T2)  | <-- Variables locales, frames d’exécution
|----------------------------------|
| PC Register / Native Method Stack|
+----------------------------------+
```

---

👉 En résumé :

- **Stack = exécution rapide, variables locales**
- **Heap = stockage des objets** (nettoyé par GC)
- **Method Area = infos des classes, méthodes, constantes**
- **PC Register & Native Stack = gestion bas niveau par thread**

---

## 🔹 La JVM comme une grande maison

Imagine que **Java est une maison** où vivent tes programmes :

### 1. **Stack = le bureau du travail immédiat**

- Chaque thread a son **bureau personnel**.
- Sur ce bureau, tu poses **les papiers et notes** dont tu as besoin **immédiatement** pour accomplir ta tâche.
- Quand tu termines une tâche (une méthode), tu ranges ces papiers → c’est automatiquement libéré.
- ⚡ Très rapide, mais limité en taille.

**Exemple :**
Tu écris sur un post-it `int x = 5`, tu finis ton travail, tu jettes le post-it.

---

### 2. **Heap = le grenier commun**

- Tous les threads ont accès au **grenier** de la maison.
- C’est là que tu mets **tout ce que tu veux garder plus longtemps**, comme les meubles (objets), les tableaux, etc.
- Mais attention : tu ne peux pas toujours te rappeler ce qui n’est plus utile → le **Garbage Collector** est comme une femme de ménage qui vient de temps en temps pour ranger et jeter les objets inutiles.

**Exemple :**
Tu stockes un meuble (`new Table()`), tu l’utilises tant que quelqu’un le regarde ou s’en sert, sinon il finit par être recyclé.

---

### 3. **Method Area / Metaspace = la bibliothèque des plans**

- Ici, on garde tous les **plans de construction et les instructions** pour savoir comment créer les objets et exécuter les méthodes.
- Ce sont des références statiques que tout le monde peut consulter.

**Exemple :**
Tu as un livre avec toutes les recettes de cuisine (méthodes), que tu consultes quand tu veux préparer un plat.

---

### 4. **PC Register = l’agenda**

- Chaque thread a un **agenda personnel** pour savoir **quelle instruction exécuter ensuite**.

---

### 5. **Native Method Stack = les outils spéciaux**

- Certains outils viennent de l’extérieur (C/C++), et tu les ranges dans **une boîte spéciale** pour les utiliser quand il faut.

---

## 🔹 Schéma analogique

```
          Maison JVM
+-----------------------------+
|  Bibliothèque (Method Area) | <-- plans, instructions, recettes
+-----------------------------+
|       Grenier (Heap)        | <-- meubles et objets partagés
+-----------------------------+
| Bureau Thread 1   Bureau T2 | <-- post-its et notes temporaires
+-----------------------------+
|      Agenda / PC Register    | <-- prochaine tâche à exécuter
+-----------------------------+
| Boîte à outils spéciaux      | <-- méthodes natives externes
+-----------------------------+
```

---

💡 **Résumé métaphorique** :

- Stack = bureau avec notes temporaires
- Heap = grenier pour stocker les objets qui durent plus longtemps
- Method Area = bibliothèque avec tous les plans
- Garbage Collector = femme de ménage qui nettoie le grenier
- PC Register = agenda pour suivre l’ordre des tâches
- Native Method Stack = boîte à outils externes
