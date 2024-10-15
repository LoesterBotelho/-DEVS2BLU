package devs2blu.Aula09.Exer09.Parte01;

public class Exercicio01 {

	public static void main(String[] args) {
					
		Contato contatoLoester = new Contato("Loester", "loester@localhost.com","(47) 99189-9946");
		Contato contatoMaria = new Contato("Maria", "Maria@localhost.com","(47) 98888-9946");
		Contato contatoJose = new Contato("Jose", "Jose@localhost.com","(47) 97777-9946");
		
		Contato[] listaContato = {contatoLoester, contatoMaria, contatoJose};
		
		Agenda agenda = new Agenda("Agenda Pessoal", listaContato);		
		
		System.out.printf("%s \n", agenda.getListaContato().length);
		
		System.out.printf("%s \n\n", agenda.toString());

		//for each
		for ( var item : agenda.getListaContato() ) {
			System.out.printf( "%s \n", item.toString() );
		}

	}

}
