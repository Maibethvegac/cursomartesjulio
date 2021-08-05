package Clase6;

public class Alumno extends Persona {
    // Atributos
    /*private String nombre;
    private int dni;*/
    private String curso;

    // Constructores
   public Alumno(String unNombre, int unDni){
        super(unNombre,unDni);
        /*this.nombre = unNombre;
        this.dni = unDni;*/
        this.curso = "Sin asignar";
    }

    public Alumno(String unNombre, int unDni, String unCurso){
        super(unNombre,unDni);
        /*this.nombre = unNombre;
        this.dni = unDni;*/
        this.curso = unCurso;
    }

    // Definimos los setter y getter de los atributos
    // quitamos xq los heredamos
    /*public void setNombre(String unNombre){
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
    }*/

    public void setCurso(String unCurso){
        this.curso = unCurso;
    }

    public String getCurso(){
        return this.curso;
    }

    // Definimos el toString
    public String toString(){
        String ret = "";
        if (this.curso.equals("Sin asignar")){
            ret = "El Alumno: " + this.nombre + ", tiene DNI: " + this.dni + " y no tiene curso asignado.";
        } else {
            ret = "El Alumno: " + this.nombre + ", tiene DNI: " + this.dni + " y cursa la materia: " + this.curso + ".";
        }
        return ret;
    }

}
