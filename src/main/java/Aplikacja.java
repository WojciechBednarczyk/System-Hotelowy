import java.util.ArrayList;
import java.util.Iterator;

public class Aplikacja {

private static ArrayList<Rezerwacja> listaRezerwacji;
private static ArrayList<Hotel> listaHoteli;

    public static ArrayList<Rezerwacja> getRezerwacje()
    {
        return listaRezerwacji;
    }

    public static void setRezerwacje(ArrayList<Rezerwacja> listaRezerwacjiNowa)
    {
        listaRezerwacji=listaRezerwacjiNowa;
    }

    public static void dodajRezerwację(int ilośćDni, int ilośćOsób, String początekPobytu, ArrayList<Pokoj> wybranePokoje, String imię, String nazwisko, String numerDowodu){
        DaneRezerwacji daneRezerwacji = new DaneRezerwacji(ilośćDni,ilośćOsób,początekPobytu,wybranePokoje);
        Klient daneKlienta = new Klient(imię,nazwisko,numerDowodu);
        Rezerwacja rezerwacja = new Rezerwacja(daneRezerwacji,daneKlienta);
        listaRezerwacji.add(rezerwacja);
    }
    public static void zmienTermin(String nowyTermin, int IDRezerwacji){
        if(szukajRezerwacji(IDRezerwacji)!=null)
        {
            szukajRezerwacji(IDRezerwacji).zmienTermin(nowyTermin);
        }
    }

    public void anulujRezerwacje(int IDRezerwacji)
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
