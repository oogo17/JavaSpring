/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author oogomx_1707
 */
public class Persona {
    private int edad;
    private String nombre;
    
    
    public int getedad()
    {
        return edad;
    }
    
    public void setedad(int edad)
    {
      this.edad=edad;
    
    }
    
    public String getnombre()
    {
    
     return nombre;
    
    }
    
    public void setnombre(String nombre)
            
    {
    
        this.nombre=nombre;
    
    }
    
    @Override
     public String toString()
    {
        return new StringBuilder("nombre: ").append(nombre).append(", edad: ").append(edad).toString();
    }
    
}
