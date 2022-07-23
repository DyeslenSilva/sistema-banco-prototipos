package pessoaFisica;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ConsultaClientePorRG extends JFrame{
	//private  JFrame consultaClientePorRG;
	private JLabel lbRG;
	private JTextField txRG;
	//private JList<String> listaCliente;
	private  JTable dadosCliente;
	//private JScrollPane scrollPane;
	//private DefaultTableModel tableModel;
	private JPanel consultaClienteRG;
	private JButton janelaConsulta;
	
	
	private  Object[] colunas = new Object[]{"RG","CPF","Nome","Nome da Mae","Nome do Pai","CEP","Endereco",
			"nCasa","Municipio","Estado","Residencia Fixa","Telefone Fixo","Celular","Email",
			"Profissao","Remuneracao","Renda"};
	private  Object[][] dados = {{"3698514011","55263987401","Julia Lima","Regina Lima","Paulo de Lima","06645-141","Av Lima"
			,"1520","Cascavel","Parana","S","45-75221555","45-965012055","julima88@gmail.com",
			"desenvolvedora","R$5211,33","R$3654,30"},
			{"14620252362","14520120554","Tales Mendes","Renata Mendes","Caio Silva","25478-144","Rua das Mangas","382","Umuarama","Parana",
				"S","44-964561452","44-9522152224","tls588@gmail.com","Arquiteto","R$15336,00","R$15336,00"}
	};
	
	public ConsultaClientePorRG() {
		//consultaRG();
		setLayout(new FlowLayout());
		setSize(1900, 600);
		setLocationRelativeTo(null);
		setTitle("Consulta Cliente");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().add(getLbRG());
		//getContentPane().add(getTxRG());
		getContentPane().add(getJanelaConsulta());
		dadosCliente = new JTable(dados, colunas);
        dadosCliente.setPreferredScrollableViewportSize(new Dimension(1200,400));//barra de rolagem
        dadosCliente.setFillsViewportHeight(true);
        
        JScrollPane jScrollPane = new JScrollPane(dadosCliente);
        add(jScrollPane);

	}
	
	public JButton getJanelaConsulta() {
		janelaConsulta = new JButton("Consulta");
		janelaConsulta.setBounds(10, 1400, 100, 20);
		janelaConsulta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				consultaRG();
			}
		});
		return janelaConsulta;
	}
	
	private void consultaRG() {
		JFrame consultaRg = new JFrame();
		consultaRg.setLayout(null);
		JLabel lbRG = new JLabel("RG");
		lbRG.setBounds(10, 10, 100, 20);
		JTextField txRG = new JTextField();
		txRG.setBounds(30, 10, 100, 20);
		JButton btConsulta = new JButton("Consulta");
		btConsulta.setBounds(150, 10, 100, 20);
		consultaRg.getContentPane().add(lbRG);
		consultaRg.getContentPane().add(txRG);
		consultaRg.getContentPane().add(btConsulta);
		consultaRg.setSize(400, 200);
		consultaRg.setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new ConsultaClientePorRG().setVisible(true);;
		//new ConsultaClientePorRG().consultaRG();
	}

	
}