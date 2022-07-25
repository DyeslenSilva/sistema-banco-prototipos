package pessoaFisica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ApagarCliente {

	private JFrame apagarCliente;
	private JLabel lbRG, lbCPF;
	private JTextField txCPF, txRG;
	private JButton btApagar, btFechar;
	
	public void setApagarCliente() {
		apagarCliente = new JFrame();
		apagarCliente.setSize(300,150);
		apagarCliente.getContentPane().add(getLbRG());
		apagarCliente.getContentPane().add(getLbCPF());
		apagarCliente.getContentPane().add(getTxRG());
		apagarCliente.getContentPane().add(getTxCPF());
		apagarCliente.getContentPane().add(getBtApagar());
		apagarCliente.getContentPane().add(getBtFechar());
		apagarCliente.setLayout(null);
		apagarCliente.setVisible(true);
	}
	
	
	public JLabel getLbRG() {
		lbRG = new JLabel("RG");
		lbRG.setBounds(10, 10, 100, 20);
		return lbRG;
	}
	
	public JLabel getLbCPF() {
		lbCPF = new JLabel("CPF");
		lbCPF.setBounds(10, 40, 100, 20);
		return lbCPF;
	}
	
	public JTextField getTxRG() {
		txRG = new JTextField();
		txRG.setBounds(50, 10, 100, 20);
		return txRG;
	}
	
	public JTextField getTxCPF() {
		txCPF = new JTextField();
		txCPF.setBounds(50, 40, 100, 20);
		return txCPF;
	}
	
	public JButton getBtApagar() {
		btApagar = new JButton("Apagar");
		btApagar.setBounds(10, 80, 100, 20);
		return btApagar;
	}
	
	
	public JButton getBtFechar() {
		btFechar = new JButton("Fechar");
		btFechar.setBounds(130, 80, 100, 20);
		btFechar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				apagarCliente.dispose();
			}
		});
		return btFechar;
	}
	
	public static void main(String[] args) {
		new ApagarCliente().setApagarCliente();
	}
}
