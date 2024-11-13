package br.com.exemplo.bridge2.formato;

import br.com.exemplo.bridge2.empregado.Empregado;

public class JSONFormatter implements Formatter {
    @Override
    public String format(Empregado empregado) {
        return "{ \"name\": \"" + empregado.getNome() + "\", \"age\": " + empregado.getIdade() + ", \"salary\": " + empregado.getSalario() + " }";
    }
}