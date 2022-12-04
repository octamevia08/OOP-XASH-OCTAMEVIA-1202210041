/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmodul2_octamevia;

/**
 *
 * @author octam
 */
public class Perangkat {
    protected String drive;
    protected int ram;

    /**
     *
     */
    protected float processor;

    public String getDrive(){
        return this.drive;
    }
    public int getRam(){
        return this.ram;
    }
    public void setProcessor(float processor){
        this.processor = processor;
    }
    public float getProcessor(){
        return this.processor;
    }
    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki tipe" + " " + 
                getDrive() + " " + "dengan ram sebesar " + getRam() + " " +
                "GB dan processor secepat" + " " + getProcessor() + " " + "Ghz");
    }
}    
