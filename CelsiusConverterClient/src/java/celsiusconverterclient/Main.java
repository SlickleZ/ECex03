/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusconverterclient;

import converterbean.CelsiusConverterBeanRemote;
import java.util.Scanner;
import javax.ejb.EJB;


/**
 *
 * @author SlickleZ
 */
public class Main {

    @EJB
    private static CelsiusConverterBeanRemote celsiusConverterBean;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float fahrenheit;
        Scanner userListener = new Scanner(System.in);
        while(true) {
            try {

                    System.out.print("Enter degree in Fahrenheit: ");
                    fahrenheit = new Float(userListener.nextLine());

                    System.out.println(fahrenheit + " Fahrenheit = "
                            + celsiusConverterBean.fToC(fahrenheit) + " Celsius");
                    break;

            } catch(NumberFormatException e) {
                System.err.println("Input does not a number: " + e.getMessage());
            }
        }
    }
}
