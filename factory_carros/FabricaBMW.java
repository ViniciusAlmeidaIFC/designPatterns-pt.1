package factory_carros;

public class FabricaBMW implements FabricaCarro{

	@Override
	public Carro criarCarro() {
		return new BMW();
	}
}
