/*
@author: Anmol Nagpal
@date: April 19th, 2019
 */
package ca.sheridancollege.project;

import java.util.Random;

public class StandardCard extends Card{
    
    private final String [] valueList = {"A", "2", "3", "4", "5", "6", "7", 
                    "8", "9", "10", "J", "Q", "K"};
    private String value;
    
    public StandardCard(){
        Random rand = new Random();
        int randomNum = rand.nextInt(13); //obtains a number between 0 and 12
        this.value = valueList[randomNum];
    }
    
    public StandardCard(String cardValue){
        this.value = cardValue;
    }

    @Override
    public String toString() {
        return this.value;
    }
    
}
