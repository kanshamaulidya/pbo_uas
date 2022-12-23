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
public abstract class Komputer implements Mouse, Keyboard,Printer {
    abstract void hidupkan_os();
    abstract void matikan_os();
}
