package bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int index; 
	
	public GuardadorDeContas() {
		super();
		this.referencias = new Conta[10];
	}
	
	public GuardadorDeContas(int tamanho) {
		super();
		this.referencias = new Conta[tamanho];
	}

	
	public void adiciona(Conta cc) {
		this.referencias[index] = cc; 
		this.index++;
	}

	public int getQuantidadeDeElementos() {
		return this.index;
	}

	public Conta getReferencia(int index) {
		return this.referencias[index];
	}

}
