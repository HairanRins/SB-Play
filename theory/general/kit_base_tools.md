# **JVM**, **JRE** et **JDK**

Leurs rôles, leurs relations et les points importants à retenir pour bien comprendre comment Java fonctionne.

---

## 1. **JVM – Java Virtual Machine**

**Rôle :**
La **JVM** est le cœur de l’exécution Java.
Elle est responsable de **l’exécution du bytecode Java** (fichier `.class`) et fait l’interface entre ton programme Java et ton système d’exploitation.

**Ce qu’elle fait :**

- **Charge** les classes compilées (`.class`).
- **Vérifie** que le bytecode est valide et sécurisé.
- **Exécute** le code grâce à un **interpréteur** ou via **JIT (Just-In-Time compilation)**.
- **Gère la mémoire** avec un **Garbage Collector**.
- Fournit un environnement portable : le même code peut tourner sur Windows, Linux, Mac, etc.

**Points clés :**

- La JVM est **spécifique à la plateforme** (JVM Windows, JVM Linux…), mais le bytecode est **universel**.
- La JVM ne sait pas compiler du code Java source, seulement exécuter le bytecode.

---

## 2. **JRE – Java Runtime Environment**

**Rôle :**
Le **JRE** fournit **tout ce qu’il faut pour exécuter** des programmes Java, mais **pas pour les compiler**.

**Ce qu’il contient :**

- **La JVM** (pour exécuter le bytecode).
- **Les bibliothèques de classes standard** (API Java : `java.lang`, `java.util`, `java.io`, etc.).
- Fichiers de configuration, ressources, etc.

**Points clés :**

- Si tu veux **juste lancer** un programme Java (déjà compilé), le JRE suffit.
- Il ne contient pas de compilateur `javac` ni d’outils de développement.

---

## 3. **JDK – Java Development Kit**

**Rôle :**
Le **JDK** est l’outil complet pour **développer** en Java.
Il inclut **tout le JRE** + les outils nécessaires au développement.

**Ce qu’il contient :**

- **Le JRE** (et donc la JVM).
- **Outils de développement** :

  - `javac` → compilateur Java (source `.java` → bytecode `.class`).
  - `java` → lanceur de programmes Java.
  - `javadoc` → générateur de documentation.
  - `jdb` → débogueur.
  - Outils de packaging (`jar`, etc.).

**Points clés :**

- Si tu veux **écrire** et **exécuter** du Java → **installe le JDK**.
- Depuis Java 11, Oracle ne fournit plus de JRE séparé — le JDK inclut tout.

---

## 4. **Relations entre eux**

On peut résumer leur lien comme ceci :

```
JDK = JRE + outils de développement
JRE = JVM + bibliothèques standard
JVM = moteur d’exécution du bytecode
```

---

## 5. **Cycle de fonctionnement Java**

1. Tu écris un fichier `.java`.
2. Le compilateur `javac` (présent dans le **JDK**) traduit ce code en **bytecode** `.class`.
3. La **JVM** (dans le JRE) lit ce bytecode et l’exécute.
4. Le bytecode est portable → il peut tourner sur n’importe quel OS avec une JVM compatible.

---

## 6. **Points importants à comprendre**

- **Portabilité** : le Java est "Write Once, Run Anywhere" grâce au bytecode et à la JVM.
- **Performances** : le JIT compile dynamiquement du bytecode en code machine optimisé.
- **Garbage Collector** : gère automatiquement la mémoire, mais on peut ajuster son comportement.
- **Compatibilité** : un programme compilé avec un JDK plus récent peut ne pas tourner sur un JRE plus ancien.
- **Distribution** : depuis Java 9, le JDK est modulaire (`java.base`, `java.sql`, etc.).

---

💡 **Astuce pour savoir quoi installer :**

- **Juste exécuter un programme Java** → JRE (mais depuis Java 11, prends un JDK et utilise juste `java`).
- **Développer en Java** → JDK.

