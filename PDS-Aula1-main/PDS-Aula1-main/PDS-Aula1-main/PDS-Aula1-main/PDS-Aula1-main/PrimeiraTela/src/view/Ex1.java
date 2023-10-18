package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Conversao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTemperatura;

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
		setTitle("Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperatura");
		lblNewLabel.setBounds(35, 25, 101, 14);
		contentPane.add(lblNewLabel);
		
		textTemperatura = new JTextField();
		textTemperatura.setBounds(158, 22, 86, 20);
		contentPane.add(textTemperatura);
		textTemperatura.setColumns(10);
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempDigitada = textTemperatura.getText();
				float tempConvertidaF = Float.valueOf(tempDigitada);
				Conversao conv = new Conversao();
				float tempC = conv.converterFtoC(tempConvertidaF);
				JOptionPane.showMessageDialog(null, "Temperatura convertida "+tempC);
			}
		});
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnCalcular.setBounds(145, 97, 89, 23);
		contentPane.add(btnCalcular);
	}

}
