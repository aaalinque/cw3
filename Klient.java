class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public void wyswietlInformacje() {
        System.out.println("ID: " + id);
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("Stały klient: " + (czyStaly ? "Tak" : "Nie"));
        System.out.println("-------------------");
    }}