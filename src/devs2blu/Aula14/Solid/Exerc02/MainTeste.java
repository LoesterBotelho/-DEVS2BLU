package devs2blu.Aula14.Solid.Exerc02;

public class MainTeste {
	public static void main(String[] args) {

		NotificacaoEmail email = new NotificacaoEmailImpl();
		email.enviarEmail();
		
		
		System.out.println("");
		
		
		NotificacaoSMS sms = new NotificacaoSMSImpl();
		sms.enviarSMS();
		
		
		System.out.println("");
		
		
		NotificacaoPush push = new NotificacaoPushImpl();
		push.enviarPushNotification();
		
		
		System.out.println("");
		
		
		NotificacaoTudoImpl notificaTudo = new NotificacaoTudoImpl();
		notificaTudo.enviarSMS();
		notificaTudo.enviarEmail();
		notificaTudo.enviarPushNotification();
		

				
				
				
	}
}
