package com.example.notification;

public class FakeEmailService implements NotificationService{
    @Override
    public void SendNotification(){
        System.out.println("Fake Email Called");
    }
}
