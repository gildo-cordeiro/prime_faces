package com.gildo.cordeiro.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.gildo.cordeiro.erp.model.Empresa;
import br.com.gildo.cordeiro.erp.model.TipoEmpresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
   private Empresa empresa = new Empresa();
   
   public void salvar() {
	   System.out.println("Razao: "+ empresa.getRazaoSocial() + " - Nome fantasia: " + empresa.getNomeFantasia() + " - Tipo: "+ empresa.getTipo());
   }
   
   public Empresa getEmpresa() {
	   return empresa;
   }
   
   public TipoEmpresa[] getTiposEmpresa() {
	   return TipoEmpresa.values();
   }
   
}
