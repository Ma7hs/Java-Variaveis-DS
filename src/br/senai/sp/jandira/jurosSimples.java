package br.senai.sp.jandira;
import java.util.Scanner;;

public class jurosSimples {

	public static void main(String[] args) {
		
		Scanner infoUsuario = new Scanner(System.in);
		
		double juros, capital, taxa, tempo;
		
		System.out.println("Qual o valor do sue produto?");
		capital = infoUsuario.nextDouble();
		
		System.out.println("A taxa de juros ir� ser de quantos % ao m�s ou ao ano?");
		taxa = infoUsuario.nextDouble();
		
		System.out.println("Por quanto tempo voc� ir� pagar suas parcelas?");
		tempo =  infoUsuario.nextDouble();
		
		double capitalDivido, taxaPorcento, acrescimo, total, parcelasFinais;
		
		 capitalDivido = capital/tempo;
		 taxaPorcento = taxa/100;
		 acrescimo = taxaPorcento*capitalDivido;
		 total = capitalDivido + acrescimo;
		 parcelasFinais = capital+total;
		
		
		System.out.printf("Dessa forma, teremos um acr�scimo de R$%s ao m�s, ou seja cada presta��o ser� de R$%s %n %.2f", capitalDivido,total);
		System.out.printf("Logo, o valor das uas parcelas finais ser� de %s ", parcelasFinais);
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
