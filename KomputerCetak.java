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
final class KomputerCetak {
    final static void cetak(Komputer[] obj){
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof PC){
                System.out.println("====PC====");
                PC pc = (PC)obj[i];
                pc.hidupkan_os();
                pc.klik_kanan();
                pc.klik_kiri();
                pc.tekan_enter();
                pc.matikan_os();
                pc.cetak_data();
                System.out.println("--------------------------");
            }else if(obj[i] instanceof Laptop){
                System.out.println("====LAPTOP====");
                Laptop laptop = (Laptop)obj[i];
                laptop.hidupkan_os();
                laptop.klik_kanan();
                laptop.klik_kiri();
                laptop.tekan_enter();
                laptop.matikan_os();
                laptop.cetak_data();
                System.out.println("--------------------------");
            }else if(obj[i] instanceof Netbook){
                System.out.println("====NETBOOK====");
                Netbook netbook = (Netbook)obj[i];
                netbook.hidupkan_os();
                netbook.klik_kanan();
                netbook.klik_kiri();
                netbook.tekan_enter();
                netbook.matikan_os();
                netbook.cetak_data();
                System.out.println("--------------------------");
            }else{
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        PC pc_main = new PC();
        Laptop laptop_main = new Laptop();
        Netbook netbook_main = new Netbook();
        Komputer[] komputer_cetak = {pc_main, laptop_main, netbook_main};        
        cetak(komputer_cetak);        
    }
}
