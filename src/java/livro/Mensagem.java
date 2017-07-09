/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

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
 * @author junio
 */
@Entity
@Table(name = "MENSAGEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensagem.findAll", query = "SELECT m FROM Mensagem m")
    , @NamedQuery(name = "Mensagem.findById", query = "SELECT m FROM Mensagem m WHERE m.id = :id")
    , @NamedQuery(name = "Mensagem.findByContato", query = "SELECT m FROM Mensagem m WHERE m.contato = :contato")
    , @NamedQuery(name = "Mensagem.findByMensagem", query = "SELECT m FROM Mensagem m WHERE m.mensagem = :mensagem")
    , @NamedQuery(name = "Mensagem.findByNome", query = "SELECT m FROM Mensagem m WHERE m.nome = :nome")})
public class Mensagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CONTATO")
    private String contato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "MENSAGEM")
    private String mensagem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NOME")
    private String nome;

    public Mensagem() {
    }

    public Mensagem(Integer id) {
        this.id = id;
    }

    public Mensagem(Integer id, String contato, String mensagem, String nome) {
        this.id = id;
        this.contato = contato;
        this.mensagem = mensagem;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (!(object instanceof Mensagem)) {
            return false;
        }
        Mensagem other = (Mensagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "livro.Mensagem[ id=" + id + " ]";
    }
    
}
