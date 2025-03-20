import java.time.LocalDate;

class SklepKomputerow {
    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;

    public void dodajProdukt(Produkt produkt) {
        if (liczbaProduktow == produkty.length) {
            Produkt[] nowa = new Produkt[produkty.length * 2];
            System.arraycopy(produkty, 0, nowa, 0, produkty.length);
            produkty = nowa;
        }
        produkty[liczbaProduktow++] = produkt;
    }}