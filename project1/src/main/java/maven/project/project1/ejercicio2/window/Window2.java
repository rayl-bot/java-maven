package maven.project.project1.ejercicio2.window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window2 extends JFrame {
	//creamos el panel para inicializarlo ams adelante
	private JPanel contentPane;
	// creamos los elementos
	private JButton boton1 = new JButton("Boton 1");
	private JButton boton2 = new JButton("Boton 2");
	private JLabel label = new JLabel("Has pulsado: ");

	public Window2() {
		/***
		 * Crear la ventana con el titulo
		 */
		setTitle("Ejercicio 2");

		// Definimos el size de la ventana
		setBounds(500, 500, 500, 200);

		// hacemos que la ventana sea visible
		setVisible(true);

		// Operacion que cuando se cierre la ventana terminara la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Creamos el panel
		contentPane = new JPanel();

		// Creamos el layout que mas se ajusta a los requisitos del ejercicio
		FlowLayout flowLay = new FlowLayout();

		// agregamos el layout al panel
		contentPane.setLayout(flowLay);

		// agragamos los elementos en el formato del layout
		contentPane.add(label);
		contentPane.add(boton1);
		contentPane.add(boton2);

		// Asignamos el panel a la ventana
		setContentPane(contentPane);

		// asiganmos los eventos a cada elemento
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("Has pulsado: " + boton1.getText());
			}
		});
		
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("Has pulsado: " + boton2.getText());
			}
		});
	}
}
