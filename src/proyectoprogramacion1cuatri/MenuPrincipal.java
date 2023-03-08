
package proyectoprogramacion1cuatri;

import java.util.Scanner;

public class MenuPrincipal {//menu principal

    Scanner leer = new Scanner(System.in);
    int opcion = 0;

    public void menu_en_pantalla() {
        do {

            System.out.println("1-Inicializar Vectores");
            System.out.println("2-Incluir Estudiantes");
            System.out.println("3-Consultar Estudiantes");
            System.out.println("4-Modificar Estudiantes");
            System.out.println("5-Eliminar Estudiantes");
            System.out.println("6-Submenu Reportes");
            System.out.println("7-Salir");
            System.out.println("Digite una opcion: ");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:Estudiantes.inicializar();

                    break;
                case 2:Estudiantes.Incluir_estudiantes();
                    //Incluir Estudiantes
                    break;
                case 3:Estudiantes.Buscar_estudiantes(); //Consultar Estudiantes
                    break;
                case 4: Estudiantes.Modificar_Info_estudiantes();//Modificar Estudiantes
                    break;
                case 5:Estudiantes.Eliminar_Estudiantes(); //Eliminar Estudiantes
                    break;
                case 6:Sub_Menu.Sub_Menu_en_Pantalla(); //Submenu Reportes
                    break;
                case 7:
                    System.out.println("Usted salio del programa");//SALIR DEL PROGRAMA 
                    break;
            }
            
        }while (opcion != 7);
    
    }
}

