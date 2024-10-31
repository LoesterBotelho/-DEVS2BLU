package devs2blu.Aula14.Solid.LO.SRP;

public class Main {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(100.0);
		
		InvoiceEmailNotifier invoiceEmailNotifier = new InvoiceEmailNotifier();
		
		invoiceEmailNotifier.sendEmail(invoice);
		
	}
	
}
