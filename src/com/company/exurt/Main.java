package com.company.exurt;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        View view = new View();
        Game game = new Game(storage, view);
        view.showLocation(storage.getLocation(2));
        view.setUserChoiceListener(game);
        game.start();



    }
}
