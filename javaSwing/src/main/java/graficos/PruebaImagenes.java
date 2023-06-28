package graficos;

/**
 *
 * @author Pedro G Gallardo
 */
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.File;

public class PruebaImagenes {

    public static void main(String[] args) {
        MarcoImagen marco = new MarcoImagen();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoImagen extends JFrame {

    public MarcoImagen() {
        setTitle("Ventana grafica");
        setBounds(300, 300, 300, 200);
        LaminaConImagen lamina1 = new LaminaConImagen();
        add(lamina1);
    }
}

class LaminaConImagen extends JPanel {

    private Image imagen;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            imagen = ImageIO.read(new File("imagen.png"));

        } catch (Exception e) {
            System.out.println("Error");
        }
        g.drawImage(imagen, 0, 0, null);
    }
}
