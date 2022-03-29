package bytebank.herdado;

public class TesteContas {

	public static void main(String[] args) {

		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(200.0);
		
		ContaPoupanca cp = new ContaPoupanca(100, 100);
		cp.deposita(100);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

		
	}
}