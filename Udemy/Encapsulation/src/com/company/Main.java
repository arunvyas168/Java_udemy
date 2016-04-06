package com.company;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Arun",200,"Gun");
        System.out.println("health of the player is: "+ player.getHealth());

        EnhancedPlayer player2 = new EnhancedPlayer("Shal",50,"knife");
        System.out.println("health of the player is: "+ player2.getHealth());
    }
}
