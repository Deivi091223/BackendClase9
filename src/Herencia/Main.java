package Herencia;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner leer = new Scanner(System.in);
        Estudiantes alumno1 = new Estudiantes("David", (byte) 34, "101120121", "dvg32@", "Colombiana",
                "Math", "3:00 PM", 3.2);
        Profesor profesor1 = new Profesor("Daniel", (byte) 45, "19809621", "dmorales@ ", "Colombiana",
                9000000, "Docente de planta", "Ingenieo de sistemas");

        alumno1.mostrarDatos();
        profesor1.mostrarDatos();
    }

}
