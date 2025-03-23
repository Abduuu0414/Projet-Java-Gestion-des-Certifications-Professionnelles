/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author admin
 */

public class EmailSender {

    public static void sendEmail(String toEmail, String newPassword) {
        final String username = "a.bouanani2566@uca.ac.ma"; // Remplacez par votre email
        final String password = "qqoo vwym tnad nymc";

        // configuration des props pour SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Serveur SMTP de Gmail
        props.put("mail.smtp.port", "587"); // Port pour Gmail

        // creation de la session
        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            // creation du message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Réinitialisation de votre mot de passe");
            message.setText("Votre nouveau mot de passe temporaire est : " + newPassword);

            // envoi du message
            Transport.send(message);

            System.out.println("Email envoyé avec succès.");

        } catch (MessagingException e) {
            throw new RuntimeException("Erreur lors de l'envoi de l'email : " + e.getMessage());
        }
    }
}
