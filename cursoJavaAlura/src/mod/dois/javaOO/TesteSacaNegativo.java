package mod.dois.javaOO;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta(0, 0);
		conta.deposita(100);
		conta.saca(100);
		System.out.println(conta.getSaldo());
		
		conta.setNumero(130);
		
	}
}
