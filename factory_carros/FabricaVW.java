package factory_carros;

public class FabricaVW implements FabricaCarro {

	@Override
	public Carro criarCarro() {
		return new VW();
	}
}
