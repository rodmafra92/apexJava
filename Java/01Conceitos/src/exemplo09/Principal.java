package exemplo09;

public class Principal {

	public static void main(String[] args) {

		//Indice
		int indice = 1;
		
		//La�o
		while(indice < 11) {
			
			if(indice%2 ==0) {
			System.out.println(indice + " � par.");
			}else {
				System.out.println(indice + " � impar.");
			}
			indice++;
		}

	}

}
