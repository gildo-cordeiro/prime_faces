package br.com.gildo.cordeiro.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.gildo.cordeiro.erp.model.Empresa;
import br.com.gildo.cordeiro.erp.repository.Empresas;
import br.com.gildo.cordeiro.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Empresas empresas;

    @Transacional
    public void salvar(Empresa empresa) {
        empresas.guardar(empresa);
    }

    @Transacional
    public void excluir(Empresa empresa) {
        empresas.remover(empresa);
    }

}