package maven.project.project1.ejercicio3.window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window3 extends JFrame {
	// creamos el panel para inicializarlo ams adelante
	private JPanel contentPane;
	private JLabel label1, label2;
	private JButton boton1, boton2;
	private int i1=0, i2=0;

	public Window3() {
		/***
		 * Crear la ventana con el titulo
		 */
		setTitle("Ejercicio 3");

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

		contentPane.add(label1 = new JLabel("Boton 1: "));
		contentPane.add(boton1 = new JButton("Boton 1"));
		contentPane.add(label2 = new JLabel("Boton 2: "));
		contentPane.add(boton2 = new JButton("Boton 1"));
		
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i1++;
				label1.setText("Boton 1: " + i1+ " veces");
			}
		});
		
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i2++;
				label2.setText("Boton 2: " + i2+ " veces");
			}
		});

		// Asignamos el panel a la ventana
		setContentPane(contentPane);
	}
}
