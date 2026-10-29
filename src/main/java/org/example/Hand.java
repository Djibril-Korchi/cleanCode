package org.example;

public class Hand {
    private int nbhand;
    private Carte[][] hand;
    private boolean quinteFluch;
    private boolean carre;

    public Hand(int nbhand,Carte[][] hand) {
        this.nbhand = nbhand;
        this.hand = hand;
        quinteFluch = true;
        carre = true;
    }
    public int CalculHand(){
        int score=0;
        for (int i = 0;i <nbhand;i++){
            if(quinteFluch&&QuinteFlush(hand[i])){
                score+=80;
            }
            else if(carre&&Carre(hand[i])){
                score+=60;
            }
            else{
                int value=0;
                for(int j = 0; j<5;j++){

                    if(hand[i][j].getNumber()>value){
                        value=hand[i][j].getNumber();
                    }

                }
                score+=value;
            }

        }
        return score;
    }
    public boolean QuinteFlush(Carte[] cartes){
        if(cartes[0].getCouleur()==cartes[1].getCouleur()&&cartes[0].getCouleur()==cartes[2].getCouleur()&&cartes[0].getCouleur()==cartes[3].getCouleur()&&cartes[0].getCouleur()==cartes[4].getCouleur()){
            quinteFluch = false;
            return true;
        }
        return false;

    }

    public boolean Carre(Carte[] cartes){
        int count = 0;
        for (int i = 0; i<2;i++){
            for (int j = i+1; j < 5; j++) {
                if(cartes[i].getNumber()==cartes[j].getNumber()){
                    count++;
                }
            }
            if(count>3){
                carre = false;
                return true;
            }
            count = 0;
        }
        return false;

    }

}
