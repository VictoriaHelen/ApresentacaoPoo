package exemplinhos;

public class PrincipalVeiculo {

	public static void main(String[] args) {
	    Veiculo carro = new Carro();
        carro.acelerar();
        carro.frear();

        Veiculo moto = new Moto();
        moto.acelerar();
        moto.frear();
    }
};


