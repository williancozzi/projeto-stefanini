package com.stefanini.teste;

import com.stefanini.model.Endereco;
import com.stefanini.model.Pessoa;
import com.stefanini.model.Perfil;
import com.stefanini.service.EnderecoService;
import com.stefanini.service.PerfilService;
import com.stefanini.service.PessoaService;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;
import java.time.LocalDate;


public class App {

    @Inject
    PessoaService pessoaService;
    @Inject
    EnderecoService enderecoService;
    @Inject
    PerfilService perfilService;

    public static void main(String[] args) {
        //CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        try (final SeContainer container = initializer.initialize()) {
            App app = container.select(App.class).get();
            app.executar();
        }
    }

    public void executar() {
        salvarPessoa();
        buscarTodas();
        salvarEndereco();
        salvarPerfil();
    }

    public void buscarTodas(){
        pessoaService.getList().forEach(x -> System.out.println(x));
    }

    public void salvarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail("Phael@gmail.com");
        pessoa.setDataNascimento(LocalDate.of(1997, 8, 23));
        pessoa.setNome("Raphael");
        pessoa.setSituacao(Boolean.TRUE);


        pessoaService.salvar(pessoa);
    }
    
    public void salvarEndereco(){
    	Endereco endereco = new Endereco();
    	endereco.setIdPessoa(pessoaService.getList().get(0).getId());
    	endereco.setLogradouro("djkfbçsdi");
    	endereco.setComplemento("dsfsd");
    	endereco.setBairro("dsfs");
    	endereco.setCidade("fdfsdp");
    	endereco.setUf("sdf");
    	endereco.setCep("dfs");
    	
    	enderecoService.salvar(endereco);
    }
    
    public void salvarPerfil() {
    	Perfil perfil = new Perfil();
    	perfil.setPerfil("perfil do bode");
    	perfil.setDsPerfil("perfil massa");
    	perfil.setHoraAlteracao(true);
    	perfil.setHoraInclusao(LocalDate.of(2020, 2, 10));
    
    	perfilService.salvar(perfil);
    }
    
    
    
    
    
    
}
