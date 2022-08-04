package br.senai.sp.jandira;
import java.util.Scanner;;

public class jurosSimples {

	public static void main(String[] args) {
		
		Scanner infoUsuario = new Scanner(System.in);
		
		double juros, capital, taxa, tempo;
		
		System.out.println("Qual o valor do sue produto?");
		capital = infoUsuario.nextDouble();
		
		System.out.println("A taxa de juros irá ser de quantos % ao mês ou ao ano?");
		taxa = infoUsuario.nextDouble();
		
		System.out.println("Por quanto tempo você irá pagar suas parcelas?");
		tempo =  infoUsuario.nextDouble();
		
		double capitalDivido, taxaPorcento, acrescimo, total, parcelasFinais;
		
		 capitalDivido = capital/tempo;
		 taxaPorcento = taxa/100;
		 acrescimo = taxaPorcento*capitalDivido;
		 total = capitalDivido + acrescimo;
		 parcelasFinais = capital+total;
		
		
		System.out.printf("Dessa forma, teremos um acréscimo de R$%s ao mês, ou seja cada prestação será de R$%s %n %.2f", capitalDivido,total);
		System.out.printf("Logo, o valor das uas parcelas finais será de %s ", parcelasFinais);
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
