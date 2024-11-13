package br.com.exemplo.bridge2;

import br.com.exemplo.bridge2.empregado.Analista;
import br.com.exemplo.bridge2.empregado.Empregado;
import br.com.exemplo.bridge2.empregado.GerenteDeProjetos;
import br.com.exemplo.bridge2.empregado.Secretaria;

import br.com.exemplo.bridge2.formato.CSVFormatter;
import br.com.exemplo.bridge2.formato.EmpregadoConvertor;
import br.com.exemplo.bridge2.formato.Formatter;
import br.com.exemplo.bridge2.formato.JSONFormatter;

public class MainTeste {
	public static void main(String[] args) {


        Formatter csvFormatter = new CSVFormatter();
        Formatter jsonFormatter = new JSONFormatter();
        
        EmpregadoConvertor csvEmployeeFormatter = new EmpregadoConvertor(csvFormatter);
        EmpregadoConvertor jsonEmployeeFormatter = new EmpregadoConvertor(jsonFormatter);
        
        
        
		Empregado empregado01 = new GerenteDeProjetos("Loester",31,15000.0);
		Empregado empregado02 = new Secretaria("Maria",31,4000.0);
		Empregado empregado03 = new Analista("Jose",31,4000.0);
		


        System.out.println("CSV Format:");
        System.out.println(csvEmployeeFormatter.format(empregado01));
        System.out.println(csvEmployeeFormatter.format(empregado02));
        System.out.println(csvEmployeeFormatter.format(empregado03));

        System.out.println("\nJSON Format:");
        System.out.println(jsonEmployeeFormatter.format(empregado01));
        System.out.println(jsonEmployeeFormatter.format(empregado02));
        System.out.println(jsonEmployeeFormatter.format(empregado03));
		
	}
}
