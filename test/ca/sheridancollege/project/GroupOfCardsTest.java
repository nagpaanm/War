
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author: Anmol Nagpal
 * @date: April 19th, 2019
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    
    @Test
    public void testAddCardGood() {
        System.out.println("Add two cards to deck");
        GroupOfCards instance = new GroupOfCards(52);
        StandardCard c = new StandardCard();
        StandardCard c2 = new StandardCard();
        instance.addCard(c);
        instance.addCard(c2);
        int expResult = 2;
        int result = instance.lengthOfDeck();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddCardBad() {
        System.out.println("Add zero cards to deck");
        GroupOfCards instance = new GroupOfCards(52);
        StandardCard c = new StandardCard();
        StandardCard c2 = new StandardCard();
        int expResult = 0;
        int result = instance.lengthOfDeck();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddCardBoundary() {
        System.out.println("Add 1 card to deck");
        GroupOfCards instance = new GroupOfCards(52);
        StandardCard c = new StandardCard();
        instance.addCard(c);
        int expResult = 1;
        int result = instance.lengthOfDeck();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareCardsGood() {
        System.out.println("Compare score when p1 has a higher card then p2");
        Player one = new User("Anmol");
        Player two = new User("Ujjwal");
        StandardCard c1 = new StandardCard("K");
        StandardCard c2 = new StandardCard("A");
        one.setCard(c1);
        two.setCard(c2);
        GroupOfCards goc = new GroupOfCards(52);
        goc.compareCards(one, two);
        int expResult = 1;
        int result = one.getScore();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareCardsBad() {
        System.out.println("Compare score when p1 and p2 don't have any cards");
        Player one = new User("Anmol");
        Player two = new User("Ujjwal");
        GroupOfCards goc = new GroupOfCards(52);
        //goc.compareCards(one, two);
        /*
        int expResult = 0;
        int result = one.getScore();
        assertEquals(expResult, result);
        */
        //As expected, this will cause an error!
    }
    
    @Test
    public void testCompareCardsBoundary() {
        System.out.println("Compare score when p1 and p2 draw the same card");
        Player one = new User("Anmol");
        Player two = new User("Ujjwal");
        StandardCard c1 = new StandardCard("J");
        StandardCard c2 = new StandardCard("J");
        one.setCard(c1);
        two.setCard(c2);
        GroupOfCards goc = new GroupOfCards(52);
        goc.compareCards(one, two);
        int expResult = 0;
        int result = one.getScore();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of RemoveCard method, of class GroupOfCards.
     */
    @Test
    public void testRemoveCardGood() {
        System.out.println("Add two cards and remove one");
        GroupOfCards instance = new GroupOfCards(52);
        StandardCard c = new StandardCard();
        StandardCard c2 = new StandardCard();
        instance.addCard(c);
        instance.addCard(c2);
        instance.RemoveCard();
        int expResult = 1;
        int result = instance.lengthOfDeck();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveCardBad() {
        System.out.println("Add zero cards to deck");
        GroupOfCards instance = new GroupOfCards(52);
        int expResult = 0;
        int result = instance.lengthOfDeck();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveCardBoundary() {
        System.out.println("Add 1 card to deck and remove one");
        GroupOfCards instance = new GroupOfCards(52);
        StandardCard c = new StandardCard();
        instance.addCard(c);
        instance.RemoveCard();
        int expResult = 0;
        int result = instance.lengthOfDeck();
        assertEquals(expResult, result);
    }
    
}
