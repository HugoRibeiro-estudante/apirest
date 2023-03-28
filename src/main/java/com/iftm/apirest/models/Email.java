package com.iftm.apirest.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name="email_table")
public class Email implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "de", nullable = false, length = 50)
    private String de;
    @Column(name = "para", nullable = false, length = 100)
    private String para;
    @Column(name = "assunto", nullable = false, length = 50)
    private String assunto;
    @Column(name = "corpo", nullable = false, length = 300)
    private String corpo;
    @Column(name = "anexo", nullable = false, length = 100)
    private String anexo;

    public Email(Long id, String de, String para, String assunto, String corpo, String anexo) {
        this.id = id;
        this.de = de;
        this.para = para;
        this.assunto = assunto;
        this.corpo = corpo;
        this.anexo = anexo;
    }

    public Email() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (id != null ? !id.equals(email.id) : email.id != null) return false;
        if (de != null ? !de.equals(email.de) : email.de != null) return false;
        if (para != null ? !para.equals(email.para) : email.para != null) return false;
        if (assunto != null ? !assunto.equals(email.assunto) : email.assunto != null) return false;
        if (corpo != null ? !corpo.equals(email.corpo) : email.corpo != null) return false;
        return anexo != null ? anexo.equals(email.anexo) : email.anexo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (de != null ? de.hashCode() : 0);
        result = 31 * result + (para != null ? para.hashCode() : 0);
        result = 31 * result + (assunto != null ? assunto.hashCode() : 0);
        result = 31 * result + (corpo != null ? corpo.hashCode() : 0);
        result = 31 * result + (anexo != null ? anexo.hashCode() : 0);
        return result;
    }
}
