package mod.dois.javaOO;

public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(90);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		conta.setTitular(paulo);
		paulo.setCpf("13455");
		
		
		
	}
}
