public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasi = new TransportasiAir(4, 20000);
        transportasi.informasi();

        System.out.println();

        Sampan sampan = new Sampan(2, 20, 5000);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();

        System.out.println();

        Kapal kapal = new Kapal(50, 100000, "20");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlabuh();
    }
}

