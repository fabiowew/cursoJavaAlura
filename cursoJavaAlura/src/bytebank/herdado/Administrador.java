package bytebank.herdado;

public class Administrador extends FuncionarioAutenticavel {

	private int senha;
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	
	

}
