public class Zaposleni {
    protected int ID;
    protected String ime;
    protected String prezime;
    protected double plataPoSatu;
    protected double ukupanBrojSati;

    public Zaposleni(int ID, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
        this.ID = ID;
        this.ime = ime;
        this.prezime = prezime;
        this.plataPoSatu = plataPoSatu;
        this.ukupanBrojSati = ukupanBrojSati;
    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public double getPlataPoSatu() {
        return plataPoSatu;
    }
    public void setPlataPoSatu(double plataPoSatu) {
        this.plataPoSatu = plataPoSatu;
    }
    public double getUkupanBrojSati() {
        return ukupanBrojSati;
    }
    public void setUkupanBrojSati(double ukupanBrojSati) {
        this.ukupanBrojSati = ukupanBrojSati;
    }
    public double izracunajPlatu() {
        return ukupanBrojSati * plataPoSatu;
    }
}
class Konobar extends Zaposleni {

    private double prekovremeniSati;

    public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double prekovremeniSati) {
        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
        this.prekovremeniSati = prekovremeniSati;
    }

    public double getPrekovremeniSati() {
        return prekovremeniSati;
    }
    public void setPrekovremeniSati(double prekovremeniSati) {
        this.prekovremeniSati = prekovremeniSati;
    }
    @Override
    public double izracunajPlatu() {
        double redovnaPlata = ukupanBrojSati * plataPoSatu;
        double prekovremenaPlata = prekovremeniSati * (plataPoSatu * 1.2);
        double ukupnaPlata = redovnaPlata + prekovremenaPlata;
        return ukupnaPlata;
    }
}
class Kuvar extends Zaposleni {

    private double dodatniFiksniIznos;

    public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double dodatniFiksniIznos) {
        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
        this.dodatniFiksniIznos = dodatniFiksniIznos;
    }

    public double getDodatniFiksniIznos() {
        return dodatniFiksniIznos;
    }

    public void setDodatniFiksniIznos(double dodatniFiksniIznos) {
        this.dodatniFiksniIznos = dodatniFiksniIznos;
    }

    @Override
    public double izracunajPlatu() {
        double plata = ukupanBrojSati * plataPoSatu + dodatniFiksniIznos;
        return plata;
    }
}

    class Menadzer extends Zaposleni {

        private double dodatniFiksniIznos;
        private double bonus;

        public Menadzer(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati,
                        double dodatniFiksniIznos, double bonus) {
            super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
            this.dodatniFiksniIznos = dodatniFiksniIznos;
            this.bonus = bonus;
        }

        public double getDodatniFiksniIznos() {
            return dodatniFiksniIznos;
        }

        public void setDodatniFiksniIznos(double dodatniFiksniIznos) {
            this.dodatniFiksniIznos = dodatniFiksniIznos;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        @Override
        public double izracunajPlatu() {
            double plata = ukupanBrojSati * plataPoSatu + dodatniFiksniIznos + bonus;
            return plata;
        }
    }