---

Parfait, on va d’abord clarifier **bytecode** et quelques autres termes autour, puis je te prépare un **schéma visuel clair** qui montre les relations JVM / JRE / JDK + le cycle de vie complet d’un programme Java.

---

## 1️⃣ Bytecode et autres notions importantes

### **1. Bytecode**

- C’est **le langage intermédiaire** généré par le compilateur Java (`javac`).
- Fichiers `.class` → contiennent le bytecode.
- Il **n’est pas du code machine** (spécifique à un processeur), mais un code standard que **la JVM sait lire**.
- Avantage : il est **portable** sur toutes les plateformes qui ont une JVM.

Exemple :
Si tu écris ceci en Java :

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Le compilateur `javac` crée `Hello.class` contenant du bytecode (incompréhensible pour un humain, mais lisible par la JVM).

---

### **2. Source Code**

- C’est ton code Java **lisible par un humain**.
- Extension : `.java`.

---

### **3. Machine Code**

- Code binaire exécutable directement par le processeur (CPU).
- Spécifique à ton OS et ton matériel.
- Dans Java, la **JVM + JIT Compiler** transforme le bytecode en machine code à l’exécution.

---

### **4. JIT Compiler**

- **Just-In-Time Compiler** : compile dynamiquement le bytecode en machine code pour améliorer les performances.
- Présent dans la JVM moderne.

---

### **5. Garbage Collector (GC)**

- Système automatique de gestion mémoire dans la JVM.
- Libère la mémoire des objets qui ne sont plus utilisés.

---

## 2️⃣ Schéma visuel clair

```
               [Ton code source Java]
                         |
                         |  javac (compilateur)
                         v
                  [Bytecode Java]
                   (Fichier .class)
                         |
                         |  JVM (dans le JRE)
                         v
      [Interprétation + Compilation JIT en Machine Code]
                         |
                         v
                 [Programme en exécution]
```

---

### Relation entre JVM, JRE, JDK

```
JDK = JRE + Outils de développement
JRE = JVM + Bibliothèques standard
JVM = Moteur d’exécution du bytecode

╔════════════════════════════╗
║          JDK               ║
║  ┌──────────────────────┐  ║
║  │         JRE          │  ║
║  │  ┌────────────────┐  │  ║
║  │  │     JVM        │  │  ║
║  │  └────────────────┘  │  ║
║  │ + Bibliothèques API  │  ║
║  └──────────────────────┘  ║
║ + javac, javadoc, jar ...  ║
╚════════════════════════════╝
```

---

📌 **Résumé rapide du cycle de vie d’un programme Java :**

1. **Écriture** du code `.java` (source code).
2. **Compilation** avec `javac` → `.class` (bytecode).
3. **Chargement** du bytecode par la JVM.
4. **Exécution** via interprétation ou JIT → machine code.
5. **Gestion mémoire** par le Garbage Collector.

---

**Les extensions VS Code utiles pour Java et Spring Boot** :

### 📦 Packs principaux

- **Extension Pack for Java** (Microsoft)
- **Spring Boot Extension Pack** (VMware)
- **Java + Spring Extension Pack** (Loiane Groner)

---

### ⚙️ Extensions Java

- **Language Support for Java™ by Red Hat**
- **Debugger for Java**
- **Test Runner for Java**
- **Maven for Java**
- **Project Manager for Java**
- **Gradle for Java**
- **Java Dependency Viewer**
- **Java Code Generators**

---

### 🌱 Extensions Spring Boot

- **Spring Boot Tools**
- **Spring Initializr Java Support**
- **Spring Boot Dashboard**

---

### ✅ Qualité et bonnes pratiques

- **Checkstyle**
- **SonarLint**

---

### 🛠️ Outils complémentaires

- **Community Server Connectors** (Tomcat, Jetty, etc.)
- **Docker**
- **REST Client**
- **Coverage Gutters** (couverture de tests)

---
