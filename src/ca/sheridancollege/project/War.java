/*
 
@author: Anmol Nagpal
@date: April 19th, 2019

 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class War extends Game{
    
    Scanner sc = new Scanner(System.in);
    public GroupOfCards GOC = new GroupOfCards(52);
    User p1;
    User p2;
    
    
    public War(String givenName) {
        super(givenName);
    }
    public void setUp(){
        while(GOC.lengthOfDeck() < 52){
            StandardCard sc = new StandardCard();
            GOC.addCard(sc);
        }
        GOC.shuffle();
    }
    
    public void drawCard(Player player){
        player.setCard(GOC.RemoveCard());
    }
    
    public Card showCard(Player player){
        return player.getCard();
    }
    
    public void Process(Player p1, Player p2){
        System.out.println();
        System.out.print(p1.getPlayerID() + ", press enter to draw a card: ");
        sc.nextLine();
        drawCard(p1);
        System.out.println(p1.getPlayerID() + " has drawn a card!");
        System.out.println();
        System.out.print(p2.getPlayerID() + ", press enter to draw a card: ");
        sc.nextLine();
        drawCard(p2);
        System.out.println(p2.getPlayerID() + " has drawn a card!");
        System.out.println();
        System.out.print("It's time for WAR! Press enter to continue:");
        sc.nextLine();
        System.out.println();
        System.out.println(p1.getPlayerID() + " drawed a: " + 
                showCard(p1).toString());
        System.out.println(p2.getPlayerID() + " drawed a: " + 
                showCard(p2).toString());
        GOC.compareCards(p1, p2);
        System.out.println();
        System.out.println("Cards left in deck: " + GOC.lengthOfDeck());
    }
    
    private void instructions(){
        String instructions = "2 Players draw a random card from a "
                + "shuffled deck of cards. They then compare the 2 cards to one"
                + "\nanother - the player with a higher ranking card wins."
                + " The rankings are the following, from lowest to highest: \n"
                + "A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K";
        System.out.println(instructions);
    }
    
    @Override
    public void play(){
        System.out.println("Welcome to " + getGameName());
        System.out.println("Here is how this game is played: ");
        instructions();
        System.out.println("");
        
        System.out.print("Player One - Enter your name: ");
        String p1Name = sc.nextLine();
        System.out.print("Player two - Enter your name: ");
        String p2Name = sc.nextLine();
        p1 = new User(p1Name);
        p2 = new User(p2Name);
        System.out.println("Welcome " + p1.getPlayerID() + " and " + 
                p2.getPlayerID() + "!");
        System.out.println("Get ready for WAR!");
        ArrayList<Player> playersList = new ArrayList();
        playersList.add(p1);
        playersList.add(p2);
        setUp();
        setPlayers(playersList);
        Process(p1, p2);
        System.out.print("Press 1 to play again, or any other key to quit:");
        while(sc.nextLine().equals("1") && GOC.lengthOfDeck() >= 2){
            Process(p1, p2);
            System.out.print("Press 1 to play again, or any other key to quit:");
        }
        declareWinner();
       
    }

    @Override
    public void declareWinner() {
        System.out.println(p1.getPlayerID() + " - score: " + p1.getScore());
        System.out.println(p2.getPlayerID() + " - score: " + p2.getScore());
         if(p1.getScore() > p2.getScore()){
             System.out.println(p1.getPlayerID() + " is the winner!");
        }else if(p2.getScore() > p1.getScore()){
            System.out.println(p2.getPlayerID() + " is the Winner!");
        }else{
            System.out.println(p1.getPlayerID() + " and " + p2.getPlayerID() +
                    " drawed!");
        }
    }
    
}
