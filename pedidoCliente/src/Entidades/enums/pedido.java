package Entidades.enums;

import java.util.*;
import Entidades.enums.pedido_Status;

public class pedido {

    private Integer id;
    private Date momento;
    private pedido_Status status;

    public pedido() {

    }
    
    public String toString() {
        return "pedido{" + "id=" + id + ", momento=" + momento + ", status=" + status + '}';
    }
    
    

    public pedido(Integer id, Date momento, pedido_Status status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public pedido_Status getStatus() {
        return status;
    }

    public void setStatus(pedido_Status status) {
        this.status = status;
    }

    
    
}
