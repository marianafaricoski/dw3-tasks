package meuprojeto;

public class Exercicio6 {
	public static void main(String[] args) {
		int n = 0;
		int n2 = 1;
		
		for(int i = 1; n2 <= 100; i++){
			if(i != 1){
			n += n2;
			n2 = n + n2;}
			else{
				n = 1;
				n2 = 0;
			}
		}
		System.out.println(n2);
	}
}

