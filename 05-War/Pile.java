import java.util.*;

public class Pile {

  private ArrayList<Card> pile; //ArrayList of Cards  to store
  private ArrayList<Card> pile1;
  private ArrayList<Card> pile2;

  public Pile(){
    this.pile  = p;
    this.pile1 = new ArrayList<Card>();
    this.pile2 = new ArrayList<Card>();
  }//end CardPile

  public ArrayList<Card> getPile1(){
    return this.pile1;
  }
  public ArrayList<Card> getPile2(){
    return this.pile2;
  }

  public void seperate(){
    for(int = 0; i < 26; i++){
      this.pile1.add(pile.get(i));
    }
    for(int i = this.pile.size()/2; i < 52; i++){
      this.pile2.add(pile.get(i));

    }

  }//end addCard









}//end calss
