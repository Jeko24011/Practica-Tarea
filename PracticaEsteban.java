/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.esteban;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
/**
 *
 * @author Esteban Picado
 */
public class PracticaEsteban {

    /**
     * @param args the command line arguments
     */
    
   

public static void main(String[] args) {
    // TODO code application logic here
    var cantidadEmpleados = parseInt(JOptionPane.showInputDialog("Cuantos empleados trabajan en la empresa: "));

    var montoTotal = 0;

    for (var i = 1; i <= cantidadEmpleados; i++) {
        var salario = parseFloat(JOptionPane.showInputDialog("Ingrese el salario del empleado " + i + ": "));
        var sem = salario * 0.0925;
        var ivm = salario * 0.0508;
        var montoEmpleado = sem + ivm;
        montoTotal += montoEmpleado;
    }
    System.out.println("El monto total a pagar a la CCSS es de: " + montoTotal);
    }
}