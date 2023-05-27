package telas_tcc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTable;


public class Tela1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;

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
		setTitle("Sistema TCC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 35, 572, 488);
		contentPane.add(tabbedPane);
		
		JPanel Alunos = new JPanel();
		tabbedPane.addTab("Aluno", null, Alunos, "Cadastro de alunos");
		Alunos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do aluno");
		lblNewLabel.setBounds(10, 41, 97, 14);
		Alunos.add(lblNewLabel);
		
		JLabel lblRa = new JLabel("RA");
		lblRa.setBounds(10, 81, 80, 14);
		Alunos.add(lblRa);
		
		textField = new JTextField();
		textField.setBounds(149, 38, 390, 20);
		Alunos.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(149, 78, 390, 20);
		Alunos.add(textField_1);
		
		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.setBackground(new Color(216, 250, 220));
		btnNewButton.setBounds(210, 236, 89, 23);
		Alunos.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(253, 216, 200));
		btnExcluir.setBounds(320, 236, 89, 23);
		Alunos.add(btnExcluir);
		
		JLabel lblDataDeIncio = new JLabel("Data de início:");
		lblDataDeIncio.setBounds(10, 132, 80, 14);
		Alunos.add(lblDataDeIncio);
		
		JLabel lblPrevisoDeConcluso = new JLabel("Previsão de conclusão:");
		lblPrevisoDeConcluso.setBounds(10, 177, 130, 14);
		Alunos.add(lblPrevisoDeConcluso);
		
		JTabbedPane orientacao = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Manter orientação", null, orientacao, null);
		
		JPanel reg_ori = new JPanel();
		orientacao.addTab("Registrar orientação", null, reg_ori, null);
		reg_ori.setLayout(null);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("ID grupo:");
		lblNewLabel_8_1_3.setBounds(22, 50, 141, 14);
		reg_ori.add(lblNewLabel_8_1_3);
		
		JComboBox rec_id1_1 = new JComboBox();
		rec_id1_1.setBounds(106, 46, 426, 22);
		reg_ori.add(rec_id1_1);
		
		JLabel lblNewLabel_8_1_2_1 = new JLabel("Data de entrega:");
		lblNewLabel_8_1_2_1.setBounds(22, 101, 141, 14);
		reg_ori.add(lblNewLabel_8_1_2_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Digite sua orientação");
		lblNewLabel_9_1.setBounds(22, 186, 141, 14);
		reg_ori.add(lblNewLabel_9_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 211, 426, 152);
		reg_ori.add(textField_3);
		
		JButton btnNewButton_2_2_1 = new JButton("Gravar");
		btnNewButton_2_2_1.setForeground(Color.BLACK);
		btnNewButton_2_2_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_2_1.setBounds(208, 404, 89, 23);
		reg_ori.add(btnNewButton_2_2_1);
		
		JButton btnExcluir_1_1_1 = new JButton("Limpar");
		btnExcluir_1_1_1.setBackground(new Color(253, 216, 200));
		btnExcluir_1_1_1.setBounds(333, 404, 89, 23);
		reg_ori.add(btnExcluir_1_1_1);
		
		JPanel hist_ori = new JPanel();
		orientacao.addTab("Histórico de orientação", null, hist_ori, null);
		hist_ori.setLayout(null);
		
		JLabel lblNewLabel_8_1_1_2 = new JLabel("ID grupo:");
		lblNewLabel_8_1_1_2.setBounds(10, 40, 141, 14);
		hist_ori.add(lblNewLabel_8_1_1_2);
		
		JComboBox rec_id2_1 = new JComboBox();
		rec_id2_1.setBounds(94, 36, 433, 22);
		hist_ori.add(rec_id2_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Consultar");
		btnNewButton_2_1_1_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1_1.setBackground(new Color(227, 252, 209));
		btnNewButton_2_1_1_1.setBounds(255, 83, 89, 23);
		hist_ori.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("Histórico:");
		lblNewLabel_8_1_1_1_1.setBounds(10, 145, 177, 14);
		hist_ori.add(lblNewLabel_8_1_1_1_1);
		
		JList list_3_1 = new JList();
		list_3_1.setBounds(94, 156, 433, 247);
		hist_ori.add(list_3_1);
		
		JTabbedPane mant_grupo = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Manter grupos", null, mant_grupo, null);
		
		JPanel reg_grup = new JPanel();
		mant_grupo.addTab("Registrar grupo", null, reg_grup, null);
		reg_grup.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID grupo");
		lblNewLabel_1_3.setBounds(20, 32, 81, 14);
		reg_grup.add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 29, 400, 20);
		reg_grup.add(textField_4);
		
		JLabel lblNewLabel_2_3 = new JLabel("Área do trabalho");
		lblNewLabel_2_3.setBounds(20, 67, 112, 14);
		reg_grup.add(lblNewLabel_2_3);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(130, 63, 400, 22);
		reg_grup.add(comboBox_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tema");
		lblNewLabel_3_1.setBounds(20, 108, 46, 14);
		reg_grup.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 105, 400, 20);
		reg_grup.add(textField_6);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(130, 143, 400, 22);
		reg_grup.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Orientador");
		lblNewLabel_4_2.setBounds(20, 147, 81, 14);
		reg_grup.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Metodologia");
		lblNewLabel_4_1_1.setBounds(20, 194, 81, 14);
		reg_grup.add(lblNewLabel_4_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(130, 191, 400, 20);
		reg_grup.add(textField_8);
		
		JLabel lblNewLabel_5_1 = new JLabel("Integrantes do grupo:");
		lblNewLabel_5_1.setBounds(20, 237, 146, 14);
		reg_grup.add(lblNewLabel_5_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(127, 260, 403, 104);
		reg_grup.add(textArea_1);
		
		JButton btnNewButton_1_1 = new JButton("Gravar");
		btnNewButton_1_1.setBackground(new Color(216, 250, 220));
		btnNewButton_1_1.setBounds(227, 398, 89, 23);
		reg_grup.add(btnNewButton_1_1);
		
		JButton btnExcluir_1_1 = new JButton("Limpar");
		btnExcluir_1_1.setBackground(new Color(253, 216, 200));
		btnExcluir_1_1.setBounds(337, 398, 89, 23);
		reg_grup.add(btnExcluir_1_1);
		
		JPanel consul_grup_sub = new JPanel();
		mant_grupo.addTab("Consultar grupo por subárea", null, consul_grup_sub, null);
		consul_grup_sub.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Selecione a subárea:");
		lblNewLabel_1_2_1.setBounds(10, 38, 127, 14);
		consul_grup_sub.add(lblNewLabel_1_2_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(138, 34, 393, 22);
		consul_grup_sub.add(comboBox_2);
		
		JButton btnNewButton_2_1_2 = new JButton("Consultar");
		btnNewButton_2_1_2.setForeground(Color.BLACK);
		btnNewButton_2_1_2.setBackground(new Color(227, 252, 209));
		btnNewButton_2_1_2.setBounds(288, 67, 89, 23);
		consul_grup_sub.add(btnNewButton_2_1_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Grupos:");
		lblNewLabel_2_2_1.setBounds(10, 107, 46, 14);
		consul_grup_sub.add(lblNewLabel_2_2_1);
		
		JList list_1_2_1 = new JList();
		list_1_2_1.setBounds(138, 106, 393, 228);
		consul_grup_sub.add(list_1_2_1);
		
		JPanel consul_grup_id = new JPanel();
		mant_grupo.addTab("Consultar grupo por ID", null, consul_grup_id, null);
		consul_grup_id.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID Grupo");
		lblNewLabel_1_1_1.setBounds(10, 43, 85, 14);
		consul_grup_id.add(lblNewLabel_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(87, 40, 465, 20);
		consul_grup_id.add(textField_9);
		
		JButton btnNewButton_2_2 = new JButton("Consultar");
		btnNewButton_2_2.setForeground(Color.BLACK);
		btnNewButton_2_2.setBackground(new Color(227, 252, 209));
		btnNewButton_2_2.setBounds(262, 76, 89, 23);
		consul_grup_id.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Informações do grupo:");
		lblNewLabel_2_1_1.setBounds(10, 104, 125, 14);
		consul_grup_id.add(lblNewLabel_2_1_1);
		
		JList list_4 = new JList();
		list_4.setBackground(Color.WHITE);
		list_4.setBounds(10, 129, 542, 251);
		consul_grup_id.add(list_4);
	}
}