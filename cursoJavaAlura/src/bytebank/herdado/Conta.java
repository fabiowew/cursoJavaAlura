package bytebank.herdado;

public abstract class Conta {

	protected double saldo;
    private int agencia;
    private int numero;
    private static int total;
    String titular;
    
    public Conta(int agencia, int numero) {
    	Conta.setTotal(Conta.getTotal() + 1);
    	this.setAgencia(agencia);
    	this.setNumero(numero);
    	
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}
}