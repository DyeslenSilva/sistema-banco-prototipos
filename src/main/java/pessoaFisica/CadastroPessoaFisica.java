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
	private JTextField txRG, txCPF;
	private JButton btBuscar;
	
	public void setCadastroPessoaFisica() {
		cadastroPessoaFisica.setSize(600, 600);
		cadastroPessoaFisica.getContentPane().add(getLbCPF());
		cadastroPessoaFisica.getContentPane().add(getLbRG());
		cadastroPessoaFisica.getContentPane().add(getTxRG());
		cadastroPessoaFisica.getContentPane().add(getTxCPF());
		cadastroPessoaFisica.getContentPane().add(getBtBuscar());
		cadastroPessoaFisica.getContentPane().add(getLbDadosPessoais());
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
	public static void main(String[] args) {
		new CadastroPessoaFisica().setCadastroPessoaFisica();
	}
}