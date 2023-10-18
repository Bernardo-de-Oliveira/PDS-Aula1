package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Conversao;
import model.Retangulo;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ex3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textaltura;
	private JTextField textbase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setTitle("Área e perímetro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textaltura = new JTextField();
		textaltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textaltura.setBounds(94, 40, 86, 20);
		contentPane.add(textaltura);
		textaltura.setColumns(10);
		
		textbase = new JTextField();
		textbase.setBounds(94, 93, 86, 20);
		contentPane.add(textbase);
		textbase.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float altura, base;
				altura = Float.valueOf(textaltura.getText());
				base = Float.valueOf(textbase.getText());
				Retangulo calculo = new Retangulo();
				float Area = calculo.calculoA(altura, base);
				float Perimetro = calculo.calculoP(altura, base);
				
				JOptionPane.showMessageDialog(null, "Perimetro "+Area+" Base "+Perimetro);
			}
		});
		btnNewButton.setBounds(151, 176, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Altura");
		lblNewLabel.setBounds(38, 43, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Base");
		lblNewLabel_1.setBounds(38, 96, 46, 14);
		contentPane.add(lblNewLabel_1);
	}
}
