package com.Model;

public class EquipmentRegister {

    private int code;
    private String name;

    // Constructor for the class
    public EquipmentRegister(int code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getters and setters methods
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
