package Herencia;

public class Persona {
    private String nombre;
    private byte edad;
    private String id;
    private String email;
    private String nacionalidad;

    public Persona(String nombre, byte edad,String id,  String email, String nacionalidad ){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.email = email;
        this.nacionalidad = nacionalidad;
    }
    public Persona(String nombre, byte edad,String id ){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
