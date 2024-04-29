import java.util.*;	
public class Ex2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numShow = 0, qtdIngre = 0, tpIngre = 0, maxMeia, ingreMeia = 0 ,openbar = 0;
		double vlIngre,calc,total;
		String 	local, nomeShow, openbarRecibo;
		System.out.println("**************************************\n");
		System.out.println("1. Nirvana");
		System.out.println("2. Michel telo");
		System.out.println("3. AC/DC");
		System.out.println("4. Taylor swift");
		System.out.println("5. Matuê\n");
		System.out.println("**************************************\n");
		
		System.out.println("Informe o numero do show selecionado\nOu digite 0 para cancelar a compra");
		
		while(numShow < 1 || numShow > 5) {
			numShow = sc.nextInt();
			
			if(numShow < 0 || numShow > 5){
				System.err.println("NUMERO INCORRETO, insira o numero novamente");
			}
			
			if(numShow == 0) {
				System.out.println("Compra cancelada!");
				System.exit(0);
			}
		}
		
		switch(numShow) {
		case 1 -> nomeShow = "Nirvana";
		case 2 -> nomeShow = "Michel telo";
		case 3 -> nomeShow = "AC/DC";
		case 4 -> nomeShow = "Taylor swift";
		default -> nomeShow = "Matuê";
		}
		
		System.out.println("Informe a quantidade de ingressos(MAXIMO PERMITIDO: 6)\nPara cancelar a compra digite 0");
	
		while(qtdIngre < 1|| qtdIngre > 6 ) {
			qtdIngre = sc.nextInt();
			if(qtdIngre < 0 || qtdIngre > 6){
				System.err.println("QUANTIDADE DE INGRESSOS INVALIDAS!!\nInsira novamente");
			}
			
			if(qtdIngre == 0) {
				System.out.println("Compra cancelada!");
				System.exit(0);
			}
		}
		
		maxMeia = qtdIngre / 2;
		
		System.out.println("selecione o tipo de ingresso:");
		System.out.println("1. Pista R$40,00\n2. Pista VIP R$ 50,00\n3. Camarote R$100,00\n0. Cancelar compra");
		
		while(tpIngre < 1 || tpIngre > 3) {
			tpIngre = sc.nextInt();
			if(tpIngre < 0 || tpIngre > 3) {
				System.err.println("TIPO DE INGRESSO INVALIDO! Insira-os novamente");
			}
			
			if(tpIngre == 0) {
				System.out.println("Compra cancelada!");
				System.exit(0);
			}
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
		
		if(maxMeia == 0) {
			System.out.println("Não é possivel enserir ingressos do tipo meia no seu pedido");
		}
		
		else if(maxMeia >= 1 && maxMeia <= 4) {
			System.out.printf("selecione a quantidade de meias entradas(MAXIMO PERMITIDO: %d)\nOu digite 0 para cancelar a compra\n", maxMeia);	
			while(ingreMeia < 1 || ingreMeia > 3) {
				ingreMeia = sc.nextInt();
				
				if(ingreMeia < 1 || ingreMeia > 3) {
					System.err.println("quantidade invalida insira o numero novamente!");
				}
				
				if(ingreMeia == 0) {
					System.out.println("Compra cancelada!");
					System.exit(0);
				}
			}
		}
		
		calc = vlIngre * qtdIngre - ((vlIngre / 2) * maxMeia); 
		
		System.out.println("Deseja openbar?\n1.Sim\n2.Não\n0. Cancelar compra");
		
		
		while(openbar < 1 || openbar > 2) {
			openbar = sc.nextInt();
			
			if(openbar < 1 || openbar > 2) {
				System.err.println("Opção invalida! Insira o numero novamente");
			}
			
			if(openbar == 0) {
				System.out.println("Compra cancelada!");
			}
		}
		
		total = openbar == 1 ? calc * 2  : calc * 1;
		
		openbarRecibo = openbar == 1 ? "Sim" : "Não" ;
		
		System.out.printf("Show escolhido: %s\nLocalização escolhida: %s\nOpenbar: %s\nValor total: R$ %.2f", nomeShow, local, openbarRecibo, total);
		
		sc.close();
	}

}
