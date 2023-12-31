import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;
	private JTextField texttelefone;
	private JTextField textIdade;
	private JTextField textPeso;
	private JTextField textAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 104, 805, 266);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: "+pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(185, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(181, 36, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				String telefone = texttelefone.getText();
				String idade = textIdade.getText();
				String peso = textPeso.getText();
				String altura = textAltura.getText();
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setTelefone(Integer.parseInt(telefone));
				p.setIdade(Integer.parseInt(idade));
				p.setPeso(Float.parseFloat(peso));
				p.setAltura(Float.parseFloat(altura));
				
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
				
				
				
			}
		});
		btnNewButton.setBounds(11, 67, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_1.setBounds(110, 67, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(210, 67, 89, 23);
		contentPane.add(btnNewButton_2);
		
		texttelefone = new JTextField();
		texttelefone.setBounds(350, 36, 109, 20);
		contentPane.add(texttelefone);
		texttelefone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setBounds(346, 11, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		textIdade = new JTextField();
		textIdade.setBounds(502, 36, 109, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(500, 11, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		textPeso = new JTextField();
		textPeso.setBounds(642, 36, 109, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Peso");
		lblNewLabel_3.setBounds(642, 11, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textAltura = new JTextField();
		textAltura.setBounds(798, 36, 118, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Altura");
		lblNewLabel_4.setBounds(798, 11, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPF", "Telefone", "Idade", "Peso", "Altura"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
	}
}










