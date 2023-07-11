/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementos;

/**
 *
 * @author vv
 */
import java.util.ArrayList;
public class Moneda {
    public String nombre;
    public double valorDivisa;
    
    public Moneda(String nombre, double valorDivisa){
        this.nombre=nombre;
        this.valorDivisa= valorDivisa;
    }
    
    public Moneda(){
        
    }
    public ArrayList listaMonedas(){
        ArrayList<Moneda> monedas = new ArrayList<>();
        Moneda dolarUsa = new Moneda("Dolar Estadounidense",1);
        monedas.add(dolarUsa);
        Moneda euro = new Moneda("Euro",1.4);
        monedas.add(euro);
        Moneda pesoCol = new Moneda("Peso Colombiano",4000);
        monedas.add(pesoCol);
        Moneda pesoArg = new Moneda("Peso Argentino",250);
        monedas.add(pesoArg);
        Moneda solPer = new Moneda("Sol Peruano",3);
        monedas.add(solPer);
        Moneda dolarCad = new Moneda("Dolar Canadiense",1.2);
        monedas.add(dolarCad);
        Moneda realBra = new Moneda("Real Brasil",15);
        monedas.add(realBra);
        Moneda pesoChi = new Moneda("Peso Chileno",20);
        monedas.add(pesoChi);
        Moneda bolivar = new Moneda("Bolivar",2000);
        monedas.add(bolivar);
        return monedas;
    }
    
    public void conversion(Moneda moneda, double valorCambio){
        double cambioDolar = valorCambio/this.valorDivisa;
        double valorFinal =  cambioDolar*moneda.valorDivisa;
        System.out.println(valorCambio+" "+this.nombre+" covertido a"+moneda.nombre+" es: "+valorFinal);
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
}
