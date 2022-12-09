public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(){
        System.out.print("Transportasi Air jenis Kapal dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar" + biaya );
    }

    public void berlayar(){
        System.out.print("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan){
        System.out.print("Transportasi Air jenis Kapal Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil dengan kisaran 20 knot");
    }

    public void berlabuh(){
        System.out.print("Transportasi Air jenis Kapal berlabuh di pantai");
    }
}