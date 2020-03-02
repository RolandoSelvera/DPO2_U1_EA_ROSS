import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Clase Principal: Crea una ventana con una barra de menu, la cual
 * tiene 4 elementos:
 */
public class Principal {
    public static void main(String[] args) {

        // Crea objeto JFrame para crear una ventana con título:
        JFrame jFrame = new JFrame("Restaurante MX");

        // Llama a la función crearVentana(), pasa como parámetro un JFrame:
        crearVentana(jFrame);

        // Crea objeto JMenuBar para crear una barra de menu:
        JMenuBar barraMenu = new JMenuBar();

        // Crea el objeto JMenu para crear un Menu principal:
        JMenu menu = new JMenu("Menu");

        // Crea los objetos JMenuItem para establecer las opciones en el menu principal:
        JMenuItem ventas = new JMenuItem("Ventas");
        JMenuItem inventarios = new JMenuItem("Inventarios");
        JMenuItem personal = new JMenuItem("Personal");
        JMenuItem salir = new JMenuItem("Salir");

        // Llama a la función crearMenu(), pasa como parámetros un JMenuBar, JMenu y JMenuItem's:
        crearMenu(barraMenu, menu, ventas, inventarios, personal, salir);

        // Agrega a la ventana la barra de menu:
        jFrame.setJMenuBar(barraMenu);

        // Método sobrecargado para cerrar la ventana principal:
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Función para crear Ventana y establecer sus estilos:
    private static void crearVentana(JFrame jFrame){
        // Establece la posición de la ventana al ejecutarse por primera vez:
        jFrame.setLocation(150, 150);
        // Establece el tamaño de la ventana:
        jFrame.setSize(400,300);
        // Hace visible la ventana al llamar el método:
        jFrame.setVisible(true);
    }

    // Función para crear Menu del programa:
    private static void crearMenu(JMenuBar barraMenu, JMenu menu, JMenuItem ventas,
                                  JMenuItem inventarios, JMenuItem personal, JMenuItem salir){
        // Agrega a la barra de menu las opciones (hijos o elementos):
        barraMenu.setVisible(true);
        barraMenu.add(menu);
        menu.add(ventas);
        menu.add(inventarios);
        menu.add(personal);
        menu.add(salir);
    }
}