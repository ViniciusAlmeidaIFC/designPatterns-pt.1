package factory_funcionarios;

public class FabricaProgramador implements FabricaFunc {

	public Funcionario criarFunc() {
		return new Programador();
	}
}
