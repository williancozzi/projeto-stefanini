package com.stefanini.dao.entitydao;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Endereco;


public class EnderecoDao  extends GenericDao<Endereco, Integer> {

    public EnderecoDao(){
        super(Endereco.class);
    }

}
