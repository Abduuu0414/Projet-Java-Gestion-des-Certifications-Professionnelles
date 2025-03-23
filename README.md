# Gestion des Certifications Professionnelles

## Contexte
Dans un monde professionnel en constante évolution, la gestion des certifications devient un enjeu crucial pour les organisations et les individus. Les certifications professionnelles permettent de valider les compétences et d'améliorer l'employabilité. Cependant, la gestion manuelle de ces certifications peut entraîner des erreurs, des retards et une inefficacité dans le suivi des certifications et des candidats.

---

## Problématique
Les institutions de formation et les organisations professionnelles ont besoin d'un système robuste et facile à utiliser pour gérer les certifications, les étudiants et leurs inscriptions. Les systèmes actuels sont souvent inefficaces, ne permettant pas un suivi précis des certifications, des inscriptions et des tendances d'utilisation des certifications. Cela peut entraîner :
- Des erreurs de gestion,
- Des retards dans les inscriptions,
- Une mauvaise expérience pour les utilisateurs.

---

## Objectif
L'objectif de ce projet est de développer une application qui simplifie la gestion des certifications professionnelles pour les institutions de formation et les organisations professionnelles. L'application doit :
- Permettre un suivi précis des certifications et des inscriptions,
- Offrir une vision claire des tendances d'utilisation des certifications,
- Fournir des fonctionnalités avancées pour la gestion des certifications et des étudiants.

---

## Fonctionnalités Principales
- **Gestion des Certifications** : Ajout et suppression de certifications.
- **Inscription des Étudiants** : Enregistrement des étudiants et de leurs inscriptions aux certifications.
- **Filtrage des Inscriptions** : Filtrage des inscriptions par certification.
- **Filtrage des Étudiants** : Filtrage des étudiants par certification.
- **Recherche de Certifications** : Recherche rapide de certifications par nom ou organisme.
- **Visualisation des Données** : Graphique Pie Chart pour analyser le taux d'inscription par certification.


---

