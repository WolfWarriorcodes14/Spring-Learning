package com.example.notification;

public class SmsService implements NotificationService{
    @Override
    public void SendNotification(){
       System.out.println("Sms Notification Sent");
   }
}
