package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Calculadora;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimeiro;
	private JTextField textSegundo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	protected JLabel lblNewLabel_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primeiro");
		lblNewLabel.setBounds(42, 30, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo");
		lblNewLabel_1.setBounds(299, 30, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		textPrimeiro = new JTextField();
		textPrimeiro.setBounds(39, 65, 86, 20);
		contentPane.add(textPrimeiro);
		textPrimeiro.setColumns(10);
		
		textSegundo = new JTextField();
		textSegundo.setBounds(299, 65, 86, 20);
		contentPane.add(textSegundo);
		textSegundo.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("Adição");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setBounds(42, 110, 109, 23);
		contentPane.add(rdbtnAdicao);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		rdbtnMultiplicacao.setBounds(299, 110, 109, 23);
		contentPane.add(rdbtnMultiplicacao);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("Subtração");
		buttonGroup.add(rdbtnSubtracao);
		rdbtnSubtracao.setBounds(42, 157, 109, 23);
		contentPane.add(rdbtnSubtracao);
		
		JRadioButton rdbtnDivisao = new JRadioButton("Divisão");
		buttonGroup.add(rdbtnDivisao);
		rdbtnDivisao.setBounds(299, 157, 109, 23);
		contentPane.add(rdbtnDivisao);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(299, 219, 46, 14);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(73, 190, 296, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float Primeiro = Float.valueOf(textPrimeiro.getText());
				float Segundo = Float.valueOf(textSegundo.getText());
				Calculadora calculo= new Calculadora();
				
				if(rdbtnAdicao.isSelected())
				{
					float resultado = calculo.Adicao(Primeiro, Segundo);
					lblNewLabel_2.setText("Resultado: " + resultado);
				}
				if(rdbtnSubtracao.isSelected())
				{
					float resultado= calculo.Subtracao(Primeiro, Segundo);
					lblNewLabel_2.setText("Resultado: "+ resultado);
				}
				if(rdbtnMultiplicacao.isSelected())
				{
					float resultado= calculo.Multiplicacao(Primeiro, Segundo);
					lblNewLabel_2.setText("Resultado: "+resultado);
				}
				if(rdbtnDivisao.isSelected())
				{
					float resultado= calculo.Divisao(Primeiro, Segundo);
					lblNewLabel_2.setText("Resultado: "+resultado);
				}
				
			}
		});
		btnCalcular.setBounds(159, 215, 89, 23);
		contentPane.add(btnCalcular);
		
		
	}

}
