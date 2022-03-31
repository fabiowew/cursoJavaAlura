package bytebank.herdado;

//Gerente e um funcionario, Gerente herda da class Funcionario, asssina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chama o metodo de bonificacao do Gerente");
		return 50;
	}


	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
