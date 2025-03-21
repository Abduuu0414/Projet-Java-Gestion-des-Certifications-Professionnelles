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
- **Filtrage des Inscriptions** : Filtrage des inscriptions par certification ou étudiant.
- **Recherche de Certifications** : Recherche rapide de certifications par nom ou organisme.
- **Visualisation des Données** : Graphique Pie Chart pour analyser le taux d'inscription par certification.

---

## Diagrammes UML

### Diagramme de Cas d'Utilisation
![Diagramme de Cas d'Utilisation](https://github.com/user-attachments/assets/223485c7-956e-4bf7-8f0d-ec99c54ad15f)

### Diagramme de Classe
![Diagramme de Classe](https://github.com/user-attachments/assets/60b600fd-9ebf-4727-89fe-af77aeb922ee)

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
- **MySQL Connector/J** : Pilote JDBC pour la connexion et l'interaction avec la base de données MySQL.
- **JCalendar** : Bibliothèque pour la gestion des dates dans l'interface graphique.
- **JFreeChart** : Bibliothèque pour la génération de graphiques (Pie Chart, etc.).
- **Swing** : Bibliothèque Java pour la création de l'interface graphique utilisateur (GUI).

---

## Architecture du Projet

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


### Architecture Logique
1. **Couche Présentation** : Gérée par Swing pour l'interface utilisateur.
2. **Couche Métier** : Contient la logique de gestion des certifications, des étudiants et des inscriptions.
3. **Couche Données** : Gère les interactions avec la base de données MySQL via JDBC.
4. **Bibliothèques Externes** : Utilisées pour étendre les fonctionnalités (JCalendar pour les dates, JFreeChart pour les graphiques).

---

## Vidéo Démonstrative
[Démonstration](https://drive.google.com/drive/folders/1ZWNHGAYUtosgD6lb0h9_ikk8GwtjyBw4?usp=sharing)

---

Ce projet vise à fournir une solution complète et efficace pour la gestion des certifications professionnelles, en utilisant des technologies modernes et une architecture bien structurée.
