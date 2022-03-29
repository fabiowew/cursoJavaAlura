package bytebank.herdado;

public class EditorVideo extends Funcionario{
	
	
	public double getBonificacao() {
		System.out.println("cHAMANDO O METODO BONIFICACAO DO EDITOR DE VIDEO");
		return super.getBonificacao() + 100;
	}
	
	
}
