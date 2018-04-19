
package roxanamenjivar;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: RoxanaMenjivar
 * Version: 1.0
 * Fecha: 19/04/18
 * CopyRight: ITCA
 * @author Roxana Menjivar
 */
public class RoxanaMenjivar {

    public static void main(String[] args) {
        int n=0;
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat df = new DecimalFormat("##.##");
        do 
        {            
            for (int i = 0; i < 100; i++) 
            {
                n= Integer.parseInt(JOptionPane.showInputDialog("--REGISTRO DE EMPLEADOS-- \n 1. Ingresar \n 2. Mostrar listado \n 3.Salir"));
                String nombre[]=new String[100];
                double salarioxhora[]=new double[100];
                int horas[]=new int[100];
                double salario[]=new double[100];
                double salarioF[]=new double[100];
                double renta[]=new double[100];
                int empleados[]= new int [100];
                double bono[]=new double[100];
                int sueldoMax=0;
                double bonos[]=new double[100];
                
                if(n==1)
                {
                    nombre[i]=JOptionPane.showInputDialog("Ingrese su nombre: ");
                    salarioxhora[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo por hora"));
                    horas[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas"));
                    salarioF[i]=salarioxhora[i]*horas[i];
                    
                    salario[i]=salario[i]+salarioF[i];
                    empleados[i]=empleados[i]+1;
                    
                    if(salarioF[i]>0 && salarioF[i]<=350)
                    {
                        bono[i]=salarioF[i]+100;
                        bonos[i]=bonos[i]+bono[i];
                        
                        renta[i]=bono[i]-(bono[i]*0.10);
                    }
                    else if(salarioF[i]>350 && salarioF[i]<700)
                    {
                        bono[i]=salarioF[i]+200;
                        bonos[i]=bonos[i]+bono[i];
                        
                        renta[i]=bono[i]-(bono[i]*0.10);
                    }
                    else if(salarioF[i]>=700 )
                    {
                        bono[i]=salarioF[i]+250;
                        bonos[i]=bonos[i]+bono[i];
                        
                        renta[i]=bono[i]-(bono[i]*0.10);
                    }
                    else if(salarioF[i]>700)
                    {
                        sueldoMax++;
                    }
                    JOptionPane.showMessageDialog(null,"Datos del empleado"+
                            "\n Nombre: "+nombre[i]+
                            "\n Sueldo por hora: $"+df.format(salarioxhora[i])+
                            "\n Sueldo con bono: $"+df.format(bono[i])+
                            "\n Sueldo (renta aplicada): $"+df.format(renta[i]));
                }
                if(n==2)
                {
                    JOptionPane.showMessageDialog(null,"Planilla"+
                            "\n Cantidad total de bonos a pagar $"+df.format(bonos[i])+
                            "\n Salario final "+df.format(renta[i])+
                            "\n Cantidad de empleados con salario mayor a 700: $"+sueldoMax);
                }
                if(n==3)
                {
                    i=100;
                }
            }
            
        } 
        while (n==1);
 
    }
    
}
