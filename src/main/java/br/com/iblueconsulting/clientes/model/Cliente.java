package br.com.iblueconsulting.clientes.model;

import java.util.Objects;

public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String cep;
    private String tipo_logradouro;
    private String lougradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    
    public Cliente() {}
	public Cliente(Long id, String nome, String cpf, String email, String cep, String tipo_logradouro,
			String lougradouro, Integer numero, String complemento, String bairro, String cidade, String estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.cep = cep;
		this.tipo_logradouro = tipo_logradouro;
		this.lougradouro = lougradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTipo_logradouro() {
		return tipo_logradouro;
	}

	public void setTipo_logradouro(String tipo_logradouro) {
		this.tipo_logradouro = tipo_logradouro;
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lougradouro == null) ? 0 : lougradouro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipo_logradouro == null) ? 0 : tipo_logradouro.hashCode());
		return result;
	}
    
	@Override
	public String toString() {
		return "Cliente {id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", cep=" + cep
				+ ", tipo_logradouro=" + tipo_logradouro + ", lougradouro=" + lougradouro + ", numero=" + numero
				+ ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
				+ "}";
	}
	
    
    
    /*
	@Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente{id=").append(id).append(", nome=")
                .append(nome).append(", cpf=")
                .append(cpf).append("}");
        
        return builder.toString();
    }
*/

}