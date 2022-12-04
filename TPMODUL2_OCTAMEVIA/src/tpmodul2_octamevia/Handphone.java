/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmodul2_octamevia;

/**
 *
 * @author octam
 */
public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;

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

    public boolean getFingerprint(){
        return this.fingerprint;
    }


    public void setFingerprint(boolean fingerprint){
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi(){
        System.out.print("Handphone ini memiliki drive tipe " + getDrive() + " dengan ram sebesar " + getRam() +" GB dan processor secepat " + getProcessor() + " Ghz" );
        if (getFingerprint()){
            System.out.print(". Selain itu handphone ini juga memiliki Fingerprint");
        } else {
            System.out.print(". Selain itu handphone ini TIDAK memiliki Fingerprint");
        }
        System.out.println();
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
    }
}