/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springcolecciones;

import beans.ManejadorColecciones;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author oogomx_1707
 */
public class SpringColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
ManejadorColecciones manejador = applicationContext.getBean("manejador", ManejadorColecciones.class);

    manejador.muestraLista();
    manejador.muestraArreglo();
    manejador.muestraConjunto();
    manejador.muestraMapa();
    manejador.muestraPropiedades();

    }
}
