package proyectoprogramacion1cuatri;

import java.util.Scanner;

public class Estudiantes {

    //crear los atributos
    static int[] cedula = new int[10];
    static float[] promedio = new float[10];
    static String[] nombre = new String[10];
    static String[] condición = new String[10];
    static int campo = 0;
//crear el constructor para inicializar las variables

    public Estudiantes() {
    }

    //Inicializar/formatear los valores desde 0
    public static void inicializar() {
        for (int i = 0; i < cedula.length; i++) {
            cedula[i] = 0;
            nombre[i] = "";
            promedio[i] = 0;
            condición[i] = "";

        }
        System.out.println("'Los valores se inicializaron'");
    }

    //Agregar los datos de los 10 estudiantes
    public static void Incluir_estudiantes() {

        Scanner reader = new Scanner(System.in);

        char continuar = ' ';
        do {
            if (campo > 10) {
                System.out.println("La lista esta llena");
            } else {
                System.out.println("Ingrese la cedula del estudiante:");
                cedula[campo] = reader.nextInt();
                System.out.println("Ingrese el nombre del estudiante:");
                nombre[campo] = reader.next();
                System.out.println("Ingrese el promedio del estudiante:");
                promedio[campo] = reader.nextInt();
                if (promedio[campo] >= 70) {//condición del estudiante
                    condición[campo] = "APROBADO";
                } else if (promedio[campo] < 60) {
                    condición[campo] = "REPROBADO";
                } else if ((promedio[campo] < 70) && (promedio[campo] >= 60)) {
                    condición[campo] = "APLAZADO";
                }
                campo++;
                System.out.println("¿Desea agregar otro estudiante? Si(s)   No(n)");
                continuar = reader.next().charAt(0);

            }
        } while (continuar != 'n');
    }

    public static void Imprimir_estudiantes() {
        for (int i = 0; i < campo; i++) {
            System.out.println("Cedula: " + cedula[i] + "\n" + "Nombre: " + nombre[i] + "\n" + "Promedio: " + promedio[i] + "\n" + "condicion: " + condición[i] + "\n");
        }

    }//consultar estudiantes

    public static void Buscar_estudiantes() {//Consultar los datos por medio de la cedula
        boolean existe = false;

        Scanner reader = new Scanner(System.in);

        System.out.println("Por favor, ingrese la cedula del estudiante: ");
        int ID = reader.nextInt();
        for (int i = 0; i < cedula.length; i++) {
            if (ID == cedula[i]) {
                System.out.println("Cedula: " + cedula[i] + "\n" + "Nombre: " + nombre[i] + "\n" + "Promedio: " + promedio[i] + "\n" + "condicion: " + condición[i] + "\n");
                existe = true;

            }
            if (existe == false) {
                System.out.println("*El estudiante no esta registrado*");
            }
            break;

        }

    }

    public static void Modificar_Info_estudiantes() {
        Scanner reader = new Scanner(System.in);
        char continuar = ' ';

        for (int i = 0; i < cedula.length; i++) {
            Estudiantes.Buscar_estudiantes();
            do {
                System.out.println("Cedula nueva: ");
                cedula[campo] = reader.nextInt();
                System.out.println("Nombre del estudiante nuevo:");
                nombre[campo] = reader.next();
                System.out.println("Promedio del estudiante nuevo: ");
                promedio[campo] = reader.nextInt();
                if (promedio[campo] >= 70) {//condición del estudiante
                    condición[campo] = "APROBADO";
                } else if (promedio[campo] < 60) {
                    condición[campo] = "REPROBADO";
                } else if ((promedio[campo] < 70) && (promedio[campo] >= 60)) {
                    condición[campo] = "APLAZADO";
                }
                cedula[i] = cedula[campo];
                nombre[i] = nombre[campo];
                promedio[i] = promedio[campo];
                System.out.println(cedula[campo] + "\n" + nombre[campo] + "\n" + promedio[campo] + "\n" + condición[campo]);
                System.out.println("¿Desea modificar otro estudiante? Si(s)   No(n)");
                continuar = reader.next().charAt(0);
            } while (continuar != 'n');
        }
    }

    public static void Eliminar_Estudiantes() {
        Scanner reader = new Scanner(System.in);
        char continuar = ' ';
        Estudiantes.Buscar_estudiantes();
        for (int i = 0; i < cedula.length; i++) {
            System.out.println("Por favor, ingrese la cedula del estudiante que desea eliminar: ");
            int ID = reader.nextInt();
            if (ID == cedula[i]) {
                System.out.println("Esta segur@ de querer eliminar a " + nombre[i] + "?" + "Si(s)   No(n)");
                continuar = reader.next().charAt(0);
            do {if(continuar=='s'){
                cedula[i] = 0;
                nombre[i] = null;
                promedio[i] = 0;
                System.out.println("*Ha sido eliminado*");}break;
            } while (continuar != 'n');
            }break;
            
        }
    }
}
