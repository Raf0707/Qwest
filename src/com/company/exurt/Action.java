package com.company.exurt;

public class Action {
    private String description;
    private int IdNextLocation;
    String getText() {
        return description;
    }
    int getNextLocationId() {
        return IdNextLocation;
    }

    public Action(String text, int idNextLocation) {
        this.description = text;
        IdNextLocation = idNextLocation;
    }
}
