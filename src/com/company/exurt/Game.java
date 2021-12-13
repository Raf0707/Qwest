package com.company.exurt;

public class Game implements UserChoiceListener {
    Storage storage;
    View view;
    Location curLocation;
    Game(Storage storage, View view) {
        this.storage = storage;
        this.view = view;
    }

    void start() {
        curLocation = storage.getLocation(0);
        view.showLocation(curLocation);
    }

    public void userChoice(int actionIndex) {
        int idLoc = curLocation.getActions()[actionIndex].getNextLocationId();
        curLocation = storage.getLocation(idLoc);
        view.showLocation(curLocation);
        if (idLoc != 1) {
            curLocation = storage.getLocation(idLoc);
            view.showLocation(curLocation);
        }
    }

    @Override
    public void UserChoice(int n) {

    }
}
