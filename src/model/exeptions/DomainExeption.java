package model.exeptions;

public class DomainExeption extends RuntimeException {
//Obrigatorio a tratação de erros tem que lançar a exeção no contrutor e no metodo

	// RUNTIMEEXPETION =nao e obrigatorio a tratação de erros
	private static final long seriaVersionUID = 1L;

	public DomainExeption(String msg) {
		super(msg);// Permite a instanciação da mensagem personalizada passando uma msg para ela
	}

}
