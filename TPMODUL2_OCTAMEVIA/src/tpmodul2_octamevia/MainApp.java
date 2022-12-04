/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmodul2_octamevia;

/**
 *
 * @author octam
 */
public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Twice", 64, 8.7F);
        perangkat.informasi();
        
        System.out.println();

        Laptop laptop = new Laptop("Lenovo Thinkbook", 32, 5.3F, true);
        laptop.informasi();
        laptop.bukaGame("Ball Pool");
        laptop.kirimEmail("octamevia08@gmail.com");
        laptop.kirimEmail("octamevia08@gmail.com", "octamevia0808@gmail.com");
        
        System.out.println();

        Handphone handphone = new Handphone("RealMe", 16, 4.8F, false);
        handphone.informasi();
        handphone.telfon(1228775);
        handphone.kirimSMS(567883765);
        handphone.kirimSMS(1468257, 47576843);
    }
}   