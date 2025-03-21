# Gestion des Certifications Professionnelles

Ce projet est une application de gestion des certifications professionnelles. Il permet de gérer les certifications, les étudiants et leurs inscriptions aux certifications. L'application est développée en Java avec une base de données MySQL.

## Fonctionnalités

- **Ajouter une certification** : Permet d'ajouter une nouvelle certification avec son nom, l'organisme et le coût.
- **Inscrire un étudiant** : Permet d'ajouter un nouvel étudiant avec son nom, prénom et email.
- **Filtrer les inscriptions par certification** : Permet de lister les inscriptions pour une certification donnée.
- **Rechercher un étudiant par certification** : Permet de rechercher une certification par son nom.

## Digramme de cas d'utilisation

![image](https://github.com/user-attachments/assets/1a20e16e-49b4-49b5-936b-e6dfaff3b857)



## Diagramme de classe

![image](https://github.com/user-attachments/assets/60b600fd-9ebf-4727-89fe-af77aeb922ee)



## Structure de la Base de Données

La base de données MySQL est composée des tables suivantes :

- **Certification** : Contient les informations sur les certifications.
- **Étudiant** : Contient les informations sur les étudiants.
- **InscriptionCertification** : Contient les informations sur les inscriptions des étudiants aux certifications.

### Schéma de la Base de Données

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
