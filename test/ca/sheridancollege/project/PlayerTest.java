
package ca.sheridancollege.project;

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
public class PlayerTest {
    
    public PlayerTest() {
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

    @Test
    public void testGetCardGood() {
        System.out.println("Add two cards to player deck and show it");
        Player instance = new User("Anmol");
        StandardCard c1 = new StandardCard("A");
        StandardCard c2 = new StandardCard("4");
        instance.setCard(c1);
        instance.setCard(c2);
        String expResult = "4";
        String result = instance.getCard().toString();
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testGetCardBad() {
        System.out.println("Add no cards to player deck and show it");
        Player instance = new User("Anmol");
        String expResult = null;
        Card result = instance.getCard();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCardBoundary() {
        System.out.println("Add 1 card to player deck and show it");
        Player instance = new User("Anmol");
        StandardCard c1 = new StandardCard("A");
        instance.setCard(c1);
        String expResult = "A";
        String result = instance.getCard().toString();
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testGetScoreGood() {
        System.out.println("Add 2 points to player and show it");
        Player instance = new User("Anmol");
        instance.setScore();
        instance.setScore();
        int expResult = 2;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetScoreBad() {
        System.out.println("Add zero points to player and show it");
        Player instance = new User("Anmol");
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetScoreBoundary() {
        System.out.println("Add 1 point to player and show it");
        Player instance = new User("Anmol");
        instance.setScore();
        int expResult = 1;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }
    
}
