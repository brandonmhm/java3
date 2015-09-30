/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author T-107
 */
@Entity
@Table(name = "usuario")

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ususario")
    private Integer idUsusario;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    public Usuario() {
    }

    public Usuario(Integer idUsusario) {
        this.idUsusario = idUsusario;
    }

    public Integer getIdUsusario() {
        return idUsusario;
    }

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    

    public void setIdUsusario(Integer idUsusario) {
        this.idUsusario = idUsusario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsusario != null ? idUsusario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsusario == null && other.idUsusario != null) || (this.idUsusario != null && !this.idUsusario.equals(other.idUsusario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Usuario[ idUsusario=" + idUsusario + " ]";
    }
    
}
