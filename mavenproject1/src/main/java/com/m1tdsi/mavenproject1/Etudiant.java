/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m1tdsi.mavenproject1;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author diop
 */
@Entity
@Table(name = "Etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e")
    , @NamedQuery(name = "Etudiant.findByIdEtudiant", query = "SELECT e FROM Etudiant e WHERE e.idEtudiant = :idEtudiant")
    , @NamedQuery(name = "Etudiant.findByNomEtudiant", query = "SELECT e FROM Etudiant e WHERE e.nomEtudiant = :nomEtudiant")
    , @NamedQuery(name = "Etudiant.findByPrenomEtudiant", query = "SELECT e FROM Etudiant e WHERE e.prenomEtudiant = :prenomEtudiant")
    , @NamedQuery(name = "Etudiant.findByMatriculeEtudiant", query = "SELECT e FROM Etudiant e WHERE e.matriculeEtudiant = :matriculeEtudiant")
    , @NamedQuery(name = "Etudiant.findByAdresseEtudiant", query = "SELECT e FROM Etudiant e WHERE e.adresseEtudiant = :adresseEtudiant")
    , @NamedQuery(name = "Etudiant.findByTelephone", query = "SELECT e FROM Etudiant e WHERE e.telephone = :telephone")})
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEtudiant")
    private Integer idEtudiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nomEtudiant")
    private String nomEtudiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "prenomEtudiant")
    private String prenomEtudiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "matriculeEtudiant")
    private String matriculeEtudiant;
    @Size(max = 255)
    @Column(name = "adresseEtudiant")
    private String adresseEtudiant;
    @Size(max = 30)
    @Column(name = "telephone")
    private String telephone;

    public Etudiant() {
    }

    public Etudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Etudiant(Integer idEtudiant, String nomEtudiant, String prenomEtudiant, String matriculeEtudiant) {
        this.idEtudiant = idEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.matriculeEtudiant = matriculeEtudiant;
    }

    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getMatriculeEtudiant() {
        return matriculeEtudiant;
    }

    public void setMatriculeEtudiant(String matriculeEtudiant) {
        this.matriculeEtudiant = matriculeEtudiant;
    }

    public String getAdresseEtudiant() {
        return adresseEtudiant;
    }

    public void setAdresseEtudiant(String adresseEtudiant) {
        this.adresseEtudiant = adresseEtudiant;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEtudiant != null ? idEtudiant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.idEtudiant == null && other.idEtudiant != null) || (this.idEtudiant != null && !this.idEtudiant.equals(other.idEtudiant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.m1tdsi.mavenproject1.Etudiant[ idEtudiant=" + idEtudiant + " ]";
    }
    
}
