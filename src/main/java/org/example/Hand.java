package org.example;

public class Hand {
    private int nbhand;
    private Carte[][] hand;

    public Hand(int nbhand,Carte[][] hand) {
        this.nbhand = nbhand;
        this.hand = hand;
    }
    public int CalculHand(){
        int score=0;
        for (int i = 0;i <nbhand;i++){
            int value=0;
            for(int j = 0; j<5;j++){

                if(hand[i][j].getNumber()>value){
                    value=hand[i][j].getNumber();
                }

            }
            score+=value;
        }
        return score;
    }
}
