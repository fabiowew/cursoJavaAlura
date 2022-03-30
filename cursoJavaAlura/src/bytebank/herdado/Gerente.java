package bytebank.herdado;

//Gerente e um funcionario autenticavel
public class Gerente extends FuncionarioAutenticavel{
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return super.getSalario();
	}
	
}
