# Cycle de vie d’un programme Java

Voici le **résumé en étapes simples** du cycle de vie d’un programme Java :

1. **Écriture** → tu écris le code source (`.java`).
2. **Compilation** → le compilateur transforme en bytecode (`.class`).
3. **Chargement** → la JVM charge le bytecode en mémoire.
4. **Vérification** → la JVM s’assure que le bytecode est sûr.
5. **Exécution** → la JVM exécute le programme (interprétation + JIT).
6. **Nettoyage** → le _Garbage Collector_ libère la mémoire inutile.

En très court : **Écrire → Compiler → Charger → Vérifier → Exécuter → Nettoyer.**
