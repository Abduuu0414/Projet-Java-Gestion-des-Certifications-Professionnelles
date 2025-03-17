# Gestion des Certifications Professionnelles

Ce projet est une application de gestion des certifications professionnelles. Il permet de gérer les certifications, les étudiants et leurs inscriptions aux certifications. L'application est développée en Java avec une base de données MySQL.

## Fonctionnalités

- **Ajouter une certification** : Permet d'ajouter une nouvelle certification avec son nom, l'organisme et le coût.
- **Inscrire un étudiant** : Permet d'ajouter un nouvel étudiant avec son nom, prénom et email.
- **Filtrer les inscriptions par certification** : Permet de lister les inscriptions pour une certification donnée.
- **Rechercher une certification par nom** : Permet de rechercher une certification par son nom.
- **Gestion des utilisateurs** : Permet de gérer les utilisateurs ayant accès à l'application (login et mot de passe).

## Structure de la Base de Données

La base de données MySQL est composée des tables suivantes :

- **Certification** : Contient les informations sur les certifications.
- **Étudiant** : Contient les informations sur les étudiants.
- **InscriptionCertification** : Contient les informations sur les inscriptions des étudiants aux certifications.
- **User** : Contient les informations de connexion des utilisateurs (login et mot de passe).

---

## Vidéo de Démonstration

Vous pouvez accéder à la vidéo de démonstration du projet en suivant ce lien :  
[Vidéo de Démonstration](https://drive.google.com/drive/folders/14pBIRKJVAYYw6ivRnzSisiMGKQ9a5KOJ?usp=sharing)

---

### Schéma de la Base de Données

Voici le schéma SQL pour créer les tables de la base de données :

```sql
-- Table Certification
CREATE TABLE Certification (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    organisme VARCHAR(255) NOT NULL,
    cout DECIMAL(10, 2) NOT NULL
);

-- Table Étudiant
CREATE TABLE Étudiant (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prénom VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Table InscriptionCertification
CREATE TABLE InscriptionCertification (
    id INT AUTO_INCREMENT PRIMARY KEY,
    certification_id INT NOT NULL,
    etudiant_id INT NOT NULL,
    date_inscription DATE NOT NULL,
    FOREIGN KEY (certification_id) REFERENCES Certification(id) ON DELETE CASCADE,
    FOREIGN KEY (etudiant_id) REFERENCES Étudiant(id) ON DELETE CASCADE
);

-- Table User
CREATE TABLE User (
    login VARCHAR(50) PRIMARY KEY,
    password CHAR(32) NOT NULL
);
```
