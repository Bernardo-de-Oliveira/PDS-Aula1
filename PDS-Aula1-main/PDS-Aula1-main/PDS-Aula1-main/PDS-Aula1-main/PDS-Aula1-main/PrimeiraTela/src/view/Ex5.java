package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Quilo;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textpeso;
	private JTextField textpreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5 frame = new Ex5();
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
	public Ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textpeso = new JTextField();
		textpeso.setBounds(137, 43, 86, 20);
		contentPane.add(textpeso);
		textpeso.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Peso do prato");
		lblNewLabel.setBounds(41, 46, 86, 14);
		contentPane.add(lblNewLabel);
		
		textpreco = new JTextField();
		textpreco.setBounds(137, 92, 86, 20);
		contentPane.add(textpreco);
		textpreco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Preço do quilo");
		lblNewLabel_1.setBounds(41, 95, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float Preco,Peso;
				Preco = Float.valueOf(textpreco.getText());
				Peso = Float.valueOf(textpeso.getText());
				Quilo calculo = new Quilo();
				float Reais = calculo.Quiloo(Preco, Peso);
				
				JOptionPane.showMessageDialog(null, "Você irá pagar R$" +Reais+" pela comida");
				
			}
		});
		btnNewButton.setBounds(165, 157, 96, 23);
		contentPane.add(btnNewButton);
	}
}
