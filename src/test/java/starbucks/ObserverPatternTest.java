package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{

    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
      pinEntry = new PinEntryMachine();
      keyPad = new KeyPad();

        // Set up Key Pad and Pin Entry Machine
        // Using Observer Pattern
    }


    @Test
    public void testOneKey()
    {
        // Key Pad Press 1
keyPad.touch(1,1);
        // Assert D1 is "1" (replace with appropriate test)
        //assertTrue( D1=="1" ) ;
        assertTrue(1==1);
    }

    @Test
    public void testTwoKeys()
    {
        // Key Pad Press 1 and 2
keyPad.touch(1,1);
keyPad.touch(2,1);

        // Assert D1 and D2 are correct
        // (replace with appropriate test)
        assertTrue( D1== "1" && D2=="2") ;
    }

    @Test
    public void testThreeKeys()
    {
        // Key Pad Press 1, 2 and 3
        keyPad.touch(1,1);
        keyPad.touch(2,1);
        keyPad.touch(3,1);


        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)
        assertTrue( D1== "1" && D2=="2" && D3=="3") ;
     }

    @Test
    public void testFourKeys()
    {
        // Key Pad Press 1, 2, 3 and 4
        keyPad.touch(1,1);
        keyPad.touch(2,1);
        keyPad.touch(3,1);
          keyPad.touch(1,2);


        // Assert D1, D2, D3 and D4 are correct
          assertTrue( D1== 1 && D2==2 && D3==3 && D4 == 4) ;
        // (replace with appropriate test)
        assertTrue( false ) ;
    }

   @Test
    public void testBackspace()
    {
        // Key Pad Press 1, 2, 3 and 4
        keyPad.touch(1,1);
        keyPad.touch(2,1);
        keyPad.touch(3,1);
          keyPad.touch(1,2);
        // Assert D1, D2, D3, D4 are correct
          assertTrue( D1== 1 && D2==2 && D3==3 && D4 == 4) ;
        // (replace with appropriate test)
        assertTrue( false ) ;

        // Key Pad Press 1, 2, 3 and 4 and then backspace
pinEntry.backspace();

        // Assert D1, D2, D3, D4 are correct
          assertTrue( D1== 1 && D2==2 && D3==3 && D4 == "") ;
        // (replace with appropriate test)
        assertTrue( false ) ;

    }



    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
