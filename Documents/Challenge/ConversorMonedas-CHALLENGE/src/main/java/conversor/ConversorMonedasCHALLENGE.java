/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package conversor;

/**
 *
 * @author vv
 */
import Elementos.Moneda;
import java.util.ArrayList;
import java.util.Scanner;
public class ConversorMonedasCHALLENGE {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Moneda monedasl = new Moneda();
        ArrayList<Moneda> monedas = monedasl.listaMonedas();
        ArrayList<String> nombMonedas = new ArrayList<>();
        
        int contador=1;
        for(Moneda m:monedas){
            nombMonedas.add(m.toString());
            System.out.println(contador+". "+m.toString());
            contador++;
        }
        System.out.print("Escoja su moneda:");
        int index1 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Escoja una moneda a la que desee cambiar:");
        int index2 = sc.nextInt();
        sc.nextLine();
        System.out.println(nombMonedas.get(index1-1));
        
        System.out.print("Ingrese monto:");
        double monto = sc.nextDouble();
        sc.nextLine();
        
        for(Moneda m1:monedas){
            if((nombMonedas.get(index1-1)).equalsIgnoreCase(m1.nombre)){
                for(Moneda m2:monedas){
                    if((nombMonedas.get(index2-1)).equalsIgnoreCase(m2.nombre)){
                        m1.conversion(m2, monto);
                    }
                }
            }
        } 
        
    }
}
