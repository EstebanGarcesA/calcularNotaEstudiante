import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Desarrollar un sistema de notas para un estudiante que desea saber su nota final (de cada materia)
    //EL sistema debe pedir el nombre del estudiante, el documento y el programa al que esta matriculado
    //Menu de opciones: Desarrollo de Software, diseño grafica y gastronomia
    //Debe permitir seleccionar la materia
    //Menu de opciones:
        //Desarrollo: Logica, metodologias, introduccion
        //Diseño: Tipografia, iconografiam, semantica
        //Gastronomia: Costos, panaderia dulce, cocina internacional
    //El calculo de notas es de la siguiente manera:
    //Para cada materia hay un examen parcial que equivale al 20% de la nota, un taller que equivale el 30% de la nota y un examen final que equivale el 50% de la nota
    //Una vez calculada la nota final tener en cuenta que:
        //si la nota esta entre 0 y 2, el estudiante pierde definitivamente
        //Si la nota esta entre 2.1 y 2.9 tiene derecho a un plan de mejoramente
        //si la nota es igual o superior a 3, asi le queda la materia
        //Si el estudiante hace un plan de mejoramiento, la nota maxima de la materia sera 3
   //El sistema debe discriminar la informacion general del estudiante
        //Nombre, documento y nota de la materia

        System.out.println("Ingrese el nombre del estudiante");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese el documento del estudiante");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Escriba el numero correspondiente al programa matriculado: \n1.Desarrollo de software \n2.Diseño grafico \n3.Gastronomia \n-------------");
        String programa = sc.nextLine();
        switch (programa){
            case "1":
                System.out.println("Programa desarrollo de software \n \nEscriba el numero correspondiente a la materia \n1.Logica de programacion \n2.Metodologias agiles \n3.Introduccion a la programacion \n-----------");
                String materia = sc.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("Nota de logica de programacion");
                        break;
                    case "2":
                        System.out.println("Nota de metodologias agiles");
                        break;
                    case "3":
                        System.out.println("Nota de Introduccion a la programacion");
                        break;
                }
                break;
            case "2":
                System.out.println("Programa Diseño Grafico");
                break;
            case "3":
                System.out.println("Programa Gastronomia");
                break;
        }































    }
}