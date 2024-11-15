# Exercices Java - Gestion et Manipulation de Données
Ce dépôt contient plusieurs exercices en Java couvrant différents concepts de programmation orientée objet, gestion de collections, et manipulation de flux de données avec Java Streams.  

### Exercice 1.1 - Gestion des Produits
- **Description** : Cet exercice met en place une gestion basique de produits à l'aide de classes Java. Il inclut des fonctionnalités comme la création de produits, la manipulation des données et les opérations courantes sur les objets produits d'apres des ArrayList.
- **Techniques utilisées** :
  - **ArrayList** : Création et gestion de collections dynamiques.
  - Méthodes d'`ArrayList` telles que `add()`, `remove()`, et `set()`.
  - Programmation orientée objet (POO) : utilisation de classes et d'objets pour représenter les produits.
---

### Exercice 1.2 - Manipulation Avancée de Flux de Chaînes
- **Description** :  Cet exercice explore les opérations sur les ensembles (HashSet).
- **Techniques utilisées** :
  - **HashSet** : Création et gestion des notes des etudiants.
  - Méthodes d'`HashSet` telles que `put()`, `remove()` , `keys()` , `values()`.
  - Méthodes d'`Collections` telles que `min()` et `max()`.

---

### Exercice 1.3 - Opérations sur les Ensembles
- **Description** : Cet exercice explore les opérations sur les ensembles (`HashSet`), notamment l'union et l'intersection. Il illustre comment gérer des groupes d'éléments uniques et détecter des chevauchements.
- **Techniques utilisées** :
  - **HashSet** : Manipulation de collections d'éléments uniques.
  - Méthodes de `HashSet` : `add()`, `addAll()` et `retainAll()`.
  - Opérations d'union et d'intersection pour détecter les chevauchements d'ensembles.

---

### Exercice 2.1 - Manipulation de Flux de Données
- **Description** : Cet exercice utilise les API de flux Java (`Stream`) pour appliquer différents filtres et transformations à une liste de chaînes. 
- **Techniques utilisées** :
  - **Stream** : Travail avec des flux de données à partir de listes (`stream()`).
  - Méthodes comme :
    - `filter()` pour exclure des éléments selon des critères.
    - `map()` pour transformer les chaînes (ex. majuscules, inversion).
    - `flatMap()` pour décomposer des chaînes en caractères individuels.
    - `range()` pour generer un ensemble des valeurs successives a partir la classe (`IntStream`).
    - `mapToObj` pour travailler avec les valeurs de type primitives.
  - Collecte des résultats en structures comme `List` grâce à `Collectors.toList()`.

---

### Exercice 2.2 - Gestion des Employés et Salaires
- **Description** : Cet exercice explore la gestion des employés dans une entreprise, en utilisant des techniques avancées de tri et de filtrage.
- **Techniques utilisées** :
  - **POO** : Genere une classe Employe
  - **Streams** : Manipulation des données d'objets personnalisés.
  - Méthodes de flux comme `mapToDouble()`, `sorted()`, `filter()` et `reduce()` pour effectuer des calculs et transformations.
  - **Comparator** : Tri des employés selon leurs attributs.
  - Collecte des résultats avec `Collectors.toList()`.

---

<!-- ## Instructions
1. Clonez ce dépôt :  
   ```bash
   git clone <URL_DU_DEPOT> -->
