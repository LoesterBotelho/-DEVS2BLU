package devs2blu.Aula09.Exerc09nv2.lo.Fruit;


public class Teste {
    public static void main(String[] args) {
        Fruit myFruit = new Apple();
        Fruit returnedFruit = myFruit.getFruit();  
        
        myFruit.mostrar();
        returnedFruit.mostrar();
        // Retorna um objeto do tipo Apple
    }
}
