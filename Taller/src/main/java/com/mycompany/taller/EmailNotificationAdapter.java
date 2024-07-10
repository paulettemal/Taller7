/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
public class EmailNotificationAdapter implements NotificationService {
    private EmailNotification emailNotification;

    public EmailNotificationAdapter(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

    @Override
    public void send(String message) {
        emailNotification.sendEmail(message);
    }
}