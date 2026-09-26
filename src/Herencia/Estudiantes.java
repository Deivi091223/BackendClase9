package Herencia;

public class Estudiantes extends Persona {
    private String materia;
    private String horario;
    private double nota;

    public Estudiantes(String nombre, byte edad, String id, String email, String nacionalidad, String materia,
                       String horario, double nota) {
        super(nombre, edad, id, email, nacionalidad);
        this.horario = horario;
        this.materia = materia;
        this.nota = nota;
    }
    public void mostrarDatos(){
        System.out.println("------ Datos personales -------");
        System.out.println("Nombre: " +getNombre() + "\n Edad: " + getEdad() +  "\n Id: " + getId() + "\n Mail: " +getEmail() +
                "\n Nacionalidad: " + getNacionalidad() + "\n Materia: " + materia + "\n Horario: " + horario + "\n Nota: " +
                nota);
    }
}
