package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Gasolina;
import model.Retangulo;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textpreco;
	private JTextField textreais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4 frame = new Ex4();
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
	public Ex4() {
		setTitle("Preço da gasolina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textpreco = new JTextField();
		textpreco.setBounds(126, 32, 86, 20);
		contentPane.add(textpreco);
		textpreco.setColumns(10);
		
		textreais = new JTextField();
		textreais.setBounds(126, 83, 86, 20);
		contentPane.add(textreais);
		textreais.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Gasolina$");
		lblNewLabel.setBounds(48, 35, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reais");
		lblNewLabel_1.setBounds(48, 86, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(123, 138, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float Preco, Reais;
				Preco = Float.valueOf(textpreco.getText());
				Reais = Float.valueOf(textreais.getText());
				Gasolina calculo = new Gasolina();
				float Gas = calculo.CalcGasolina(Preco,Reais);
				
				
				JOptionPane.showMessageDialog(null, "Você pode encher "+Gas+" litros de gasolina ");
				
			}
		});
		contentPane.add(btnNewButton);
	}

}
