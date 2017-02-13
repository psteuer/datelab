package datelab;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    
    Date d1 = new Date(1996, 3, 27);
    Date d2 = new Date(2017, 2, 13);
    Date d3 = new Date(1995, 3, 27);
    Date d4 = new Date(1995, 3, 26);
    Date d5 = new Date(1995, 3, 28);
   
    
    @Test
    public void testPrintmessage(){
        assertEquals(0, d1.daysTo(d1));
        assertEquals(365, d3.daysTo(d1));
        assertEquals(1, d4.daysTo(d3));
        
    }
    
    @Test
    public void errormessages1(){
         assertEquals(1, d5.daysTo(d3)); //fails
    }
    
    @Test
    public void errormessagees2(){
       assertEquals(2, d2.daysTo(d1)); //fails
    }

}

