/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
public class TelegramNotificationAdapter implements NotificationService {
    private TelegramNotification telegramNotification;

    public TelegramNotificationAdapter(TelegramNotification telegramNotification) {
        this.telegramNotification = telegramNotification;
    }

    @Override
    public void send(String message) {
        telegramNotification.sendTelegram(message);
    }
}
