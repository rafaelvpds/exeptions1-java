package model.exeptions;

public class DomainExeption extends RuntimeException {
//Obrigatorio a trata��o de erros tem que lan�ar a exe��o no contrutor e no metodo

	// RUNTIMEEXPETION =nao e obrigatorio a trata��o de erros
	private static final long seriaVersionUID = 1L;

	public DomainExeption(String msg) {
		super(msg);// Permite a instancia��o da mensagem personalizada passando uma msg para ela
	}

}
