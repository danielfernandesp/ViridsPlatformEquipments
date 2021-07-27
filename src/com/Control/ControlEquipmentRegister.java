package com.Control;

import com.Model.EquipmentMeasurer;
import com.Model.EquipmentRegister;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ControlEquipmentRegister {

    public void registerEquipment(){

        String inNameEquipment, inNameMeasure;
        int inIDEquipment, control;

        List<EquipmentRegister> ER = new ArrayList<EquipmentRegister>();
        List<EquipmentMeasurer> EM = new ArrayList<EquipmentMeasurer>();

        control = 1;

        System.out.println("Equipment Register: to exit please type 0 any time");

        while(true){
            System.out.println("Entre com nome do Equipamento " + "e ID do equipamento (separado por espaço)");
            Scanner sc = new Scanner(System.in);
            String in  = sc.nextLine();
            String[] dataIn;
            dataIn = in.split(" ");

            try{
                inNameEquipment = dataIn[0];
                inIDEquipment = Integer.parseInt(dataIn[1]);
                ER.add(new EquipmentRegister(inIDEquipment,inNameEquipment));
            } catch (Exception e) {
                System.err.println("Entre com um nome válido e um ID valido");
                System.err.println("O sistema encerrará");
                System.exit(0);
            }
            System.out.println("Deseja cadastrar um medidor para este equipamento? 1- Sim, 2 - Nao"); // mudar para boolean
            int sw = sc.nextInt();
            if(sw == 1){
                System.out.println("Entre com o nome do medidor" + "e sua resolucao (Minuto, Hora ou Dia) separado por espaco");
                try{
                    inNameMeasure = dataIn[3];
                    inIDEquipment =
                }catch (Exception e){

                }
            }

        }
    }
}
