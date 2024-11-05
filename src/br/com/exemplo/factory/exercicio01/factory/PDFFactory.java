package br.com.exemplo.factory.exercicio01.factory;

import br.com.exemplo.factory.exercicio01.model.Documento;
import br.com.exemplo.factory.exercicio01.model.PDF;

public class PDFFactory extends DocumentoFactory{

	@Override
	public Documento createDocumento() {
		return new PDF();
	}

}
