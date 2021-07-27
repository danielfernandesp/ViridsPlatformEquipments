package com.ViridisPlatform;

import  com.Control.ControlEquipmentRegister;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("|   Welcome to Virids Platform: Register equipment module  |");
        System.out.println("|   Options:                                               |");
        System.out.println("|        1. Option 1: Register Equipment                   |");
        System.out.println("|        2. Option 2: Search for Registered Equipment      |");
        System.out.println("|        4. Option 3: List All Registered Equipments       |");
        System.out.println("|        5. Exit                                           |");
        Scanner sc = new Scanner(System.in);
        int swValue = sc.nextInt();

        // Switch construct
        switch (swValue) {
            case 1:
                System.out.println("Option 1 selected: Register Equipment");
                ControlEquipmentRegister CER = new ControlEquipmentRegister();
                CER.registerEquipment();
                break;
            case 2:
                System.out.println("Option 2 selected: Search for Registered Equipment");
                break;
            case 3:
                System.out.println("Option 3 selected: List All Registered Equipments ");
                break;
            case 4:
                System.out.println("Exit Selected");
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }
}
