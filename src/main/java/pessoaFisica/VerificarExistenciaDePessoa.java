package pessoaFisica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VerificarExistenciaDePessoa {
	
	
	private JFrame verificarExistenciaDePessoa;
	private JLabel lbRG, lbCPF;
	private JTextField txRG, txCPF;
	private JButton btBuscaRG, btBuscaCPF;
	private TabelaPessoaFisica tabelapf = new TabelaPessoaFisica();
	
	public void setVerificarExistenciaDePessoa() {
		verificarExistenciaDePessoa = new JFrame();
		verificarExistenciaDePessoa.setLayout(null);
		getContentPane();
		verificarExistenciaDePessoa.setSize(400, 120);
		verificarExistenciaDePessoa.setVisible(true);
	}
	
	
	private void getContentPane(){
		verificarExistenciaDePessoa.getContentPane().add(getLbRG());
		verificarExistenciaDePessoa.getContentPane().add(getLbCPF());
		verificarExistenciaDePessoa.getContentPane().add(getTxRG());
		verificarExistenciaDePessoa.getContentPane().add(getTxCPF());
		verificarExistenciaDePessoa.getContentPane().add(getBtBuscaRG());
		verificarExistenciaDePessoa.getContentPane().add(getBtBuscaCPF());
		
	}
	
	public JLabel getLbRG() {
		lbRG = new JLabel("RG");
		lbRG.setBounds(10, 10, 100, 20);
		return lbRG;
	}
	
	public JLabel getLbCPF() {
		lbCPF = new JLabel("CPF");
		lbCPF.setBounds(10,40,100,20);
		return lbCPF;
	}
	
	public JTextField getTxRG() {
		txRG = new JTextField();
		txRG.setBounds(52, 10, 100, 20);
		return txRG;
	}
	
	public JTextField getTxCPF() {
		txCPF = new JTextField();
		txCPF.setBounds(52, 40, 100, 20);
		return txCPF;
	}
	
	public JButton getBtBuscaRG() {
		btBuscaRG = new JButton("Buscar RG");
		btBuscaRG.setBounds(160, 10, 130, 20);
		btBuscaRG.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				verificarExistenciaDePessoa.dispose();
				new TabelaPessoaFisica().setVisible(true);
			}
		});
		return btBuscaRG;
	}
	
	public JButton getBtBuscaCPF() {
		btBuscaCPF = new JButton("Buscar CPF");
		btBuscaCPF.setBounds(160, 40, 130, 20);
		btBuscaCPF.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				verificarExistenciaDePessoa.dispose();
				new TabelaPessoaFisica().setVisible(true);
			}
		});
		return btBuscaCPF;
	}
	
	
	public static void main(String[] args) {
		new VerificarExistenciaDePessoa()
			.setVerificarExistenciaDePessoa();
	}

}
