package Herencia;

public class Profesor extends Persona{
    private int salario;
    private String cargo;
    private  String profecion;

    public Profesor(String nombre, byte edad, String id, String email, String nacionalidad, int salario, String cargo,
                    String profecion) {
        super(nombre, edad, id, email, nacionalidad);
        this.salario = salario;
        this.cargo = cargo;
        this.profecion = profecion;
    }

    public void mostrarDatos(){
        System.out.println("------ Datos personales -------");
        System.out.println("Nombre: " +getNombre() + "\n Edad: " + getEdad() +  "\n Id: " + getId() + "\n Mail: " +getEmail() +
                "\n Nacionalidad: " + getNacionalidad() + "\n Salario: " + salario + "\n Cargo: " + cargo + "\n Profecion: " +
                profecion);
    }
}
