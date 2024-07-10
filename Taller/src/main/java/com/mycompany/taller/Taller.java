/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
public class Taller{
    public static void main(String[] args) {
        // Builder
        Report report = new Report.ReportBuilder()
                .setTitle("Annual Report")
                .setContent("This is the content of the annual report.")
                .setAuthor("John Doe")
                .setType("PDF")
                .build();

        // Decorator
        ReportGenerator reportGenerator = new BasicReportGenerator(report);
        reportGenerator = new HeaderDecorator(reportGenerator);
        reportGenerator = new FooterDecorator(reportGenerator);
        reportGenerator = new ColorDecorator(reportGenerator);
        reportGenerator.generate();

        // Adapter
        NotificationService emailService = new EmailNotificationAdapter(new EmailNotification());
        NotificationService whatsappService = new WhatsAppNotificationAdapter(new WhatsAppNotification());
        NotificationService telegramService = new TelegramNotificationAdapter(new TelegramNotification());

        emailService.send("This is an email notification");
        whatsappService.send("This is a WhatsApp notification");
        telegramService.send("This is a Telegram notification");
    }
}
