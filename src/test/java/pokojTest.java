import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(false,pokoj.isDostepnosc());
    }

    @Test
    public void testZwolnijPokoj(){
        pokoj.zwolnijPokoj();
        assertEquals(true,pokoj.isDostepnosc());
    }
}
