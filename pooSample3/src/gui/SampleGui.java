package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Alumno;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class SampleGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SampleGui frame = new SampleGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SampleGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 55, 414, 164);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Mostrar datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alumno dina = new Alumno();
				dina.codigo = 1;
				dina.nombre = "Dina Boluarte";
				dina.nota1 = 12;
				dina.nota2 = 7;
				textArea.setText("El código del alumno es: " + dina.codigo + "\n");
				textArea.append("El nombre del alumno es: " + dina.nombre + "\n");
				textArea.append("La nota 1 es: " + dina.nota1 + "\n");
				textArea.append("La nota 2 es: " + dina.nota2 + "\n");
				textArea.append("El promedio es: " + dina.promedio());
			}
		});
		btnNewButton.setBounds(135, 11, 158, 23);
		contentPane.add(btnNewButton);
		

	}
}
