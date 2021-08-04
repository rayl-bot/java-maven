package maven.project.project1.ejercicio1.window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window1 extends JFrame {
	private JPanel contentPane;

	public Window1() {
		/***
		 * Crear la ventana con el titulo
		 */
		setTitle("Ejercicio 1");

		// Definimos el size de la ventana
		setBounds(500, 500, 500, 200);

		// hacemos que la ventana sea visible
		setVisible(true);

		// Operacion que cuando se cierre la ventana terminara la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Creamos el panel
		contentPane = new JPanel();

		// Creamos un label
		JLabel label = new JLabel("ESTE ES EL PRIMER EJERCICIO");

		// Indicamos su diseño
		contentPane.setLayout(null);

		// Colocamos el elemento en algun lugar del panel
		label.setBounds(150, 30, 300, 60);

		// Añadimos el label al panel
		contentPane.add(label);

		// Asignamos el panel a la ventana
		setContentPane(contentPane);
	}
}
