package br.com.exemplo.factory.contabil;

import br.com.exemplo.factory.contabil.factory.DocumentoFactory;
import br.com.exemplo.factory.contabil.factory.EmpenhoFactory;
import br.com.exemplo.factory.contabil.factory.LiquidacaoFactory;
import br.com.exemplo.factory.contabil.factory.PagamentoFactory;

public class MainTeste {
	public static void main(String[] args) {
		
		DocumentoFactory empenho = new EmpenhoFactory();
		empenho.contabilizar();
		
		DocumentoFactory liquidacao = new LiquidacaoFactory();
		liquidacao.contabilizar();
		
		DocumentoFactory pagamento = new PagamentoFactory();
		pagamento.contabilizar();
		
	}
}
