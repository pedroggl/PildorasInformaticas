package graficos;

/**
 *
 * @author Pedro G Gallardo
 */
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujo {

    public static boolean ExisteFuente(String nombre) {
        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String fuente : fuentes) {
            if (nombre.equals(fuente)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //creamos la ventana grafica
//        MarcoConDibujos miMarco = new MarcoConDibujos();
//        miMarco.setVisible(true);
//        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
//            String text = JOptionPane.showInputDialog("Introduce fuente");
//
//            if (!ExisteFuente(text)) {
//                throw new Exception("No existe la fuente especificada");
//            }

            MarcoConDibujos miMarco = new MarcoConDibujos();
            miMarco.setVisible(true);
            miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {
        //titulo de la ventana
        setTitle("prueba de Dibujo");

        //generamos variable pantalla de Tipo Dimension con el que creamos la ventana, la mitad de ancho y alto d la pantalla y la posicionamos en
        //el centro de la pantalla(/4)
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = miPantalla.getScreenSize();
        setBounds(pantalla.width / 4, pantalla.height / 4, pantalla.width / 2, pantalla.height / 2);

        //agregamos un JPanel
        LaminaConFiguras lamina1 = new LaminaConFiguras();

        //añadimos la lamina a la ventana
//        add(lamina1);
//        lamina1.setBackground(SystemColor.window);
        //añadimos lamina 2
        LaminaConFuente lamina2 = new LaminaConFuente();
        add(lamina2);
    }
}

class LaminaConFiguras extends JPanel {

    //estamos sobreescribiendo el metodo original, por eso llamamos a su clase super para que tambn haga lo que tiene por defecto programado
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //opcion1
        g.drawRect(80, 80, 200, 50);
        g.drawLine(80, 80, 280, 130);
        g.drawArc(80, 80, 100, 100, 90, 90);
        //opcion2
//        Graphics2D g2 = (Graphics2D) g;
//        Rectangle2D rect = new Rectangle2D.Double(300, 200, 200, 150);
//        g2.draw(rect);
//        Ellipse2D elips = new Ellipse2D.Double();
//        //convertir la elipse dentro del rectangulo ya creado
//        elips.setFrame(rect);
//        g2.draw(elips);

        //rellenar de color
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(300, 200, 200, 150);
//        g2.setPaint(Color.CYAN);
//        g2.draw(rect);
        g2.setPaint(Color.BLUE.darker());
        g2.fill(rect);
        Ellipse2D elips = new Ellipse2D.Double();
        //convertir la elipse dentro del rectangulo ya creado
        elips.setFrame(rect);
//        g2.setPaint(Color.RED);
//        g2.draw(elips);
        g2.setPaint(new Color(109, 172, 59).brighter());
        g2.fill(elips);
    }
}

class LaminaConFuente extends JPanel {

    //estamos sobreescribiendo el metodo original, por eso llamamos a su clase super para que tambn haga lo que tiene por defecto programado
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Font miFuente = new Font("Verdana", Font.PLAIN, 26);
        
        g2.setFont(miFuente);
        g2.setColor(Color.ORANGE);
        
        g2.drawString("Pedro Gabriel Gallardo Lozano", 100, 100);
    }
}
