/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Vitor
 */
public class Canva {
    private Long id;
    private String descricao;
    
    public Canva(String descricao){
        this.descricao = descricao;
    }
    
    public Canva(){}

    public Canva(String descricao, Long id) {
        this.descricao = descricao;
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
