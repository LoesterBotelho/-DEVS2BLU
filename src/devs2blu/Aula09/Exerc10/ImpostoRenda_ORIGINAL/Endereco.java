/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Endereco extends EnderecoAbstrato{
	private Integer id;
	private Integer idCliente;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {    	
    }
    
    public Endereco(Integer id, Integer idCliente, String logradouro, String numero, String complemento, String bairro,
			String cidade, String estado, String cep) {
		super();
		this.setId(id);
		this.setIdCliente(idCliente);
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setComplemento(complemento);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setBairro(bairro);
		this.setCep(cep);
	}

	public Integer getId() {
		return id;
	}

	public String getIdString() {
		return String.valueOf(id);
	}
	
	public Endereco setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public String getIdClienteString() {
		return String.valueOf(id);
	}
	
	public Endereco setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
		return this;
	}

	public String getLogradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getCidade() {
        return cidade;
    }

    public Endereco setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public Endereco setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

	@Override
	public String toString() {
		
		return String.format("Endereco [id=%s, idCliente=%s, logradouro=%s, numero=%s, complemento=%s, bairro=%s, cidade=%s, estado=%s, cep=%s]"
				, this.getIdString()
				, this.getIdClienteString()
				, this.getLogradouro()
				, this.getNumero()
				, this.getComplemento()
				, this.getBairro()
				, this.getCidade()
				, this.getEstado()
				, this.getCep()				
							);
	}

	@Override
	public void mostrarEndereco() {
		System.out.printf( "%s" , this.toString() );	
	}

	// EXEMPLO DE URL : https://viacep.com.br/ws/88010-002/json/
	  public static Endereco buscarEnderecoPorCep(String cep) {
	        Endereco endereco = new Endereco();
	        String urlString = "https://viacep.com.br/ws/" + cep + "/json/";

	        try {

	            HttpClient client = HttpClient.newHttpClient();

 
	            HttpRequest request = HttpRequest.newBuilder()
	                    .uri(URI.create(urlString))
	                    .GET()
	                    .build();


	            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


	            if (response.statusCode() == 200) {

	                String jsonResponse = response.body();


	                endereco = parseJson(jsonResponse);
	            } else {
	                System.out.println("Erro ao buscar endereço: " + response.statusCode());
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return endereco;
	    }

	  private static Endereco parseJson(String json) {
	      Endereco endereco = new Endereco();

	      json = json.trim().replaceAll("[{}]", "");

	      String[] pairs = json.split(",");

	      for (String pair : pairs) {
	          String[] keyValue = pair.split(":");
	          String key = keyValue[0].trim().replaceAll("\"", ""); 
	          String value = keyValue[1].trim().replaceAll("\"", "");

	          switch (key) {
	          case "logradouro":
	              endereco.setLogradouro(value);
	              break;
	          case "complemento":
	              endereco.setComplemento(value);
	              break;
	          case "bairro":
	              endereco.setBairro(value);
	              break;
	          case "localidade":
	              endereco.setCidade(value);
	              break;
	          case "uf":
	              endereco.setEstado(value);
	              break;
	          case "cep":
	              endereco.setCep(value);
	              break;
	          default:
	        	  // ANALISAR RETORNO
	              // System.out.printf("ERRO NÃO ENCONTRADO : %s" , key);
	              break;
	          	}

	      }

	      return endereco;
	  }
}