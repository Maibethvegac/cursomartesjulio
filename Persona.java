package Clase6;

public class Persona {

    //Atributos
    protected String nombre;
    protected int dni;

    //COnstructores
    public Persona(String unNombre, int unDni){
        this.nombre = unNombre;
        this.dni = unDni;
    }

    // Definimos los setter y getter de los atributos
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDni(int unDni){
        this.dni = unDni;
    }

    public int getDni(){
        return this.dni;
    }

    // Definimos el metodo toString
    public String toString(){
        String ret = "El nombre de la persona es: " + this.nombre + ", y su DNI es: "+this.dni+".";
        return ret;
    }
}
