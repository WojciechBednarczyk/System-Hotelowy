import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class pokojTest {

    Pokoj pokoj;

    @Before
    public void setUp()
    {
        pokoj = new Pokoj(101,"Premium",2,1,100);
    }


    @Test
    public void testZajmijPokoj(){
        pokoj.zajmijPokoj();
        assertFalse(pokoj.isDostepnosc());
    }

    @Test
    public void testZwolnijPokoj(){
        pokoj.zwolnijPokoj();
        assertTrue(pokoj.isDostepnosc());
    }
}
