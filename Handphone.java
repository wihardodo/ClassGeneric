/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classgeneric;

/**
 *
 * @author Dodoedoo
 */
public class Handphone <T> {
    private T noImei;
    public Handphone (T noImei){
        this.noImei=noImei;
    }
    public void setnoImei(T noImei){
        this.noImei=noImei;
    }
    public T getnoImei(){
        return noImei;
    }
    public void getType(){
        system.out.println("Tipe Awalnya"+noImei.getClass().getName());
    }
}
