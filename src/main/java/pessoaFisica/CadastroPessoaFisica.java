package pessoaFisica;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroPessoaFisica {
	private JFrame cadastroPessoaFisica = new JFrame("Pessoa Fisica");
	private JLabel lbDadosPessoais;
	private JLabel lbCPF, lbRG;
	private JLabel lbNome, lbNomeDoPai, lbNomeDaMae;
	private JLabel lblCEPTitle;
	private JLabel lbCEP;
	private JTextField txNomeDoPai, TxNomeDaMae;
	private JTextField txRG, txCPF;
	private JTextField txNomeCliente;
	private JTextField txCEP;
	private JButton btBuscar;
	private JButton btBuscaCEP;
	
	public void setCadastroPessoaFisica() {
		cadastroPessoaFisica.setSize(600, 600);
		cadastroPessoaFisica.getContentPane().add(getLbCPF());
		cadastroPessoaFisica.getContentPane().add(getLbRG());
		cadastroPessoaFisica.getContentPane().add(getTxRG());
		cadastroPessoaFisica.getContentPane().add(getTxCPF());
		cadastroPessoaFisica.getContentPane().add(getBtBuscar());
		cadastroPessoaFisica.getContentPane().add(getLbDadosPessoais());
		cadastroPessoaFisica.getContentPane().add(getLbNome());
		//cadastroPessoaFisica.getContentPane().add(getTxNome());
		cadastroPessoaFisica.getContentPane().add(getTxNomeCliente());
		cadastroPessoaFisica.getContentPane().add(getLbNomeDaMae());
		cadastroPessoaFisica.getContentPane().add(getTxNomeDaMae());
		cadastroPessoaFisica.getContentPane().add(getLbNomeDoPai());
		cadastroPessoaFisica.getContentPane().add(getTxNomeDoPai());
		cadastroPessoaFisica.getContentPane().add(getLblCEPTitle());
		cadastroPessoaFisica.getContentPane().add(getLbCEP());
		cadastroPessoaFisica.getContentPane().add(getTxCEP());
		cadastroPessoaFisica.getContentPane().add(getBtBuscaCEP());
		cadastroPessoaFisica.setLayout(null);
		cadastroPessoaFisica.setVisible(true);
	}
	
	
	public JLabel getLbRG() {
		lbRG = new JLabel("RG");
		lbRG.setBounds(10,10,100,20);
		return lbRG;
	}
	
	public JLabel getLbCPF() {
		lbCPF = new JLabel("CPF");
		lbCPF.setBounds(10,60, 100, 20);
		return lbCPF;
	}
	
	
	public JTextField getTxRG() {
		txRG = new JTextField();
		txRG.setBounds(40, 10, 100, 20);
		return txRG;
	}
	
	public JTextField getTxCPF() {
		txCPF = new JTextField();
		txCPF.setBounds(40, 60, 100, 20);
		return txCPF;
	}
	
	
	public JButton getBtBuscar() {
		btBuscar = new JButton("Buscar");
		btBuscar.setBounds(150, 30, 100, 30);
		btBuscar.setBackground(Color.orange);
		return btBuscar;
	}
	
	
	public JLabel getLbDadosPessoais() {
		String dadosPessoais = "dados pessoais".toUpperCase();
		lbDadosPessoais = new JLabel(dadosPessoais);
		lbDadosPessoais.setBounds(90, 90, 170, 30);
		return lbDadosPessoais;
	}
	
	public JLabel getLbNome() {
		lbNome = new JLabel("Nome");
		lbNome.setBounds(10, 130, 140, 20);
		return lbNome;
	}
	
//	public JTextField getTxNome() {
//		txNome = new JTextField();
//		txNome.setBounds(90, 130, 100, 20);
//		return txNome;
//	}
//	
	
	public JTextField getTxNomeCliente() {
		txNomeCliente = new JTextField();
		txNomeCliente.setBounds(50, 130, 130, 20);
		return txNomeCliente;
	}
	public JLabel getLbNomeDaMae() {
		lbNomeDaMae = new JLabel("Nome da Mae");
		lbNomeDaMae.setBounds(190, 130, 140, 20);
		return lbNomeDaMae;
	}
	
	public JTextField getTxNomeDaMae() {
		TxNomeDaMae = new JTextField();
		TxNomeDaMae.setBounds(300, 130, 140,20);
		return TxNomeDaMae;
	}
	
	public JLabel getLbNomeDoPai() {
		lbNomeDoPai = new JLabel("Nome do Pai");
		lbNomeDoPai.setBounds(190, 170, 140, 20);
		return lbNomeDoPai;
	}
	
	public JTextField getTxNomeDoPai() {
		txNomeDoPai = new JTextField();
		txNomeDoPai.setBounds(300, 170, 140, 20);
		return txNomeDoPai;
	}
	
	public JLabel getLblCEPTitle() {
		lblCEPTitle = new JLabel("CEP");
		lblCEPTitle.setBounds(50, 200, 70, 20);
		return lblCEPTitle;
	}
	
	public JLabel getLbCEP() {
		lbCEP = new JLabel("CEP");
		lbCEP.setBounds(10, 240, 100, 20);
		return lbCEP;
	}
	
	public JTextField getTxCEP() {
		txCEP = new JTextField();
		txCEP.setBounds(50, 240, 100, 20);
		return txCEP;
	}
	
	public JButton getBtBuscaCEP() {
		btBuscaCEP = new JButton("Busca CEP");
		btBuscaCEP.setBounds(190, 240, 100, 20);
		return btBuscaCEP;
	}
	
	public static void main(String[] args) {
		new CadastroPessoaFisica().setCadastroPessoaFisica();
	}
}