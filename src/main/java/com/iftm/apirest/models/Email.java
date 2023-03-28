package com.iftm.apirest.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Table(name="email")
public class Email implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "from", nullable = false, length = 50)
    private String from;
    @Column(name = "to", nullable = false, length = 100)
    private String to;
    @Column(name = "subjetc", nullable = false, length = 50)
    private String subjetc;
    @Column(name = "body", nullable = false, length = 300)
    private String body;
    @Column(name = "attachment", nullable = false, length = 100)
    private String attachment;

    public Email(Long id, String from, String to, String subjetc, String body, String attachment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.subjetc = subjetc;
        this.body = body;
        this.attachment = attachment;
    }

    public Email() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubjetc() {
        return subjetc;
    }

    public void setSubjetc(String subjetc) {
        this.subjetc = subjetc;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subjetc='" + subjetc + '\'' +
                ", body='" + body + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (id != null ? !id.equals(email.id) : email.id != null) return false;
        if (from != null ? !from.equals(email.from) : email.from != null) return false;
        if (to != null ? !to.equals(email.to) : email.to != null) return false;
        if (subjetc != null ? !subjetc.equals(email.subjetc) : email.subjetc != null) return false;
        if (body != null ? !body.equals(email.body) : email.body != null) return false;
        return attachment != null ? attachment.equals(email.attachment) : email.attachment == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (subjetc != null ? subjetc.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        return result;
    }
}
