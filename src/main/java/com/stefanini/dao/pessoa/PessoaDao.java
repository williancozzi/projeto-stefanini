package com.stefanini.dao.pessoa;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Pessoa;

public class PessoaDao  extends GenericDao<Pessoa, Long> {

    public PessoaDao(){
        super(Pessoa.class);
    }

}
