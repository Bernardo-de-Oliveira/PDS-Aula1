package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepósitoMensal = new JLabel("Depósito Mensal R$:");
		lblDepósitoMensal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepósitoMensal.setBounds(54, 11, 132, 14);
		contentPane.add(lblDepósitoMensal);
		
		textField = new JTextField();
		textField.setBounds(44, 25, 142, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNummeses = new JLabel("Num. de meses:");
		lblNummeses.setHorizontalAlignment(SwingConstants.CENTER);
		lblNummeses.setBounds(54, 56, 119, 14);
		contentPane.add(lblNummeses);
		
		textField_1 = new JTextField();
		textField_1.setBounds(44, 73, 142, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblJurosMes.setBounds(44, 97, 129, 14);
		contentPane.add(lblJurosMes);
		
		textField_2 = new JTextField();
		textField_2.setBounds(44, 117, 142, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total Investido + juros R$:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(28, 141, 181, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(70, 166, 89, 23);
		contentPane.add(btnCalcular);
	}
}
