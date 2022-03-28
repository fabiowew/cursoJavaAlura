package mod.tres.heranca.interfaces;

public class TesteFuncionario {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico");
		nico.setCpf("99988899900");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}
	
}
