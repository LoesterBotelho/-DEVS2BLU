package devs2blu.Aula09.Exerc09nv2.lo.Fruit;

class Apple implements Fruit {
	@Override
	public Apple getFruit() {
		return new Apple();
	}

	@Override
	public void mostrar() {
		System.out.println("apple");
	}
	
	
}