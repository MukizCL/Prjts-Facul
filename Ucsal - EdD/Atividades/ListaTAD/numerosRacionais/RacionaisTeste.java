package numerosRacionais;

import java.io.ObjectInputStream.GetField;

public class RacionaisTeste {

	public static void main(String[] args) {

		Racionais rac = new Racionais(9);
		
		rac.somar(9);
		rac.resultado();
		
		rac.igualdade(17);
		rac.multiplicar(2);
		rac.igualdade(36);

	}

}
