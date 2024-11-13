package br.com.exemplo.bridge3;

public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}