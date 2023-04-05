package com.example.hibernate;


import com.example.hibernate.model.Emploee;
import com.example.hibernate.service.EmploeeService;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmploeeService emploeeService = new EmploeeService();
        Emploee emploee = new Emploee("Житарь", "Виктор", "МЕН", 18, 3);
        emploeeService.addEmploee(emploee);
        System.out.println();
        emploeeService.findById(3);
        System.out.println();
        emploeeService.getAllEmploee();
        System.out.println();
        Emploee emploee1 = new Emploee("Житарь", "Максим", "МЕН", 11, 3);
        emploeeService.updateEmploee(15, emploee1);
        System.out.println();
        emploeeService.deleteEmploeeById(15, emploee1);
    }
}
