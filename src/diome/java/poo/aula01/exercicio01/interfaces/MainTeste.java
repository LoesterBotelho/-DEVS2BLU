package diome.java.poo.aula01.exercicio01.interfaces;

public class MainTeste {
	public static void main(String[] args) {
		
		// FOI IMPLEMENTANDO POO : ENCAPSULAMENTO
		// FOI IMPLEMENTANDO POO : HERANÇA
		
		// FOI IMPLEMENTANDO POO : ABSTRAÇÃO
		// FOI IMPLEMENTANDO POO : POLIFORMISMO
		// FOI IMPLEMENTANDO POO : INTERFACE

		
		
		Messager msgMSN = new MSNMessager();		
		msgMSN.receberMensagem();
		msgMSN.enviarMensagem();
	
		Messager msgInstagram = new InstagramMessager();		
		msgInstagram.receberMensagem();
		msgInstagram.enviarMensagem();
		
		Messager msgTelegram = new TelegramMessager();		
		msgTelegram.receberMensagem();
		msgTelegram.enviarMensagem();
		
		Messager msgYahoo = new YahooMessager();		
		msgYahoo.receberMensagem();
		msgYahoo.enviarMensagem();
		
		
	}
}
