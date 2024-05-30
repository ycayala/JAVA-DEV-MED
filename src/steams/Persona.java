package steams;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String ciudadOrigen;
    private char sexo;

    public Persona(String nombre, int edad, String ciudadOrigen, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadOrigen = ciudadOrigen;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return getNombre().compareTo(o.getNombre());
    }
}
