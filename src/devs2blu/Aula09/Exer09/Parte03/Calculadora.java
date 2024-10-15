package devs2blu.Aula09.Exer09.Parte03;

public class Calculadora {

	private Double a = 0.0;
	private Double b = 0.0;
	private Double result = 0.0;

	Calculadora() {
	}
	
	public Double calcular(Double a, Double b) {
		try {

			this.a = a;
			this.b = b;
			
			return this.a + this.b;
			
		} catch (Exception e) {
			System.out.printf("%s \n", e);
		}
		
		return 0.0;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", result=" + result + "]";
	}
	
	
	
	
}
