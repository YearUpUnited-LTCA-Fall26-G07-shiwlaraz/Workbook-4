package com.pluralsight;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
//        Deck deck = new Deck();
//        Hand hand1 = new Hand();
//        // deal 5 cards
//        for (int i = 0; i < 5; i++) {
//        // get a card from the deck
//            Card card = deck.deal();
//        // deal that card to the hand
//            hand1.deal(card);
//        }
//        int handValue = hand1.getValue();
//        System.out.println("This hand is worth " + handValue);


        ArrayList<Player> players = new ArrayList<>();

        int playerCount = Console.promptForInt("Enter the player count");

        for (int i = 0; i < playerCount; i++) {
            String playerName = Console.promptForString("Enter The Player Name");
            Player player = new Player(playerName);
            players.add(player);

        }

        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                player.getHand().deal(deck.deal());
            }
        }
        Player winner = null;
        int winningScore = 0;

        for (Player player : players) {
            System.out.printf("%s : ",
                    player.getName());
            player.getHand().displayHand();

            int score = player.getHand().getValue();
            System.out.println("Score: " + score);

            if(score <= 21 && score > winningScore)
            {
                winningScore = score;
                winner = player;
            }
            if(winner != null)
            {
                System.out.println("Winner | : "+ winner.getName()
                        +" with | "+winningScore+" points!");
            }
            else
            {
                System.out.println("Everyone busted!");
            }
        }
    }
}