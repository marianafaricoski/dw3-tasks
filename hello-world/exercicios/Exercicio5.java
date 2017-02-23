package meuprojeto;

public class Exercicio5 {
	public static void main(String[] args) {
		int fat = 1;
		for(int i = 1; i <= 40; i++){
			while(i >= 2){
				fat = fat * i;
				break;
			}
			System.out.println(fat);
		}
	}
	// Essa demora ocorre porque são muitos cálculos feitos pelo computador, o que acaba levando uma
	// grande quantidade de tempo para ser resolvido.
}
