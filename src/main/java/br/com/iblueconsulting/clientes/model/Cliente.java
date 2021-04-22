package br.com.iblueconsulting.clientes.model;

import java.util.Objects;

public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    
    public Cliente() {}

    public Cliente(Long id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
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

	@Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.cpf);
        return hash;
    }


    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente{id=").append(id).append(", nome=")
                .append(nome).append(", cpf=")
                .append(cpf).append("}");
        
        return builder.toString();
    }


}