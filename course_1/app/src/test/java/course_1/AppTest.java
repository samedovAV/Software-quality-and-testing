/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package course_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;

public class AppTest {

    App mApp;

    @Before
    public void Setup()
    {
       mApp = new App( 0 ); 
    }

    @Test
    public void multiplicationOfZeroIntegereShouldReturnZero() {
        App vApp = new App(); //can be heavyweight!

        assertEquals(  "10 x 0 must be 0", 0, vApp.multiply(10, 0) );
        assertEquals(  "0 x 10 must be 0", 0, vApp.multiply(0, 10) );
        assertEquals( "0 x 0 must be 0", 0, vApp.multiply(0, 0) );
    }

    @Test
    public void multiplicationOfZeroIntegereShouldReturnZeroWithMember() {
        assertEquals(  "10 x 0 must be 0", 0, mApp.multiply(10, 0) );
        assertEquals(  "0 x 10 must be 0", 0, mApp.multiply(0, 10) );
        assertEquals( "0 x 0 must be 0", 0, mApp.multiply(0, 0) );
    }

    @Test
    public void beforeAffectsTest(){
        assertFalse( false );
    }

    @After
    public void TearDown()
    {
        assert( true );
    }
}
