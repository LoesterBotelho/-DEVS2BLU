package diome.java.basico.aula03.poo;

public class Color {

	private String name;

	public Color() {

	}

	public Color(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}

}
