/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        Scanner entrada = new Scanner(System.in);
        //  Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opc;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Estudiante distancia");
            System.out.println("2. Estudiante presencial");
            System.out.println("3. Salir");
            opc = entrada.nextInt();
            entrada.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese los datos del estudiante distancia: ");

                    System.out.println("Ingrese nombres");
                    String nombres = entrada.nextLine();
                    System.out.println("Ingrese apellidos");
                    String apellidos = entrada.nextLine();
                    System.out.println("Ingrese identificación");
                    String identificacion = entrada.nextLine();
                    System.out.println("Ingrese edad");
                    int edad = entrada.nextInt();
                    System.out.println("Ingrese número de asignaturas");
                    int asignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo asignatura");
                    double costoAsignatura = entrada.nextDouble();
                    entrada.nextLine();
                    EstudianteDistancia estudiante = new EstudianteDistancia();

                    estudiante.establecerNombresEstudiante(nombres);
                    estudiante.establecerApellidoEstudiante(apellidos);
                    estudiante.establecerEdadEstudiante(edad);
                    estudiante.establecerIdentificacionEstudiante(identificacion);
                    estudiante.establecerNumeroAsginaturas(asignaturas);
                    estudiante.establecerCostoAsignatura(costoAsignatura);
                    estudiante.calcularMatriculaDistancia();

                    System.out.printf("%s\n", estudiante);
                    break;
                case 2:
                    System.out.println("Ingrese los datos del estudiante presencial: ");
                    System.out.println("Ingrese nombres:");
                    String nombresPresencial = entrada.nextLine();
                    System.out.println("Ingrese apellidos:");
                    String apellidosPresencial = entrada.nextLine();
                    System.out.println("Ingrese identificación:");
                    String identificacionPresencial = entrada.nextLine();
                    System.out.println("Ingrese edad:");
                    int edadPresencial = entrada.nextInt();
                    System.out.println("Ingrese número de créditos:");
                    int creditosPresencial = entrada.nextInt();
                    System.out.println("Ingrese costo crédito:");
                    double costoCreditoPresencial = entrada.nextDouble();
                    entrada.nextLine(); // limpiar el buffer

                    EstudiantePresencial estudiante1 = new EstudiantePresencial();
                    estudiante1.establecerNombresEstudiante(nombresPresencial);
                    estudiante1.establecerApellidoEstudiante(apellidosPresencial);
                    estudiante1.establecerEdadEstudiante(edadPresencial);
                    estudiante1.establecerIdentificacionEstudiante(identificacionPresencial);
                    estudiante1.establecerNumeroCreditos(creditosPresencial);
                    estudiante1.establecerCostoCredito(costoCreditoPresencial);
                    estudiante1.calcularMatriculaPresencial();

                    System.out.printf("%s\n - %s - %s", estudiante1);
                    break;
                case 3:
                    System.out.println("Saliendo del programa....");
                    break;
            }
        } while (opc != 0);

    }
}
