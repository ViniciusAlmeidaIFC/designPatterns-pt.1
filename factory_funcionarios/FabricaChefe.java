package factory_funcionarios;

public class FabricaChefe {

	public Funcionario criarFunc() {
		return new Chefe();
	}
}
