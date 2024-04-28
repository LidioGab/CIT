
import java.util.Scanner;	
public class Projeto1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numShow, qtdIngre, tpIngre, maxMeia, ingreMeia = 0 ,openbar ;
		double vlIngre,calc,total;
		String 	local, nomeShow, openbarRecibo;
		System.out.println("**************************************\n");
		System.out.println("1. Pancada e amigos");
		System.out.println("2. Xandeco e compania");
		System.out.println("3. bald o careca");
		System.out.println("4. donald trump e o coreano lá");
		System.out.println("5. chama na minha papai\n");
		System.out.println("**************************************\n");
		
		System.out.println("Informe o numero do show selecionado:");
		numShow = sc.nextInt();
		
		if(numShow < 1 || numShow > 5){
			System.err.println("DADOS INVALIDOS!");
			System.exit(0);
		}
		
		switch(numShow) {
		case 1 -> nomeShow = "Pancada e amigos";
		case 2 -> nomeShow = "Xandeco e compania";
		case 3 -> nomeShow = "bald o careca";
		case 4 -> nomeShow = "donald trump e o coreano lá";
		default -> nomeShow = "chama na minha papai";
		}
		
		System.out.println("Informe a quantidade de ingressos(MAXIMO PERMITIDO: 6)");
		qtdIngre = sc.nextInt();
		
		maxMeia = qtdIngre / 2;
		
		if( qtdIngre < 1 || qtdIngre > 6) {
			System.err.println("DADOS INVALIDOS!");
			System.exit(0);
		}
		
		System.out.println("selecione o tipo de ingresso:");
		System.out.println("1. Pista R$40,00\n2. Pista VIP R$ 50,00\n3. Camarote R$100,00");
		tpIngre = sc.nextInt();
		
		if(tpIngre < 1 || tpIngre > 3) {
			System.err.println("DADOS INVALIDOS!");
			System.exit(0);
		}
		
		switch(tpIngre) {
		case 1 -> vlIngre = 40; 
		case 2 -> vlIngre = 50;
		default -> vlIngre = 100;
		}
		
		switch(tpIngre) {
		case 1 -> local = "Pista";
		case 2  -> local = "Pista VIP";
		default -> local = "Camarote";
		}
		
		System.out.printf("selecione a quantidade de meias entradas(MAXIMO PERMITIDO: %d)\n", maxMeia);	
		
		if(maxMeia == 0) {
			System.out.println("Não é possivel enserir ingressos do tipo meia no seu pedido");
		}
		
		else if(maxMeia >= 1 && maxMeia <= 3) {
			ingreMeia = sc.nextInt();
		}
		
		if(ingreMeia > maxMeia) {
			System.err.println("DADOS INVALIDOS!");
			System.exit(0);
		}
		
		calc = vlIngre * qtdIngre - ((vlIngre / 2) * maxMeia); 
		
		System.out.println("Deseja openbar?\n1.Sim\n2.Não");
		openbar = sc.nextInt();
		
		if(openbar <= 0 || openbar > 2) {
			System.err.println("DADOS INVALIDOS!");
			System.exit(0);
		}
		
		total = openbar == 1 ? calc * 2  : calc * 1;
		
		openbarRecibo = openbar == 1 ? "Sim" : "Não" ;
		
		System.out.printf("Show escolhido: %s\nLocalização escolhida: %s\nOpenbar: %s\nValor total: R$ %.2f", nomeShow, local, openbarRecibo, total);
		
		sc.close();
	}

}