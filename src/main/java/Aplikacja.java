import java.util.ArrayList;
import java.util.Iterator;

public class Aplikacja {

private static ArrayList<Rezerwacja> listaRezerwacji = new ArrayList<>();
private static ArrayList<Hotel> listaHoteli = new ArrayList<>();

    public static ArrayList<Rezerwacja> getRezerwacje()
    {
        return listaRezerwacji;
    }

    public static void setRezerwacje(ArrayList<Rezerwacja> listaRezerwacjiNowa)
    {
        listaRezerwacji=listaRezerwacjiNowa;
    }

    public static void dodajRezerwację(int iloscDni, int iloscOsob, String poczatekPobytu, ArrayList<Pokoj> wybranePokoje, String imie, String nazwisko, String numerDowodu){
        DaneRezerwacji daneRezerwacji = new DaneRezerwacji(iloscDni,iloscOsob,poczatekPobytu,wybranePokoje);
        Klient daneKlienta = new Klient(imie,nazwisko,numerDowodu);
        Rezerwacja rezerwacja = new Rezerwacja(daneRezerwacji,daneKlienta,listaRezerwacji.size());
        listaRezerwacji.add(rezerwacja);
    }
    public static void zmienTermin(String nowyTermin, int IDRezerwacji){
        if(szukajRezerwacji(IDRezerwacji)!=null)
        {
            szukajRezerwacji(IDRezerwacji).zmienTermin(nowyTermin);
        }
    }

    public static void anulujRezerwacje(int IDRezerwacji)
    {
        if(szukajRezerwacji(IDRezerwacji) != null)
        {
            listaRezerwacji.remove(szukajRezerwacji(IDRezerwacji));
        }
    }

    public static Rezerwacja szukajRezerwacji(int IDRezerwacji)
    {
        for(Rezerwacja rezerwacja : listaRezerwacji)
        {
            if(rezerwacja.getIDRezerwacji()==IDRezerwacji)
            {
                return rezerwacja;
            }
        }
        return null;
    }

    public void przydzielPokoj()
    {
        Rezerwacja rezerwacja;
        Iterator<Rezerwacja> it = listaRezerwacji.iterator();
        while(it.hasNext())
        {
            rezerwacja = it.next();
            if (rezerwacja.czyZatwierdzona() == false)
            {
                DaneRezerwacji daneRezerwacji;
                daneRezerwacji = rezerwacja.getDaneRezerwacji();
                ArrayList<Pokoj> pokoje;
                pokoje=daneRezerwacji.getWybranePokoje();
                for(Pokoj pokoj : pokoje)
                {
                    pokoj.zajmijPokoj();
                }
            }
        }
    }

    public void przegladajPokoje(String miasto, String nazwaHotelu, String adresHotelu)
    {
        if(znajdzHotel(miasto, nazwaHotelu, adresHotelu) != null)
        {
            Hotel hotel;
            hotel = znajdzHotel(miasto, nazwaHotelu, adresHotelu);
            ArrayList<Pokoj> listaPokoi;
            listaPokoi = hotel.getListaPokoi();
            wyswietlPokoje(listaPokoi);
        }
    }

    private void wyswietlPokoje(ArrayList<Pokoj> listaPokoi) {
        for (Pokoj pokoj : listaPokoi)
        {
            System.out.println(pokoj.toString());
        }
    }

    private Hotel znajdzHotel(String miasto, String nazwaHotelu, String adresHotelu) {
        for (Hotel hotel : listaHoteli)
        {
            if (hotel.getMiasto().equals(miasto) && hotel.getNazwaHotelu().equals(nazwaHotelu) && hotel.getAdresHotelu().equals(adresHotelu))
            {
                return hotel;
            }

        }
        return null;
    }

    public void wyslijPotwierdzenie()
    {
        for (Rezerwacja rezerwacja : listaRezerwacji)
        {
            if(rezerwacja.czyZatwierdzona() == true)
            {
                // TODO: 04.01.2022 jak wysylac potwierdzenie
                //Potwierdzenie potwierdzenie = new Potwierdzenie()
            }
        }
    }


    public static void main(String[] args) {

    }

}
