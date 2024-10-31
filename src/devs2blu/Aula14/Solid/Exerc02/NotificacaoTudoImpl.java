package devs2blu.Aula14.Solid.Exerc02;

class NotificacaoTudoImpl implements NotificacaoPush, NotificacaoEmail, NotificacaoSMS {
	public void enviarPushNotification() {
		System.out.println("Enviando notificaçãoo por Push.");
	}

	public void enviarSMS() {
		System.out.println("Enviando notificaçãoo por SMS.");

	}

	public void enviarEmail() {
		System.out.println("Enviando notificaçãoo por EMAIL.");
	}

}
