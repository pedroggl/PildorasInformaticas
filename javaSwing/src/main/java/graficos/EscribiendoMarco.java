package graficos;

/**
 *
 * @author Pedro G Gallardo
 */
import javax.swing.*;
import java.awt.*;

public class EscribiendoMarco {

    public static void main(String[] args) {
        MarcoConTexto frame1 = new MarcoConTexto();

    }

}

class MarcoConTexto extends JFrame {

    public MarcoConTexto() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        //Utiliza una lamina
        Lamina1 lamina1 = new Lamina1();
        add(lamina1);
    }
}

class Lamina1 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo swing", 100, 100);
    }
}
