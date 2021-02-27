package com.gildo.cordeiro.erp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.gildo.cordeiro.erp.model.Empresa;
import br.com.gildo.cordeiro.erp.repository.Empresas;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
    
   private static final long serialVersionUID = 1L;
   
   @Inject
   private Empresas empresas;
   
   private List<Empresa> listEmpresas;
   
   public void todasEmpresas() {
	   listEmpresas = empresas.todas();
   }   
   public List<Empresa> getListEmpresas() {
	   return listEmpresas;
   }
   
}
