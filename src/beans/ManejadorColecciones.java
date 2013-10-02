/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.*;

/**
 *
 * @author oogomx_1707
 */
public class ManejadorColecciones {
    private List lista;
    private Persona[] arreglo;
    private Set conjunto;
    private Map mapa;
    private Properties propiedades;
    
    
    
public void muestraLista()
{
    System.out.println("---Mostrando lista---");
        for (Iterator it = lista.iterator(); it.hasNext();) {
            Object o = it.next();
            System.out.println(o.getClass() + ": " + o);
        }
}

public void muestraArreglo()
{
    System.out.println("---Mostrando arreglo---");

    for(Object o : arreglo)
    {
        System.out.println(o.getClass() + ": " + o);
    }
}


public void muestraConjunto()
{
    System.out.println("---Mostrando conjunto---");

    for (Iterator it = conjunto.iterator(); it.hasNext();)
    {
        Object o = it.next();

        System.out.println(o.getClass() + ": " + o);
    }
}


public void muestraMapa()
{
    System.out.println("---Mostrando mapa---");

    for (Iterator it = mapa.keySet().iterator(); it.hasNext();)
    {
        Object o = it.next();

        System.out.println("[llave] " + o.getClass() + ": " + o + ", [valor]" + mapa.get(o).getClass() + ": " + mapa.get(o) );
    }
}


public void muestraPropiedades()
{
    System.out.println("\n---Mostrando propiedades---");

    for (Iterator it = propiedades.keySet().iterator(); it.hasNext();)
    {
        Object o = it.next();

        System.out.println("[llave] " + o.getClass() + ": " + o + ", [valor]" + propiedades.get(o).getClass() + ": " + propiedades.get(o) );
    }
}
    
    
    

    public void setArreglo(Persona[] arreglo)
    {
        this.arreglo = arreglo;
    }

    public void setConjunto(Set conjunto)
    {
        this.conjunto = conjunto;
    }

    public void setLista(List lista)
    {
        this.lista = lista;
    }

    public void setMapa(Map mapa)
    {
        this.mapa = mapa;
    }

    public void setPropiedades(Properties propiedades)
    {
        this.propiedades = propiedades;
    }
}
