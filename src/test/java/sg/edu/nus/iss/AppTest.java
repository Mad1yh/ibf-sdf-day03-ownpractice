package sg.edu.nus.iss;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void testListAllUsers()
    {
        shoppingCartDB db = new shoppingCartDB("cartdb");
        List<String> users = db.listUsers();
        System.out.println(!users.isEmpty());
        if(!users.isEmpty()){
            System.out.println("not empty");
        }
        assertTrue(!users.isEmpty());
    }
    
}