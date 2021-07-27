package com.Model;

import java.util.Date;

public class EquipmentMeasurer extends EquipmentRegister{

    private String name;
    private Date()

    protected EquipmentMeasurer(int code, String name) {
        super(code, name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
