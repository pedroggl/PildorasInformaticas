package graficos;

/**
 *
 * @author Pedro G Gallardo
 */
import javax.swing.*;

public class JavaSwing {

    public static void main(String[] args) {
        MarcoCentrado frame1 = new MarcoCentrado();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}

class miMarco extends JFrame {

    public miMarco() {
        //inicia tamaño y posicion
//        setSize(500, 500);
//        setLocation(400, 100);

        //genera posicion X, Y y tamaño ancho y alto
        setBounds(400, 100, 500, 500);

        //pone un titulo a la ventana
        setTitle("Ventana Grafica: Pedros`");

        //no permite que el marco o frame se redimensione
//        setResizable(false);
        //permite que el marco se amplie a pantalla completa
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
