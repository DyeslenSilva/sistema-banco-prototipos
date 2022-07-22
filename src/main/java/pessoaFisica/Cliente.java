package pessoaFisica;

import lombok.Data;

@Data
public class Cliente {
	private String rg,cpf,nome,nomeDaMae,nomeDoPai;
	private String cep, endereco, municipio,bairro,estado;
	private int nCasa;
	private String sResidenciaFixa, nResidenciaFixa;
	private String telefoneFixo, celular, email;
	private String profissaoAtual;
	private double remuneracao;
	private double renda;
	
	public String getCliente() {
		return getRg() +" "+getCpf()+" "
				+getNome()+" "+getNomeDoPai()+" "+getNomeDaMae()+
				" "+getCep() +" "+getEndereco()+" "+getNCasa() +getMunicipio()+
				" "+getBairro()+" "+getEstado()+" "+getSResidenciaFixa()+
				" "+getNResidenciaFixa()+" "+getTelefoneFixo()+" "+getCelular()+
				" "+getEmail() + " "+getProfissaoAtual()+" "+getRemuneracao()+
				" "+getRenda();
	}
	
}
