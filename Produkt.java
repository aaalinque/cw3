class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    public void wyswietlInformacje() {
        System.out.println("ID: " + id);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Kategoria: " + kategoria);
        System.out.println("Cena: " + cena + " zł");
        System.out.println("Ilość w magazynie: " + iloscWMagazynie);
        System.out.println("-------------------");
    }}