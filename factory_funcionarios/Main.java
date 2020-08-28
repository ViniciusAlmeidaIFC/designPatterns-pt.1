package factory_funcionarios;

public class Main {

	public static void main(String[] args) {
		FabricaFunc fabrica = new FabricaProgramador();
		Programador prog = new Programador();
		prog.setEndereco("ABC");
		prog.setFone("1234");
		prog.setNome("Aaaa");
		prog.setInfoFunc("Programador com experiência em Java");
		Funcionario func = fabrica.criarFunc();
		func = prog;
		System.out.println(func);
		
		fabrica = new FabricaAnalista();
		Analista analista = new Analista();
		analista.setEndereco("ABC");
		analista.setFone("1234");
		analista.setNome("Aaaa");
		analista.setInfoFunc("Analista com experiência na empresa Oracle");
		func = analista;
		System.out.println(func);
	}

}
