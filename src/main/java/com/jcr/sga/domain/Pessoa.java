/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcr.sga.domain;

import java.io.Serializable;

/**
 *
 * @author Pichau
 */
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    private int idPessoa;
    private String nomePessoa;
    private String apelidoPessoa;
    private String emailPessoa;
    private String telefonePessoa;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nomePessoa, String apelidoPessoa, String emailPessoa, String telefonePessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.apelidoPessoa = apelidoPessoa;
        this.emailPessoa = emailPessoa;
        this.telefonePessoa = telefonePessoa;
    }

    

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getApelidoPessoa() {
        return apelidoPessoa;
    }

    public void setApelidoPessoa(String apelidoPessoa) {
        this.apelidoPessoa = apelidoPessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", apelidoPessoa=" + apelidoPessoa + ", emailPessoa=" + emailPessoa + ", telefonePessoa=" + telefonePessoa + '}';
    }
    
    
    
}
