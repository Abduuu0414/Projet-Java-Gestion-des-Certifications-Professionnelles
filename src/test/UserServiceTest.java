/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.User;
import services.UserService;

/**
 *
 * @author admin
 */
public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Test ajout utilisateur
        User user = new User("a.bouanani2", "123");
        if (userService.addUser(user)) {
            System.out.println("Utilisateur ajouté avec succès.");
        } else {
            System.out.println("Échec de l'ajout de l'utilisateur.");
        }

        // Test recherche utilisateur
        User foundUser = userService.findUserByLogin("testUser");
        if (foundUser != null) {
            System.out.println("Utilisateur trouvé: " + foundUser);
        } else {
            System.out.println("Utilisateur non trouvé.");
        }

        // Test authentification
        if (userService.authenticate("testUser", "password123")) {
            System.out.println("Authentification réussie.");
        } else {
            System.out.println("Échec de l'authentification.");
        }
    }
}