## 🏷️ Logo
![Logo](https://github.com/user-attachments/assets/e9474565-b7bd-483f-bea7-b3530a99ff9d)


---

## Diagrammes UML

### Diagramme de Cas d'Utilisation
![image](https://github.com/user-attachments/assets/1763b80e-94ae-4e38-9dc3-9b7753b7f70a)


### Diagramme de Classe
![image](https://github.com/user-attachments/assets/095d4258-419c-471c-8cd8-29ed7e3b584c)


---

## Requêtes SQL pour la Base de Données

### Tables

```sql
CREATE TABLE Certification (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    organisme VARCHAR(255) NOT NULL,
    cout DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Étudiant (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prénom VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE InscriptionCertification (
    certification_id INT NOT NULL,
    etudiant_id INT NOT NULL,
    date_inscription DATE NOT NULL,
    FOREIGN KEY (certification_id) REFERENCES Certification(id),
    FOREIGN KEY (etudiant_id) REFERENCES Étudiant(id)
);

CREATE TABLE User (
    login VARCHAR(50) PRIMARY KEY,
    password CHAR(32) NOT NULL
);
```

---

## Technologies et Bibliothèques Utilisées
- **NetBeans 8.0.2** : Environnement de développement intégré (IDE) pour le développement de l'application en Java.
- **MySQL**: Pour la gestion de la base de données. 
- **MySQL Connector/J** : Pilote JDBC pour la connexion et l'interaction avec la base de données MySQL.
- **JCalendar** : Bibliothèque pour la gestion des dates dans l'interface graphique.
- **JFreeChart** : Bibliothèque pour la génération de graphiques (Pie Chart, etc.).
- **Swing** : Bibliothèque Java pour la création de l'interface graphique utilisateur (GUI).
- **Outils de développement** :  
    - **IDE Java** : NetBeans
    - **Conception** : MagicDraw
    -  **Outil de gestion de base de données** : phpMyAdmin
    - **Accès aux données** : JDBC

---

## Architecture du Projet

Voici l'architecture logicielle en couches (Layered Architecture) :

![Layered Architecture](https://github.com/user-attachments/assets/c08373b1-3844-422c-b790-4fb05b7e7e75)


Voici la structure du projet **GestionCertificationsProfessionnelles** :

```
GestionCertificationsProfessionnelles/
├── src/
│   ├── beans/                # Modèles de données (Certification, Étudiant, etc.)
│   │   ├── Certification.java
│   │   ├── Etudiant.java
│   │   ├── InscriptionCertification.java
│   │   └── User.java
│   ├── connexion/            # Connexion à la base de données
│   ├── dao/                  # Objets d'accès aux données (DAO)
│   ├── gui/                  # Interfaces graphiques (Swing)
│   │   ├── CertificationChartForm.java
│   │   ├── CertificationForm.java
│   │   ├── EtudiantForm.java
│   │   ├── InscriptionForm.java
│   │   ├── InscriptionParCertification.java
│   │   ├── MDIApplication.java
│   │   ├── Main.java
│   │   └── Signup.java
│   ├── services/             # Services pour la logique métier
│   │   ├── CertificationService.java
│   │   ├── EmailSender.java
│   │   ├── EtudiantService.java
│   │   ├── InscriptionCertificationService.java
│   │   └── UserService.java
│   └── test/                 # Tests unitaires
├── lib/                      # Bibliothèques externes (MySQL Connector, JCalendar, JFreeChart)
│   ├── jcalendar-1.4.jar
│   └── autres fichiers .jar
├── resources/                # Ressources (images, fichiers de configuration)
└── README.md                 # Documentation du projet
```

### Description des Dossiers et Fichiers

1. **`src/beans/`**  
   Contient les classes modèles représentant les entités de l'application :
   - `Certification.java` : Modèle pour les certifications.
   - `Etudiant.java` : Modèle pour les étudiants.
   - `InscriptionCertification.java` : Modèle pour les inscriptions aux certifications.
   - `User.java` : Modèle pour les utilisateurs de l'application.

2. **`src/connexion/`**  
   Contient les classes et configurations pour la connexion à la base de données MySQL.

3. **`src/dao/`**  
   Contient les classes **DAO (Data Access Object)** pour interagir avec la base de données :
   - Exemple : `CertificationDAO.java`, `EtudiantDAO.java`, etc.

4. **`src/gui/`**  
   Contient les interfaces graphiques développées avec **Swing** :
   - `CertificationChartForm.java` : Interface pour afficher les graphiques des certifications.
   - `CertificationForm.java` : Interface pour gérer les certifications.
   - `EtudiantForm.java` : Interface pour gérer les étudiants.
   - `InscriptionForm.java` : Interface pour gérer les inscriptions.
   - `InscriptionParCertification.java` : Interface pour filtrer les inscriptions par certification.
   - `MDIApplication.java` : Interface principale de l'application (MDI - Multiple Document Interface).
   - `Main.java` : Point d'entrée de l'application.
   - `Signup.java` : Interface pour l'inscription des utilisateurs.

5. **`src/services/`**  
   Contient les classes de services pour la logique métier :
   - `CertificationService.java` : Service pour la gestion des certifications.
   - `EmailSender.java` : Service pour l'envoi d'emails.
   - `EtudiantService.java` : Service pour la gestion des étudiants.
   - `InscriptionCertificationService.java` : Service pour la gestion des inscriptions.
   - `UserService.java` : Service pour la gestion des utilisateurs.

6. **`src/test/`**  
   Contient les tests unitaires pour valider les fonctionnalités de l'application.

7. **`lib/`**  
   Contient les bibliothèques externes utilisées dans le projet :
   - `jcalendar-1.4.jar` : Pour la gestion des dates dans l'interface graphique.
   - Autres fichiers `.jar` : MySQL Connector/J, JFreeChart, etc.

8. **`resources/`**  
   Contient les ressources de l'application, telles que :
   - Images pour l'interface graphique.
   - Fichiers de configuration (ex : `config.properties`).

9. **`README.md`**  
   Documentation du projet, expliquant son contexte, ses fonctionnalités, son architecture, et son utilisation.

---

### Visualisation de l'Architecture

L'architecture du projet suit une structure **MVC (Modèle-Vue-Contrôleur)** :
- **Modèle** : Géré par les classes dans `src/beans/` et `src/dao/`.
- **Vue** : Gérée par les interfaces graphiques dans `src/gui/`.
- **Contrôleur** : Géré par les classes dans `src/services/`.

Cette structure permet une séparation claire des responsabilités et facilite la maintenance et l'évolution de l'application.

---

## Vidéo Démonstrative
[Démonstration](https://github.com/user-attachments/assets/a1775b62-a56f-41ea-96fd-8449b441ac47
)

---

Ce projet vise à fournir une solution complète et efficace pour la gestion des certifications professionnelles, en utilisant des technologies modernes et une architecture bien structurée.
