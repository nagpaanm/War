/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * @modifier: Anmol Nagpal
 * @date: April 19th, 2019
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards = new ArrayList();
    private int size;//the size of the grouping
    private final String [] valueList = {"A", "2", "3", "4", "5", "6", "7", 
                    "8", "9", "10", "J", "Q", "K"};
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public void addCard(Card card){
        if(canPut(card.toString())){
            cards.add(card);
        }
    }
    
    //helper method - to see if we are able to put card in deck (if more than
    // 4 occurences already then we cannot place card in deck
    private boolean canPut(String val){
        int count = 0;
        boolean canPut = true;
        for(int i = 0; i < cards.size(); i++){
            if(cards.get(i).toString().equals(val)){
                count++;
            }
        }
        if(count >= 4){
            canPut = false;
        }
        
        return canPut;
    }
    
    public Card RemoveCard(){
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
    
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public int lengthOfDeck(){
        return cards.size();
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    public void compareCards(Player p1, Player p2){
        int indexC1 = Arrays.asList(valueList).indexOf(p1.getCard().toString());
        int indexC2 = Arrays.asList(valueList).indexOf(p2.getCard().toString());
        if(indexC1 > indexC2){
            System.out.println(p1.getPlayerID() + " Wins!");
            p1.setScore();
        }else if (indexC1 < indexC2){
            System.out.println(p2.getPlayerID() + " Wins!");
            p2.setScore();
        }
        else{
            System.out.println("DRAW!");
        }
    }
    
}//end class
