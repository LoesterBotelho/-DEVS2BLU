package br.com.exemplo.bridge2.formato;

import br.com.exemplo.bridge2.empregado.Empregado;

public class EmpregadoConvertor {
    private Formatter formatter;

    public EmpregadoConvertor(Formatter formatter) {
        this.formatter = formatter;
    }

    public String format(Empregado empregado) {
        return formatter.format(empregado);
    }
}
