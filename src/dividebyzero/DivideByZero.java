/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dividebyzero;
import javax.swing.*;

/**
 *
 * @author glSon8840
 */
public class DivideByZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String myInput;
    int numerator, denominator;

    //User inputs
    myInput = JOptionPane.showInputDialog(
      "Enter an integer numerator: ");
    numerator = Integer.parseInt(myInput);

    myInput = JOptionPane.showInputDialog(
      "Enter an integer denominator: ");
    denominator = Integer.parseInt(myInput);

    //Will crash if denominator == 0
    int result = numerator / denominator;
    System.out.println("Result: " + numerator + " / "
      + denominator + " = " + result);
    }
    
}
