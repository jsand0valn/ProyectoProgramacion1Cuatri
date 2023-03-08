
package proyectoprogramacion1cuatri;

import java.util.Scanner;
import static proyectoprogramacion1cuatri.Estudiantes.cedula;
import static proyectoprogramacion1cuatri.Estudiantes.nombre;
import static proyectoprogramacion1cuatri.Estudiantes.promedio;


public class Sub_Menu {

    static Scanner leer = new Scanner(System.in);
    static int opcion = 0;

    public Sub_Menu() {
    }

    public static void Sub_Menu_en_Pantalla() {
        do {

            System.out.println("1-Reportar estudiantes por condicion");
            System.out.println("2-Reporte de toda la informacion");
            System.out.println("3-Salir");
            System.out.println("Digite una opcion: ");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:
                    Sub_Menu.Reporte_condicion();//Reportar estudiantes por condición

                    break;
                case 2:
                    Sub_Menu.Reporte_completo();//Reportar estudiantes con la info completa

                //break;
                case 3:
                    System.out.println("*Usted salio del submenu*");//Salir del submenu 
                    break;
            }

        } while (opcion != 3);
    }

    public static void Reporte_completo() {
        Estudiantes.Imprimir_estudiantes();
        }
        
    public static void Reporte_condicion() {

        System.out.println("Ingrese la condicion que desea mirar (1)Aprobados   (2)Aplazados    (3)Reprobados");
        int opcion_condicion = leer.nextInt();
        for (int i = 0; i < cedula.length; i++) {
            if (opcion_condicion == 1) {
                System.out.println("El nombre es: " + nombre[i]);
                System.out.println("El promedio es: " + promedio[i]);
                System.out.println(promedio[i] >= 70);
            }
            
            if(opcion_condicion == 2) {
            System.out.println("El nombre es: " + nombre[i]);
            System.out.println("El promedio es: " + promedio[i]);
            System.out.println((promedio[i] < 70) && (promedio[i] >= 60));
        }
            
            if  (opcion_condicion == 3) {
            System.out.println("El nombre es: " + nombre[i]);
            System.out.println("El promedio es: " + promedio[i]);
            System.out.println(promedio[i] < 60);
        }break;
        }
        }

    }

