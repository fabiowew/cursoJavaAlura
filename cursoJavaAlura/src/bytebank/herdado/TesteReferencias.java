package bytebank.herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		ControleBonificacao controle = new ControleBonificacao();
		
		Gerente g1 = new Gerente();
		g1.setNome("Fabio Borges");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
