package graficos;

/**
 *
 * @author Pedro G Gallardo
 */
import java.awt.*;
import javax.swing.*;

public class MarcoCentrado extends JFrame {
    
    public MarcoCentrado() {
        //crea un objeto con el sistema nativo de ventana
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        //metodo que devuelve una clase dimension con el tamaño de mi pantalla
        Dimension tamañoPantalla = miPantalla.getScreenSize();
        int anchoPantalla = tamañoPantalla.width;
        int altoPantalla = tamañoPantalla.height;

        //defino el tamaño en la mitad d la pantalla
        setSize(anchoPantalla / 2, altoPantalla / 2);

        //defino la ubicacion en la mitad
        setLocation(anchoPantalla / 4, altoPantalla / 4);
        
        //defino un titulo para la pantalla grafica
        setTitle("Ventana Grafica");
        
        //cambio el icono de la ventana
        Image icono=miPantalla.getImage("descarga.png");
        setIconImage(icono);
    }
}
