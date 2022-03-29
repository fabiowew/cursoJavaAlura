package bytebank.herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Fabio Borges");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		
		Designer d = new Designer();
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
