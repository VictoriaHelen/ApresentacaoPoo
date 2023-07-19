package exemplinhos;

public class PrincipalAnimal {

	public static void main(String[] args) {
	    Animal cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.dormir();

        Animal gato = new Gato();
        gato.emitirSom();
        gato.dormir();
    }
};


