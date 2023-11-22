package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.Calculos;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import model.ENUM;

public class Tela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text500mlPreco;
	private JTextField text1LPreco;
	private JTextField textDieselPreco;
	private JTextField textComumPreco;
	private JTextField textAditivPreco;
	private JTextField textEtanolPreco;
	private JTextField text500mlquanti;
	private JTextField text1LQuanti;
	private JTextField textQuantiLitros;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textDias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		Calculos c=new Calculos();
		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[636px]", "[125px][130px][120px][25]"));
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7, "cell 0 0,grow");
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_7.add(panel_1);
		panel_1.setToolTipText("Tabela preço");
		panel_1.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o Do Combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Óleo díesel:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		textDieselPreco = new JTextField();
		textDieselPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorDiesel=Float.valueOf(textDieselPreco.getText());
			}
		});
		panel_3.add(textDieselPreco);
		textDieselPreco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gas. Comum:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		textComumPreco = new JTextField();
		textComumPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorComum=Float.valueOf(textComumPreco.getText());
			}
		});
		panel_4.add(textComumPreco);
		textComumPreco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gas. Aditivada:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		textAditivPreco = new JTextField();
		textAditivPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorAditivada=Float.valueOf(textAditivPreco.getText());
			}
		});
		panel_5.add(textAditivPreco);
		textAditivPreco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Etanol");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		textEtanolPreco = new JTextField();
		textEtanolPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valorEtanol=Float.valueOf(textEtanolPreco.getText());
			}
		});
		panel_6.add(textEtanolPreco);
		textEtanolPreco.setColumns(10);
		
		JPanel panel = new JPanel();
		panel_7.add(panel);
		panel.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		text500mlPreco = new JTextField();
		text500mlPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valor500ml=Float.valueOf(text500mlPreco.getText());
				
			}
		});
		text500mlPreco.setText("");
		panel.add(text500mlPreco);
		text500mlPreco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Frasco 1L");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);
		
		text1LPreco = new JTextField();
		text1LPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.valor1L=Float.valueOf(text1LPreco.getText());
			}
		});
		panel.add(text1LPreco);
		text1LPreco.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_8, "cell 0 1,grow");
		panel_8.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9);
		
		JLabel lblNewLabel_6 = new JLabel("Quantidade");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Valor a Pagar");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Total Óleo");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Frasco de 500ml");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_9);
		
		JLabel lblValorP500mlOleo = new JLabel("-");
		lblValorP500mlOleo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl500mlTotalOleo = new JLabel("-");
		lbl500mlTotalOleo.setHorizontalAlignment(SwingConstants.CENTER);
		
		text500mlquanti = new JTextField();
		text500mlquanti.addFocusListener(new FocusAdapter() {
			
			
			public void focusLost(FocusEvent e) {
				
				c.quantidade500ml=Float.valueOf(text500mlquanti.getText());
				lblValorP500mlOleo.setText("R$ "+c.c500ml());		
				lbl500mlTotalOleo.setText("R$ "+c.totalOleo());
			}
		});
		panel_8.add(text500mlquanti);
		text500mlquanti.setColumns(10);
		
		panel_8.add(lblValorP500mlOleo);
		
		
		
		
		panel_8.add(lbl500mlTotalOleo);
		
		JLabel lblNewLabel_11 = new JLabel("Frasco de 1L");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_11);
		
		JLabel lblValor1L = new JLabel("-");
		lblValor1L.setHorizontalAlignment(SwingConstants.CENTER);
		text1LQuanti = new JTextField();
		text1LQuanti.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				c.quantidade1L=Float.valueOf(text1LQuanti.getText());
				lblValor1L.setText("R$ "+c.c1L());
				lbl500mlTotalOleo.setText("R$ "+c.totalOleo());
			}
		});
		panel_8.add(text1LQuanti);
		text1LQuanti.setColumns(10);
		
		
		panel_8.add(lblValor1L);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10, "cell 0 2,grow");
		panel_10.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Combustível:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_10);
		
		JComboBox comboBoxCombustivel = new JComboBox();
		comboBoxCombustivel.setModel(new DefaultComboBoxModel(ENUM.values()));
		panel_11.add(comboBoxCombustivel);
		
		JLabel lblNewLabel_12 = new JLabel("Quantidade Litros");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_12);
		
		JLabel lblTotalComb = new JLabel("-");
		lblTotalComb.setHorizontalAlignment(SwingConstants.CENTER);
		
		textQuantiLitros = new JTextField();
		textQuantiLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int posicao=comboBoxCombustivel.getSelectedIndex();
				float qLitros=Float.valueOf(textQuantiLitros.getText());
				if(posicao==0)
				{
					lblTotalComb.setText("R$ "+c.Diesel(qLitros));
				}
				else if(posicao==1)
				{
					lblTotalComb.setText("R$ "+c.Comum(qLitros));
				}
				else if(posicao==2)
				{
					lblTotalComb.setText("R$ "+c.Aditivada(qLitros));
				}
				else if(posicao==3)
				{
					lblTotalComb.setText("R$ "+c.Etanol(qLitros));
				}
			}
		});
		panel_11.add(textQuantiLitros);
		textQuantiLitros.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Total Combustível:");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_13);
		
		
		panel_11.add(lblTotalComb);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14);
		panel_14.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 1, 0, 0));
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		buttonGroup.add(rdbtnVista);
		panel_15.add(rdbtnVista);
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnPrazo);
		panel_15.add(rdbtnPrazo);
		
		JPanel panel_16 = new JPanel();
		panel_14.add(panel_16);
		panel_16.setLayout(new BoxLayout(panel_16, BoxLayout.X_AXIS));
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17);
		panel_17.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("129px"),},
			new RowSpec[] {
				RowSpec.decode("43px"),}));
		
		JLabel lblNewLabel_15 = new JLabel("Dias:");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_17.add(lblNewLabel_15, "2, 1");
		lblNewLabel_15.setVerticalAlignment(SwingConstants.BOTTOM);
		
		textDias = new JTextField();
		textDias.setHorizontalAlignment(SwingConstants.LEFT);
		panel_17.add(textDias, "3, 1, center, center");
		textDias.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13);
		
		JLabel lblNewLabel_16 = new JLabel("Total a pagar:");
		panel_13.add(lblNewLabel_16);
		
		JLabel lblTotal = new JLabel("-");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblTotal);
		
		JPanel panel_18 = new JPanel();
		contentPane.add(panel_18, "cell 0 3,grow");
		panel_18.setLayout(new MigLayout("", "[318px,grow][318px][318px]", "[45px,grow,top]"));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(rdbtnVista.isSelected())
				{
					String total=c.TotalpagarVista();
					lblTotal.setText("R$ "+total);
				}
				else if(rdbtnPrazo.isSelected())
				{
					Integer dias=Integer.valueOf(textDias.getText());
					if(dias<=30)
					{
					String total= c.totalPagarPrazo();
					lblTotal.setText("R$ "+total);
					}
					else if(dias>30)
					{
						String total= c.totalPagarPrazo30();
						lblTotal.setText("R$ "+total);
					}
				}
				
			
			}
		});
		panel_18.add(btnCalcular, "cell 0 0,alignx center");
		
		JButton btnNovoCalculo = new JButton("Novo Cálculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDieselPreco.setText(null);
				textComumPreco.setText(null);
				textAditivPreco.setText(null);
				textEtanolPreco.setText(null);
				text500mlPreco.setText(null);
				text1LPreco.setText(null);
				text500mlquanti.setText(null);
				text1LQuanti.setText(null);
				textQuantiLitros.setText(null);
				textDias.setText(null);
				lblTotal.setText(null);
				lblTotalComb.setText("-");
				lblValor1L.setText("-");
				lblValorP500mlOleo.setText("-");
				lbl500mlTotalOleo.setText("-");
				
			}
		});
		panel_18.add(btnNovoCalculo, "cell 1 0,alignx center");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel_18.add(btnFechar, "cell 2 0,alignx center");
	}

}
