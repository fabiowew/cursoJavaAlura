package mod.tres.heranca.interfaces;

public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(3000.00);
		
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		Funcionario f2 = new Funcionario();
		f2.setTipo(2);
		f2.setSalario(5000);
		
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
	}
}
