import java.util.ArrayList;

public class DaneRezerwacji {

    private int iloscDni;
    private int iloscOsob;
    private ArrayList<Pokoj> wybranePokoje;
    private String poczatekPobytu;


    public int getIloscDni() {
        return iloscDni;
    }

    public void setIloscDni(int iloscDni) {
        this.iloscDni = iloscDni;
    }

    public int getIloscOsob() {
        return iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    public ArrayList<Pokoj> getWybranePokoje() {
        return wybranePokoje;
    }

    public void setWybranePokoje(ArrayList<Pokoj> wybranePokoje) {
        this.wybranePokoje = wybranePokoje;
    }

    public String getPoczatekPobytu() {
        return poczatekPobytu;
    }

    public void setPoczatekPobytu(String poczatekPobytu) {
        this.poczatekPobytu = poczatekPobytu;
    }

    public DaneRezerwacji(int iloscDni, int iloscOsob, String poczatekPobytu, ArrayList<Pokoj> wybranePokoje) {
        this.iloscDni=iloscDni;
        this.iloscOsob=iloscOsob;
        this.poczatekPobytu=poczatekPobytu;
        this.wybranePokoje=wybranePokoje;
    }
}
