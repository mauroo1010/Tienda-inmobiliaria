/**
 * Write a description of class dependiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dependiente
{
    private int edad;
    
    private String nombre;
    
    public Dependiente(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    
     public int getEdad() {
        return edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}