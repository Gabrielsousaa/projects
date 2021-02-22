package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date data_Nasci;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente() {
    }

    public Cliente(String nome, String email, Date data_Nasci) {
        this.nome = nome;
        this.email = email;
        this.data_Nasci = data_Nasci;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_Nasci() {
        return data_Nasci;
    }

    public void setData_Nasci(Date data_Nasci) {
        this.data_Nasci = data_Nasci;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

}
