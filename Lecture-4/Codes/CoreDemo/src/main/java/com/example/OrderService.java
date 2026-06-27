package com.example;

import com.example.notification.EmailService;
import com.example.notification.NotificationService;
import com.example.notification.PopUpNotificationService;
import com.example.notification.SmsService;

public class OrderService {

    NotificationService notification ;
//    NotificationService notification1 ;
//    NotificationService notification2;

    public OrderService(NotificationService notification){
        this.notification = notification;
    }

    public void PlaceOrder(){
        System.out.println("Order Placed!");
        notification.SendNotification();
//        notification1.SendNotification();
//        notification2.SendNotification();



    }
}
