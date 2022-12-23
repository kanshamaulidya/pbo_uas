/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_uas;

/**
 *
 * @author HP
 */
public class PC extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    public void hidupkan_os(){
        System.out.println("Hidup");
    }
    @Override
    public void matikan_os(){
        System.out.println("Mati");
    }
    @Override
    public void klik_kanan(){
        System.out.println("Klik Kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("Klik Kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("Enter");
    }
    @Override
    public void cetak_data(){
        System.out.println("Cetak data PC berhasil ");
    }
}
