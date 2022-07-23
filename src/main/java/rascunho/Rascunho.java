package rascunho;

import javax.swing.JFrame;

public class Rascunho {

	private JFrame consultaRG = new JFrame();
	
	public void setConsultaRG() {
		consultaRG.setLayout(null);
		consultaRG.setSize(400, 200);
		consultaRG.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Rascunho().setConsultaRG();
	}
	
}
