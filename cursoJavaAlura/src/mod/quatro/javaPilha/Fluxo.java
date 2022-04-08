package mod.quatro.javaPilha;

public class Fluxo {

    public static void main(String[] args) {
    	
    	
    	
        System.out.println("Ini do main");
        try {
        	metodo1();
            System.out.println("Fim do main");
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println("A mensagem e:" + msg);
			
		}
        
        
    }

    private static void metodo1() {
    	try {

    		metodo2();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("A mensagem e:" + msg);
			ex.printStackTrace();
		}
    	
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        throw new ArithmeticException("Deu errado!");
        
        //System.out.println("Fim do metodo2");
    }
}