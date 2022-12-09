public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;

    }

    @Override
    public void informasi(){
        System.out.print("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar" + biaya );
    }

    public void berlayar(){
        System.out.print("Transportasi Air jenis Sampan sedang berlayar menggunakan 2 layar");
    }

    public void berlabuh(){
        System.out.print("Transportasi Air jenis Sampan berlabuh di Pantai tanpa Jangkar");
    }

    public void berlabuh(int kecepatan){
        System.out.print("Transportasi Air jenis Sampan berlabuh di Pantai menggunakan 2 jangkar");
    }
}
