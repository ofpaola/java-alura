
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		if(idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}
		if(quantidadePessoas >=2) {
			System.out.println("voc� n�o tem 18, mas pode entrar, pois esta acompanhado");
		}
		else 
			System.out.println("infelizmente voc� n�o pode entrar");
	}
}
