package com.stefanini.model;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_PERFIL")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "co_seq_perfil")
    private Integer id;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_pessoa_perfil",
            joinColumns = {@JoinColumn(name = "co_seq_perfil")},
            inverseJoinColumns = {@JoinColumn(name = "co_seq_pessoa")}
    )
    
    private Set<Pessoa> pessoa;

    @Column(name = "no_perfil")
    private  String perfil;

    @Column(name = "ds_perfil")
    private  String dsPerfil;

    @Column(name = "dt_hora_inclusao")
    private LocalDate horaInclusao;

    @Column(name = "dt_hora_alteracao")
    private boolean horaAlteracao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getDsPerfil() {
		return dsPerfil;
	}

	public void setDsPerfil(String dsPerfil) {
		this.dsPerfil = dsPerfil;
	}

	public LocalDate getHoraInclusao() {
		return horaInclusao;
	}

	public void setHoraInclusao(LocalDate horaInclusao) {
		this.horaInclusao = horaInclusao;
	}

	public boolean isHoraAlteracao() {
		return horaAlteracao;
	}

	public void setHoraAlteracao(boolean horaAlteracao) {
		this.horaAlteracao = horaAlteracao;
	}

	public Set<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(Set<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	
    
}

