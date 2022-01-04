import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class aplikacjaTest {

    Pokoj pokoj1;
    Pokoj pokoj2;

    int iloscDni;
    int iloscOsob;
    String poczatekPobytu;
    ArrayList<Pokoj> wybranePokoje;
    String imie;
    String nazwisko;
    String numerDowodu;

    @Before
    public void setUp(){

        pokoj1 = new Pokoj(101,"Premium",1,1,100);
        pokoj2 = new Pokoj(102,"Premium",1,2,100);
        iloscDni=2;
        iloscOsob=2;
        poczatekPobytu = "20.01.2022";
        wybranePokoje = new ArrayList<>();
        wybranePokoje.add(pokoj1);
        wybranePokoje.add(pokoj2);
        imie="Jan";
        nazwisko="Kowalski";
        numerDowodu="ABC123456";

    }

    @Test
    public void dodajRezerwacjeTest()
    {
        Aplikacja.dodajRezerwację(iloscDni,iloscOsob,poczatekPobytu,wybranePokoje,imie,nazwisko,numerDowodu);
        assertEquals(1,Aplikacja.getRezerwacje().size());
    }

    @Test
    public void zmienTerminTest()
    {
        Aplikacja.getRezerwacje().get(0).zmienTermin("25.01.2022");
        assertEquals("25.01.2022",Aplikacja.getRezerwacje().get(0).getDaneRezerwacji().getPoczatekPobytu());
    }

    @Test
    public void anulujRezerwacjeTest()
    {
        Aplikacja.anulujRezerwacje(0);
        assertEquals(0,Aplikacja.getRezerwacje().size());
    }
}
