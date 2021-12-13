package com.company.exurt;

import java.util.Scanner;

public class View {
    private UserChoiceListener ucl;

    public void setUserChoiceListener(UserChoiceListener ucl) {
        this.ucl = ucl;
    }

    static Scanner sc = new Scanner(System.in);
    void showLocation(Location location) {
        System.out.println(location.getText());
        Action[] actions = location.getActions();
        for (int i = 0; i < actions.length; ++i) {
            System.out.println(i + 1 + ") " + actions[i].getText());
        }
        int choice = sc.nextInt();
        ucl.userChoice(choice - 1);

    }
}