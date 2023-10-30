package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.RetanguloCalculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Ex1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	protected AbstractButton rdbtnArea;
	protected AbstractButton rdbtnPerimetro;
	protected JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setBounds(41, 27, 131, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(287, 27, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		textBase = new JTextField();
		textBase.setBounds(22, 52, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setBounds(261, 52, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBase.setText(null);
				textAltura.setText(null);
				
			}
		});
		btnLimpar.setBounds(19, 189, 89, 23);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(162, 167, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnarea = new JRadioButton("Calcular Area");
		buttonGroup.add(rdbtnarea);
		rdbtnarea.setBounds(22, 103, 150, 23);
		contentPane.add(rdbtnarea);
		
		JRadioButton rdbtnperimetro = new JRadioButton("Calcular Perímetro");
		buttonGroup.add(rdbtnperimetro);
		rdbtnperimetro.setBounds(238, 103, 173, 23);
		contentPane.add(rdbtnperimetro);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float altura, base;
				altura = Float.valueOf(textAltura.getText());
				base = Float.valueOf(textBase.getText());
				RetanguloCalculo calculo = new RetanguloCalculo();
				

				if(rdbtnarea.isSelected()) {
					float area=calculo.calculoA(base, altura);
					lblNewLabel_2.setText(String.valueOf(area));
				}
		
				else if(rdbtnperimetro.isSelected()){
					float perimetro=calculo.calculoP(base, altura);
					lblNewLabel_2.setText(String.valueOf(perimetro));
				} 
			}
		});
		btnCalcular.setBounds(142, 189, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(273, 189, 89, 23);
		contentPane.add(btnFechar);
		

		
		
	}
}
