/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmodul2_octamevia;

/**
 *
 * @author octam
 */
public class Laptop extends Perangkat {

    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @Override
    public String getDrive(){
        return super.getDrive();
    }
    @Override
    public float getProcessor(){
        return super.getProcessor();
    }
    @Override
    public int getRam(){
        return super.getRam();
    }
    public boolean getWebcam(){
        return this.webcam;
    }
    
    @Override
    public void informasi(){
        System.out.print("Laptop ini memiliki drive tipe " + getDrive() + " dengan ram sebesar " + getRam() + " GB dan processor secepat " + getProcessor() + " Ghz");
        if (getWebcam()){
            System.out.print(". Selain itu laptop ini juga memiliki Webcam");
        }else{
            System.out.print(". Selain itu laptop ini TIDAK memiliki Webcam");
        }
        System.out.println();
    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 +" dan ke " + email2);
    }
}
