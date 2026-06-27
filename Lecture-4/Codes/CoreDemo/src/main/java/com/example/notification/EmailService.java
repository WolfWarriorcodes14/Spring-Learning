package com.example.notification;

public class EmailService implements NotificationService {

    @Override
    public void SendNotification(){
        System.out.println("Email Notification Sent !!");
    }
}
