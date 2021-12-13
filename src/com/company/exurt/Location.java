package com.company.exurt;

public class Location {
    private String descriptiom;
    private Action[] actions;
    private int id;
    String getText() {
        return descriptiom;
    }
    Action[] getActions() {
        return actions;
    }

    public Location(int id, String text, Action[] actions) {
        this.id = id;
        this.descriptiom = text;
        this.actions = actions;

    }
}
