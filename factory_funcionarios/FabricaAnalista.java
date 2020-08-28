package factory_funcionarios;

public class FabricaAnalista implements FabricaFunc {

	public Funcionario criarFunc() {
		return new Analista();
	}
}
