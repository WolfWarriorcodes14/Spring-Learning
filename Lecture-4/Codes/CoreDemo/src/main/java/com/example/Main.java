package com.example;

import com.example.notification.EmailService;
import com.example.notification.FakeEmailService;
import com.example.notification.NotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification = new EmailService();
        System.out.println("Hello and welcome!");
        OrderService order = new OrderService(notification);
        order.PlaceOrder();

        //  a class should ask everything
        // it should not create everything

        //IOC
    }
}