package com.pluralsight;

import java.util.ArrayList;

public class Hand{
    private ArrayList<Card> cards;
    public Hand() {
        cards = new ArrayList<>();
    }

    public void deal (Card card) {
        cards.add(card);

    }
    public int getSize(){
        return cards.size();
    }
    public ArrayList<Card> getCards()
    {
        return cards;
    }
    public int getValue() {

        int total = 0;
        int aceCount = 0;

        for (Card card : cards) {

            if (card.isFaceUp() == false) {
                card.flip();
            }
            int points = card.getPointValue();

            total = total + points;


            if (card.getValue().equalsIgnoreCase("A")) {
                aceCount = aceCount + 1;
            }
        }


        while (total > 21 && aceCount > 0) {
            total = total - 10;
            aceCount = aceCount - 1;
        }

        return total;
    }
    public void displayHand() {

        for (Card card : cards) {

            if (card.isFaceUp() == false) {
                card.flip();
            }

            String value = card.getValue();
            String suit = card.getSuit();

            System.out.println(value + " of " + suit);
        }
    }

}