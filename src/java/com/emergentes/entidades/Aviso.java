/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author intel
 */
@Entity
@Table(name = "avisos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aviso.findAll", query = "SELECT a FROM Aviso a"),
    @NamedQuery(name = "Aviso.findById", query = "SELECT a FROM Aviso a WHERE a.id = :id"),
    @NamedQuery(name = "Aviso.findByFecha", query = "SELECT a FROM Aviso a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Aviso.findByTitulo", query = "SELECT a FROM Aviso a WHERE a.titulo = :titulo"),
    @NamedQuery(name = "Aviso.findByReferencia", query = "SELECT a FROM Aviso a WHERE a.referencia = :referencia"),
    @NamedQuery(name = "Aviso.findByIdCategoria", query = "SELECT a FROM Aviso a WHERE a.idCategoria = :idCategoria"),
    @NamedQuery(name = "Aviso.findByIdUsuario", query = "SELECT a FROM Aviso a WHERE a.idUsuario = :idUsuario")})
public class Aviso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 100)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Size(max = 65535)
    @Column(name = "contenido")
    private String contenido;
    @Size(max = 100)
    @Column(name = "referencia")
    private String referencia;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "id_usuario")
    private Integer idUsuario;

    public Aviso() {
    }

    public Aviso(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aviso)) {
            return false;
        }
        Aviso other = (Aviso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.emergentes.entidades.Aviso[ id=" + id + " ]";
    }
    
}
