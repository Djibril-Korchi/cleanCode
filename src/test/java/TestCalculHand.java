import org.example.Carte;
import org.example.CarteType;
import org.example.Hand;
import org.testng.annotations.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculHand {
    @Test
    public void ChooseBestCard(){
        int nbHand = 1;
        Carte carte1 = new Carte(CarteType.COEUR,2);
        Carte carte2 = new Carte(CarteType.CARREAU,4);
        Carte carte3 = new Carte(CarteType.PIQUE,2);
        Carte carte4 = new Carte(CarteType.COEUR,3);
        Carte carte5 = new Carte(CarteType.TREFLE,6);
        Carte main[][] = new Carte[nbHand][5];
        main[0][0]= carte1;
        main[0][1]= carte2;
        main[0][2]= carte3;
        main[0][3]= carte4;
        main[0][4]= carte5;

        Hand hand = new Hand(nbHand,main);
        assertEquals("6",hand.CalculHand());
    }



}
