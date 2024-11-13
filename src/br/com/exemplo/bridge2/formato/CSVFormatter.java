package br.com.exemplo.bridge2.formato;

import br.com.exemplo.bridge2.empregado.Empregado;

public class CSVFormatter implements Formatter {
    @Override
    public String format(Empregado empregado) {
        return empregado.getNome() + "," + empregado.getIdade() + "," + empregado.getSalario();
    }
}
