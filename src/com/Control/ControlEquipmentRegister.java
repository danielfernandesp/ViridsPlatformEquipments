package com.Control;

import com.Model.EquipmentRegister;

import java.util.Scanner;
import java.util.ArrayList;

public class ControlEquipmentRegister {

    public void registerEquipment(){

        String inName;
        int inID;
        int control;

        ArrayList<EquipmentRegister> ER = new ArrayList<EquipmentRegister>();
        control = 1;

        System.out.println("Equipment Register: to exit please type 0 any time");

        while(true){
            System.out.println("Entre com nome do Equipamento," + "e ID do equipamento (separado por espaço)");
            Scanner sc = new Scanner(System.in);
            String in  = sc.nextLine();
            String[] dataIn;
            dataIn = in.split(" ");
            try{
                inName = dataIn[0];
                inID = Integer.parseInt(dataIn[1]);
            } catch (Exception e) {
                System.err.println("Entre com um nome válido e um ID valido");
                System.err.println("O sistema encerrará");
                System.exit(0);
            }
            System.out.println("Deseja cadastrar um medido para este equipamento? 1- Sim, 2 - Nao");
        }
    }
}
