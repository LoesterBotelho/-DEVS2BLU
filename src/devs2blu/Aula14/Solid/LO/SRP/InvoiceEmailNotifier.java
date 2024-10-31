package devs2blu.Aula14.Solid.LO.SRP;

public class InvoiceEmailNotifier {
	public void sendEmail(Invoice invoice) {
		System.out.println("Enviando email para fatura de valor: " + invoice.getAmount());
	}
}