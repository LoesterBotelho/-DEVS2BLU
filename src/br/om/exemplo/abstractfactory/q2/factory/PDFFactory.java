package br.om.exemplo.abstractfactory.q2.factory;

import br.om.exemplo.abstractfactory.q2.model.Grafico;
import br.om.exemplo.abstractfactory.q2.model.Relatorio;
import br.om.exemplo.abstractfactory.q2.model.concrete.PdfGrafico;
import br.om.exemplo.abstractfactory.q2.model.concrete.PdfRelatorio;

public class PDFFactory implements SimplesFactory {

	@Override
	public Relatorio createRelatorio() {
		return new PdfRelatorio();
	}

	@Override
	public Grafico createGrafico() {
		return new PdfGrafico();
	}

}
