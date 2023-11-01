package view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class PostodeCombustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textOleo;
	private JTextField textGasComum;
	private JTextField textGasAditivada;
	private JTextField textEtanol;
	private JTextField textFrasco500;
	private JTextField textFrasco1;
	private JTextField textQFrasco500;
	private JTextField textQFrasco1;
	private JTextField textLitros;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textDias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostodeCombustivel frame = new PostodeCombustivel();
					frame.setVisible(true);
					frame.setMinimumSize(new Dimension(623,535));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PostodeCombustivel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco de Combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco de Oleo de Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnNewButton = new JButton("Calcular");
		
		JButton btnNewButton_1 = new JButton("Novo Calculo");
		
		JButton btnNewButton_2 = new JButton("Fechar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
							.addGap(0)))
					.addGap(0))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(78)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
					.addGap(76)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 83, Short.MAX_VALUE)
					.addGap(82)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE)
					.addGap(61))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_4.setLayout(new MigLayout("", "[][][][][][grow]", "[][][][]"));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("À Vista");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_4.add(rdbtnNewRadioButton, "cell 0 0,growx");
		
		JLabel lblNewLabel_18 = new JLabel("Dias");
		panel_4.add(lblNewLabel_18, "cell 4 1,alignx trailing");
		
		textDias = new JTextField();
		panel_4.add(textDias, "cell 5 1,growx");
		textDias.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel_4.add(rdbtnNewRadioButton_1, "cell 0 2,growx");
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar:");
		panel_4.add(lblTotalAPagar, "cell 1 3");
		
		JLabel lblNewLabel_19 = new JLabel("-");
		panel_4.add(lblNewLabel_19, "cell 3 3");
		panel_3.setLayout(new MigLayout("", "[][][grow]", "[][][][][]"));
		
		JLabel lblNewLabel_14 = new JLabel("Combustivel");
		panel_3.add(lblNewLabel_14, "cell 0 0,grow");
		
		JComboBox comboBox = new JComboBox();
		panel_3.add(comboBox, "cell 2 0,grow");
		
		JLabel lblNewLabel_15 = new JLabel("Quantidade de Litros");
		panel_3.add(lblNewLabel_15, "cell 0 2,grow");
		
		textLitros = new JTextField();
		panel_3.add(textLitros, "cell 2 2,grow");
		textLitros.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Total Combustivel");
		panel_3.add(lblNewLabel_16, "cell 0 4,grow");
		
		JLabel lblNewLabel_17 = new JLabel("-");
		panel_3.add(lblNewLabel_17, "cell 2 4,growx");
		panel_2.setLayout(new MigLayout("", "[][][grow][][][][][][][][]", "[][][]"));
		
		JLabel lblNewLabel_8 = new JLabel("Quantidade");
		panel_2.add(lblNewLabel_8, "cell 2 0,grow");
		
		JLabel lblNewLabel_11 = new JLabel("Valor a Pagar");
		panel_2.add(lblNewLabel_11, "cell 4 0,grow");
		
		JLabel lblNewLabel_12 = new JLabel("Total Oleo");
		panel_2.add(lblNewLabel_12, "cell 7 0,growx,aligny center");
		
		JLabel lblNewLabel_6 = new JLabel("Frasco de 500ml");
		panel_2.add(lblNewLabel_6, "cell 0 1,grow");
		
		textQFrasco500 = new JTextField();
		panel_2.add(textQFrasco500, "cell 2 1,growx");
		textQFrasco500.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("-");
		panel_2.add(lblNewLabel_9, "cell 4 1,grow");
		
		JLabel lblNewLabel_13 = new JLabel("-");
		panel_2.add(lblNewLabel_13, "cell 7 1,growx");
		
		JLabel lblNewLabel_7 = new JLabel("Frasco de 1l");
		panel_2.add(lblNewLabel_7, "cell 0 2,alignx center,aligny center");
		
		textQFrasco1 = new JTextField();
		panel_2.add(textQFrasco1, "cell 2 2,growx");
		textQFrasco1.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("-");
		panel_2.add(lblNewLabel_10, "cell 4 2,grow");
		panel_1.setLayout(new MigLayout("", "[][][][][grow]", "[][][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml");
		panel_1.add(lblNewLabel_4, "cell 0 0,grow");
		
		textFrasco500 = new JTextField();
		panel_1.add(textFrasco500, "cell 4 0,grow");
		textFrasco500.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Frasco 1l");
		panel_1.add(lblNewLabel_5, "cell 0 2,grow");
		
		textFrasco1 = new JTextField();
		panel_1.add(textFrasco1, "cell 4 2,grow");
		textFrasco1.setColumns(10);
		panel.setLayout(new MigLayout("", "[][][][grow]", "[][][][]"));
		
		JLabel lblNewLabel = new JLabel("Oleo Diesel:");
		panel.add(lblNewLabel, "cell 0 0,grow");
		
		textOleo = new JTextField();
		panel.add(textOleo, "cell 3 0,growx");
		textOleo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gas. Comum:");
		panel.add(lblNewLabel_1, "cell 0 1,grow");
		
		textGasComum = new JTextField();
		panel.add(textGasComum, "cell 3 1,growx");
		textGasComum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gas. Aditivada:");
		panel.add(lblNewLabel_2, "cell 0 2,grow");
		
		textGasAditivada = new JTextField();
		panel.add(textGasAditivada, "cell 3 2,growx");
		textGasAditivada.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Etanol");
		panel.add(lblNewLabel_3, "cell 0 3,grow");
		
		textEtanol = new JTextField();
		panel.add(textEtanol, "cell 3 3,growx");
		textEtanol.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}
}
