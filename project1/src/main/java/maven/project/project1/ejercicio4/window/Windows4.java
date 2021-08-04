package maven.project.project1.ejercicio4.window;

import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class Windows4 {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows4 window = new Windows4();
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
	public Windows4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 661, 376);
		
		textArea = new JTextArea("Texto inicial\nVentana iniciada\nVentana abierta");
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Eventos: ");
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		frame.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(textArea.getText() + "\n" + "No estas haciendo foco a la ventana");
			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(textArea.getText() + "\n" + "Estas haciendo foco a la ventana");
			}
		});
	}

}
