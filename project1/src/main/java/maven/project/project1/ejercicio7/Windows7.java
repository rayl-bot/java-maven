package maven.project.project1.ejercicio7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Windows7 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1, btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows7 window = new Windows7();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Windows7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][]"));

		JLabel lblNewLabel = new JLabel("Precio");
		frame.getContentPane().add(lblNewLabel, "cell 0 0,alignx trailing");

		textField = new JTextField();
		frame.getContentPane().add(textField, "flowx,cell 1 0,alignx left");
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Total");
		frame.getContentPane().add(lblNewLabel_1, "cell 1 0");

		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 1 0");
		textField_1.setColumns(10);

		btnNewButton = new JButton("Cambiar");
		frame.getContentPane().add(btnNewButton, "flowx,cell 1 1");

		btnNewButton_1 = new JButton("Euros a ptas");
		frame.getContentPane().add(btnNewButton_1, "cell 1 1");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (btnNewButton_1.getText().equals("Ptas a euros"))
					btnNewButton_1.setText("Euros a ptas");
				else
					btnNewButton_1.setText("Ptas a euros");
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				float dinero = Float.parseFloat(textField.getText());

				if (btnNewButton_1.getText().equals("Ptas a euros"))
					textField_1.setText(dinero / 166.386 + "");
				else
					textField_1.setText(dinero * 166.386 + "");
			}
		});
	}

}
