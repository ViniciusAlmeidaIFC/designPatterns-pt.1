package factory_carros;

public class FabricaFiat implements FabricaCarro {

	@Override
	public Carro criarCarro() {
		return new Fiat();
	}

}
