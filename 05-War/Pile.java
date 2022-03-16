import java.util.*;

public class Pile {

  private int ArrayList<Card> pile; //ArrayList of Cards  to store

  public CardPile(){
    pile = new ArrayList<Card>();
  }//end CardPile

  public void addCard(C){
    pile.add(C); // puts a Card at the end ("bottom") of the pile.
  }//end addCard

  public Card getTopCard(){
    return pile.remove(0); //removes and returns the "top" card of the pile.
  }//end getTopCard







}//end calss
