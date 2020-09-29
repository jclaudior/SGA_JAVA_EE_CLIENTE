
package com.jcr.sga.service;

import com.jcr.sga.domain.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PessoaServiceImpl implements PessoaServiceRemote{

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> listaDePessoas = new ArrayList();
        listaDePessoas.add(new Pessoa(1,"JOAO","JC","JOAOCLAUDIODIVA@GMAIL.COM","11947108920"));
        listaDePessoas.add(new Pessoa(1,"LUCAS","INUTILISMO","LUQUINHAS@GMAIL.COM","11944556777"));
        return listaDePessoas;
    }

    @Override
    public Pessoa encontrarPessoaPorId(Pessoa pessoa) {
        return null;
    }

    @Override
    public Pessoa encontrarPessoaPoeEmail(Pessoa pessoa) {
        return null;
    }

    @Override
    public void registrarPessoa(Pessoa pessoa) {
      
    }

    @Override
    public void modificarPessoa(Pessoa pessoa) {
        
    }

    @Override
    public void deletarPessoa(Pessoa pessoa) {
        
    }
    
}
