package meuprojeto;

public class Exercicio4 {
	public static void main(String[] args) {
		int fat = 1;
		for(int i = 1; i <= 10; i++){
			while(i >= 2){
				fat = fat * i;
				break;
			}
			System.out.println(fat);
		}
	}
}
