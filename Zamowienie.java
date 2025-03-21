class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;
    private boolean znizkaZastosowana = false;

    public double obliczWartoscZamowienia() {
        double suma = 0.0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosci[i];
        }
        return znizkaZastosowana ? suma * 0.9 : suma;
    }

    public void zastosujZnizke() {
        if (klient.isCzyStaly()) znizkaZastosowana = true;
    }

    public void wyswietlSzczegoly() {
        System.out.println("Zamówienie ID: " + id);
        System.out.println("Data: " + dataZamowienia);
        System.out.println("Status: " + status);
        klient.wyswietlInformacje();
        System.out.println("Produkty:");
        for (int i = 0; i < produkty.length; i++) {
            System.out.printf("- %s, ilość: %d, cena: %.2f zł\n",
                    produkty[i].getNazwa(), ilosci[i], produkty[i].getCena());
        }
        System.out.printf("Łączna wartość zamówienia: %.2f zł\n", obliczWartoscZamowienia());
        System.out.println("-------------------");
    }}