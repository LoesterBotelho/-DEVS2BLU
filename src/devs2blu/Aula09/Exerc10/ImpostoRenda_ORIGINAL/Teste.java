/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static PessoaPF pessoaPF01;
	public static PessoaPF pessoaPF02;
	public static PessoaPF pessoaPF03;
	
	public static Endereco enderecoPF1;
	public static Endereco enderecoPF2;
	public static Endereco enderecoPF3;
	
	public static PessoaPJ pessoaPJ01;
	public static PessoaPJ pessoaPJ02;
	public static PessoaPJ pessoaPJ03;
	
	public static Endereco enderecoPJ1;
	public static Endereco enderecoPJ2;
	public static Endereco enderecoPJ3;
	
	public static Faturamento faturamnetoAnualPF01_2024;
	public static Faturamento faturamnetoAnualPF02_2024;
	public static Faturamento faturamnetoAnualPF03_2024;

	public static Faturamento faturamnetoAnualPJ01_2024;
	public static Faturamento faturamnetoAnualPJ02_2024;
	public static Faturamento faturamnetoAnualPJ03_2024;
            
	public static Faturamento2 faturamnetoAnualPF01_2024_V2;
	public static Faturamento2 faturamnetoAnualPF02_2024_V2;
	public static Faturamento2 faturamnetoAnualPF03_2024_V2;

	public static Faturamento2 faturamnetoAnualPJ01_2024_V2;
	public static Faturamento2 faturamnetoAnualPJ02_2024_V2;
	public static Faturamento2 faturamnetoAnualPJ03_2024_V2;
	
	public static ImpostoPF impostoPF01;
	public static ImpostoPF impostoPF02;
	public static ImpostoPF impostoPF03;

	public static ImpostoPJ impostoPJ01;
	public static ImpostoPJ impostoPJ02;
	public static ImpostoPJ impostoPJ03;  
	
	public static ImpostoPF impostoPF01_V2;
	public static ImpostoPF impostoPF02_V2;
	public static ImpostoPF impostoPF03_V2;

	public static ImpostoPJ impostoPJ01_V2;
	public static ImpostoPJ impostoPJ02_V2;
	public static ImpostoPJ impostoPJ03_V2;  
	
	public static Aliquota aliquota_00;
	public static Aliquota aliquota_10;
	public static Aliquota aliquota_15;
	public static Aliquota aliquota_25;
	public static Aliquota aliquota_30;
	
	// LIST
	public static List<Aliquota> listaAliquotaPF;
	
    // CONSTANTES
	public static final Double VALOR_MAXIMO = 1.79769E+308;
	public static final Double IMPOSTO_PESSOA_JURIDICA = 0.1; /*** (10/100) = 0.1 = 10% ***/
	
	public static void main(String[] args) {
		
		imprimirAutor();
		 	

		
        // PESSOA FÍSICA
        preencherAliquotasPF();
        
        preencherPF();
        mostrarInformacoesPessoaPF(true);
        
        preencherFaturamentoV1PF();
        mostrarFaturamentoV1PF(true);
        
        preencherFaturamentoV2PF();
        mostrarFaturamentoV2PF(true);
        
        preencherImpostoPFV1();
        mostrarImpostoPFV1(true);
        
        preencherImpostoPFV2();
        mostrarImpostoPFV2(true);
        
        calcularImpostoPFV1();
        
        calcularImpostoPFV2();
        
        
        
        
        // PESSOA JURÍDICA
        preencherPJ();
        mostrarInformacoesPessoaPJ(true);
        
        preencherFaturamentoV1PJ();
        mostrarFaturamentoV1PJ(true);
        
        preencherFaturamentoV2PJ();
        mostrarFaturamentoV2PJ(true);
        
        preencherImpostoPJV1();
        mostrarImpostoPJV1(true);
        
        preencherImpostoPJV2();
        mostrarImpostoPJV2(true);
        
        calcularImpostoPJV1();
        
        calcularImpostoPJV2();   
        


        
	}
	
	public static void mostrarImpostoPFV1(Boolean exibirPrints) {		
		if (exibirPrints) {
	        impostoPF01.mostrarImpostoV1();
	        impostoPF02.mostrarImpostoV1();
	        impostoPF03.mostrarImpostoV1();     
	        System.out.printf("\n");
		}		
	}

	public static void mostrarImpostoPFV2(Boolean exibirPrints) {
		if (exibirPrints) {
	        impostoPF01_V2.mostrarImpostoV2();
	        impostoPF02_V2.mostrarImpostoV2();
	        impostoPF03_V2.mostrarImpostoV2();   
	        System.out.printf("\n");
		}			
	}
	
	public static void mostrarImpostoPJV1(Boolean exibirPrints) {
		if (exibirPrints) {
	        impostoPJ01.mostrarImpostoV1();
	        impostoPJ02.mostrarImpostoV1();
	        impostoPJ03.mostrarImpostoV1();     
	        System.out.printf("\n");
		}		
	}
	
	public static void mostrarImpostoPJV2(Boolean exibirPrints) {
		if (exibirPrints) {
	        impostoPJ01_V2.mostrarImpostoV2();
	        impostoPJ02_V2.mostrarImpostoV2();
	        impostoPJ03_V2.mostrarImpostoV2();   
	        System.out.printf("\n");
		}		
	}
	
	public static void preencherImpostoPFV1() {
       impostoPF01 = new ImpostoPF(pessoaPF01, listaAliquotaPF, faturamnetoAnualPF01_2024);
       impostoPF02 = new ImpostoPF(pessoaPF02, listaAliquotaPF, faturamnetoAnualPF02_2024);
       impostoPF03 = new ImpostoPF(pessoaPF03, listaAliquotaPF, faturamnetoAnualPF03_2024);		
	}
	
	public static void preencherImpostoPFV2() {
       impostoPF01_V2 = new ImpostoPF( pessoaPF01, listaAliquotaPF, faturamnetoAnualPF01_2024_V2.getMeses() );
       impostoPF02_V2 = new ImpostoPF( pessoaPF02, listaAliquotaPF, faturamnetoAnualPF02_2024_V2.getMeses() );
       impostoPF03_V2 = new ImpostoPF( pessoaPF03, listaAliquotaPF, faturamnetoAnualPF03_2024_V2.getMeses() );		
	}
	
	public static void calcularImpostoPFV1() {
        impostoPF01.calcularImpostoV1();
        impostoPF02.calcularImpostoV1();
        impostoPF03.calcularImpostoV1();
        System.out.printf("\n");
	}
	
	public static void calcularImpostoPFV2() {
        impostoPF01_V2.calcularImpostoV2();
        impostoPF02_V2.calcularImpostoV2();
        impostoPF03_V2.calcularImpostoV2();	
        System.out.printf("\n");
	}
	
	public static void preencherImpostoPJV1() {
       impostoPJ01 = new ImpostoPJ(pessoaPJ01, IMPOSTO_PESSOA_JURIDICA, faturamnetoAnualPJ01_2024);
       impostoPJ02 = new ImpostoPJ(pessoaPJ02, IMPOSTO_PESSOA_JURIDICA, faturamnetoAnualPJ02_2024);
       impostoPJ03 = new ImpostoPJ(pessoaPJ03, IMPOSTO_PESSOA_JURIDICA, faturamnetoAnualPJ03_2024);      		        
	}
	
	public static void preencherImpostoPJV2() {
       impostoPJ01_V2 = new ImpostoPJ( pessoaPJ01, IMPOSTO_PESSOA_JURIDICA, faturamnetoAnualPJ01_2024_V2.getMeses() );
       impostoPJ02_V2 = new ImpostoPJ( pessoaPJ02, IMPOSTO_PESSOA_JURIDICA, faturamnetoAnualPJ02_2024_V2.getMeses() );
       impostoPJ03_V2 = new ImpostoPJ( pessoaPJ03, IMPOSTO_PESSOA_JURIDICA, faturamnetoAnualPJ03_2024_V2.getMeses() );			
	}
	
	public static void calcularImpostoPJV1() {
        impostoPJ01.calcularImpostoV1();
        impostoPJ02.calcularImpostoV1();
        impostoPJ03.calcularImpostoV1();  
        System.out.printf("\n");
	}
	
	public static void calcularImpostoPJV2() {
        impostoPJ01_V2.calcularImpostoV2();
        impostoPJ02_V2.calcularImpostoV2();
        impostoPJ03_V2.calcularImpostoV2();	
        System.out.printf("\n");
	}
	
	public static void preencherFaturamentoV1PF() {
        faturamnetoAnualPF01_2024 = new Faturamento(1400.0, 1400.0, 1400.0, 1400.0, 1400.0, 1400.0, 1400.0, 1400.0, 1400.0, 1400.0 , 1400.0, 1400.0);
        faturamnetoAnualPF02_2024 = new Faturamento(2100.0, 2100.0, 2100.0, 2100.0, 2100.0, 2100.0, 2100.0, 2100.0, 2100.0, 2100.0 , 2100.0, 2100.0);
        faturamnetoAnualPF03_2024 = new Faturamento(3600.0, 3600.0, 3600.0, 3600.0, 3600.0, 3600.0, 3600.0, 3600.0, 3600.0, 3600.0 , 3600.0, 3600.0);        	
	}
    
	public static void preencherFaturamentoV2PF() {
        faturamnetoAnualPF01_2024_V2 = new Faturamento2();      
        for (var i=0 ; i < 12 ; i++){
        	faturamnetoAnualPF01_2024_V2.setMes(i+1, 1400.0);	
        }
        
        faturamnetoAnualPF02_2024_V2 = new Faturamento2();      
        for (var i=0 ; i < 12 ; i++){
        	faturamnetoAnualPF02_2024_V2.setMes(i+1, 2100.0);	
        }
        
        faturamnetoAnualPF03_2024_V2 = new Faturamento2();      
        for (var i=0 ; i < 12 ; i++){
        	faturamnetoAnualPF03_2024_V2.setMes(i+1, 3600.0);	
        }		
	}
	
	public static void preencherFaturamentoV1PJ() {
        faturamnetoAnualPJ01_2024 = new Faturamento(14000.0, 14000.0, 14000.0, 14000.0, 14000.0, 14000.0, 14000.0, 14000.0, 14000.0, 14000.0 , 14000.0, 14000.0);
        faturamnetoAnualPJ02_2024 = new Faturamento(21000.0, 21000.0, 21000.0, 21000.0, 21000.0, 21000.0, 21000.0, 21000.0, 21000.0, 21000.0 , 21000.0, 21000.0);
        faturamnetoAnualPJ03_2024 = new Faturamento(36000.0, 36000.0, 36000.0, 36000.0, 36000.0, 36000.0, 36000.0, 36000.0, 36000.0, 36000.0 , 36000.0, 36000.0);           	
	}
    
	public static void preencherFaturamentoV2PJ() {
        faturamnetoAnualPJ01_2024_V2 = new Faturamento2();      
        for (var i=0 ; i < 12 ; i++){
        	faturamnetoAnualPJ01_2024_V2.setMes(i+1, 14000.0);	
        }
        
        faturamnetoAnualPJ02_2024_V2 = new Faturamento2();      
        for (var i=0 ; i < 12 ; i++){
        	faturamnetoAnualPJ02_2024_V2.setMes(i+1, 21000.0);	
        }
        
        faturamnetoAnualPJ03_2024_V2 = new Faturamento2();      
        for (var i=0 ; i < 12 ; i++){
        	faturamnetoAnualPJ03_2024_V2.setMes(i+1, 36000.0);	
        }			
	}
	
	public static void preencherPJ() {
        enderecoPJ1 = Endereco.buscarEnderecoPorCep("89015-203")
        		.setNumero("400")
        		.setComplemento("COWORKING")
				.setId(4)
				.setIdCliente(4);
        
        pessoaPJ01 = new PessoaPJ(4L, "ABC Software", enderecoPJ1, "12.345.678/0001-11", "ABC Software LTDA", "42456789");

        
        
        enderecoPJ2 = Endereco.buscarEnderecoPorCep("89015-202")
        		.setNumero("500")
        		.setComplemento("COWORKING")
				.setId(5)
				.setIdCliente(5);
        
        pessoaPJ02 = new PessoaPJ(5L, "XYZ Software", enderecoPJ2, "23.456.789/0001-22", "XYZ Software LTDA", "5654321");

        
        
        enderecoPJ3 = Endereco.buscarEnderecoPorCep("89012-001")
        		.setNumero("600")
        		.setComplemento("COWORKING")
				.setId(6)
				.setIdCliente(6);
        
        pessoaPJ03 = new PessoaPJ(6L, "Six Software", enderecoPJ3, "34.567.890/0001-33", "XYZ Software LTDA", "8973123");		
	}
	
	public static void preencherPF() {
		enderecoPF1 = Endereco.buscarEnderecoPorCep("89050-000")
				.setNumero("100")
				.setComplemento("APARTAMENTO 100")
				.setId(1)
				.setIdCliente(1);
		
        pessoaPF01 = new PessoaPF(1L, "João Rodrigo da Silva", enderecoPF1, "123.456.789-10", "345.678 SSP/MG", "01/01/1980");

        
        
        enderecoPF2 = Endereco.buscarEnderecoPorCep("89030-000")
        		.setNumero("200")
        		.setComplemento("APARTAMENTO 200")
				.setId(2)
				.setIdCliente(2);
        
        pessoaPF02 = new PessoaPF(2L, "Maria Marta Madalena de Oliveira", enderecoPF2, "987.654.321-00", "765.432 SSP/SC", "02/02/1990");

        
                
        enderecoPF3 = Endereco.buscarEnderecoPorCep("89012-001")
        		.setNumero("300")
        		.setComplemento("APARTAMENTO 300")
				.setId(3)
				.setIdCliente(3);
        
        pessoaPF03 = new PessoaPF(3L, "Carlos Eduardo Lima Costa", enderecoPF3, "456.789.123-45", "456.789 SSP/RS", "03/03/1985");

	}
	
	public static void preencherAliquotasPF() {
		aliquota_00 = new Aliquota(   0.00, 1400.00,       0.00,   0.00);
		aliquota_10 = new Aliquota(1400.01, 2100.00,      10.00, 100.00);
		aliquota_15 = new Aliquota(2100.01, 2800.00,      15.00, 270.00);
		aliquota_25 = new Aliquota(2800.01, 3600.00,      25.00, 500.00);
		aliquota_30 = new Aliquota(3600.01, VALOR_MAXIMO, 30.00, 700.00);

		listaAliquotaPF = new ArrayList<Aliquota>();
		listaAliquotaPF.add(aliquota_00);
		listaAliquotaPF.add(aliquota_10);
		listaAliquotaPF.add(aliquota_15);
		listaAliquotaPF.add(aliquota_25);
		listaAliquotaPF.add(aliquota_30);	
	}
	
	public static void mostrarFaturamentoV2PF(Boolean exibirPrints) {
		if (exibirPrints) {			
			faturamnetoAnualPF01_2024_V2.mostrarFaturamento();
			faturamnetoAnualPF02_2024_V2.mostrarFaturamento();
			faturamnetoAnualPF03_2024_V2.mostrarFaturamento();
			System.out.printf("\n");
			
		}
	}
	
	public static void mostrarFaturamentoV2PJ(Boolean exibirPrints) {
		if (exibirPrints) {			
			faturamnetoAnualPJ01_2024_V2.mostrarFaturamento();
			faturamnetoAnualPJ02_2024_V2.mostrarFaturamento();
			faturamnetoAnualPJ03_2024_V2.mostrarFaturamento();	
			System.out.printf("\n");			
		}
	}
	
	public static void mostrarFaturamentoV1PF(Boolean exibirPrints) {
		
		if (exibirPrints) {

	        faturamnetoAnualPF01_2024.mostrarFaturamento();
	        faturamnetoAnualPF02_2024.mostrarFaturamento();
	        faturamnetoAnualPF03_2024.mostrarFaturamento();			
	        System.out.printf("\n");
	        
		}
	}
	
	public static void mostrarFaturamentoV1PJ(Boolean exibirPrints) {
	
		if (exibirPrints) {	        
	        faturamnetoAnualPJ01_2024.mostrarFaturamento();
	        faturamnetoAnualPJ02_2024.mostrarFaturamento();
	        faturamnetoAnualPJ03_2024.mostrarFaturamento();
	        System.out.printf("\n");
	        
		}
	}
	
	public static void mostrarInformacoesPessoaPF(Boolean exibirPrints) {

		if (exibirPrints) {
	        pessoaPF01.mostrarPessoa();
	        System.out.printf("\n");
	        
	        pessoaPF02.mostrarPessoa();
	        System.out.printf("\n");
	        
	        pessoaPF03.mostrarPessoa();
	        System.out.printf("\n");
		}
	}
	
	public static void mostrarInformacoesPessoaPJ(Boolean exibirPrints) {

		if (exibirPrints) {	        
	        pessoaPJ01.mostrarPessoa();
	        System.out.printf("\n");
	        
	        pessoaPJ02.mostrarPessoa(); 
	        System.out.printf("\n");
	        
	        pessoaPJ03.mostrarPessoa();
	        System.out.printf("\n");
		}
	}
	
	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n\n");
	} 	
	
}
