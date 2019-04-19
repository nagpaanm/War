
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
