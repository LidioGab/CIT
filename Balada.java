package CIT;
import java.util.*;

import javax.swing.JOptionPane;	

public class Projeto1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numShow, qtdIngre, tpIngre , maxMeia, ingreMeia = 0,openbar, divisor = 0;
		double vlIngre,calc,total;
		String recibo;
		
		String 	local, nomeShow, openbarRecibo;
		System.out.println("**************************************\n");
		System.out.println("1. Nirvana");
		System.out.println("2. Michel telo");
		System.out.println("3. AC/DC");
		System.out.println("4. Taylor swift");
		System.out.println("5. Matuê\n");
		System.out.println("**************************************\n");
		
		System.out.println("Informe o numero do show selecionado\nOu digite 0 para cancelar a compra");
		
		do{
			try {
				numShow = sc.nextInt();
				
				switch(numShow) {
				case 1 -> nomeShow = "Nirvana";
				case 2 -> nomeShow = "Michel telo";
				case 3 -> nomeShow = "AC/DC";
				case 4 -> nomeShow = "Taylor swift";
				default -> nomeShow = "Matuê";
				}
				
				if(numShow < 0 || numShow > 5){
					System.err.println("NUMERO INCORRETO, insira o numero novamente");
				}
				
				else if(numShow == 0) {
					System.err.println("Compra cancelada!");
					System.exit(0);
				}
				
				else {
					break;
				}							
			}		
			catch(InputMismatchException e) {
				System.err.println("Insira um numero");
				sc.next();
			}
			
		}while(true);
		
		System.out.println("Informe a quantidade de ingressos(MAXIMO PERMITIDO: 6)\nPara cancelar a compra digite 0");
	
		do {
			try {
				qtdIngre = sc.nextInt();
				if(qtdIngre < 0 || qtdIngre > 6){
					System.err.println("QUANTIDADE DE INGRESSOS INVALIDAS!!\nInsira novamente");
				}
				
				else if(qtdIngre == 0) {
					System.out.println("Compra cancelada!");
					System.exit(0);
				}
				else {
					break;
				}
			}catch(InputMismatchException e) {
				System.err.println("Insira um numero");
				sc.next();
			}
			
		}while(true);
		
		maxMeia = qtdIngre / 2;
		
		System.out.println("selecione o tipo de ingresso:");
		System.out.println("1. Pista R$40,00\n2. Pista VIP R$ 50,00\n3. Camarote R$100,00\n0. Cancelar compra");
		
		do{
			try {
				tpIngre = sc.nextInt();
				
				switch(tpIngre) {
				case 1 -> {vlIngre = 40; local = "Pista";}
				case 2 -> {vlIngre = 50; local = "Pista VIP";}
				default -> {vlIngre = 100; local = "Camarote";}
				}
				
				if(tpIngre < 0 || tpIngre > 3) {
					System.err.println("TIPO DE INGRESSO INVALIDO! Insira-os novamente");
				}
				else if(tpIngre == 0) {
					System.err.println("Compra cancelada!");
					System.exit(0);
				}
				else {
					break;
				}
			}
			
			catch(InputMismatchException e) {
				System.out.println("Insira um numero");
				sc.next();
			}
			
		}while(true);
		
		
		if(maxMeia == 0) {
			System.out.println("Não é possivel enserir ingressos do tipo meia no seu pedido");
		}
		
		else if(maxMeia >= 1 && maxMeia <= 4) {
			System.out.printf("selecione a quantidade de meias entradas(MAXIMO PERMITIDO: %d)\nOu digite 4 para cancelar a compra\n", maxMeia);	
			do {
				try {
					ingreMeia = sc.nextInt();
					
					if(ingreMeia < 0 || ingreMeia > 3) {
						System.err.println("quantidade invalida insira o numero novamente!");
					}
					
					else if(ingreMeia == 4) {
						System.out.println("Compra cancelada!");
						System.exit(0);
					}
					else {
						break;
					}					
				}catch(InputMismatchException e) {
					System.err.println("Insira um numero");
					sc.next();
				}
			}while(true);
		}
		
		divisor = ingreMeia != 0 ? (int)(vlIngre / 2) * maxMeia : 0;
		
		calc = vlIngre * qtdIngre - divisor; 
			
		System.out.println("Deseja openbar?\n1.Sim\n2.Não\n0. Cancelar compra");
		
		
		do {
			try {
				openbar = sc.nextInt();
				
				if(openbar < 1 || openbar > 2) {
					System.err.println("Opção invalida! Insira o numero novamente");
				}
				
				else if(openbar == 0) {
					System.out.println("Compra cancelada!");
				}
				else {
					total = openbar == 1 ? calc * 2  : calc * 1;
					
					openbarRecibo = openbar == 1 ? "Sim" : "Não" ;
					
					break;
				}
			}catch(InputMismatchException e) {
				System.err.println("Insira um numero");
				sc.next();
			}
		}while(true);
		

		
		 recibo = String.format("Show escolhido: %s\nLocalização escolhida: %s\nOpenbar: %s\nValor total: R$ %.2f", nomeShow, local, openbarRecibo, total);
	     JOptionPane.showMessageDialog(null, recibo, "Recibo", JOptionPane.INFORMATION_MESSAGE);
		sc.close();
	}

}
