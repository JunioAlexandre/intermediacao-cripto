package br.com.projeto_avaliacao_2.dto;

/**
 *
 * @author junio
 */

public class ProdutoDTO {
    private String nome_prod, desc_prod, cod_bar_prod;
    private double p_venda_prod;
    private int id_prod;

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public String getCod_bar_prod() {
        return cod_bar_prod;
    }

    public void setCod_bar_prod(String cod_bar_prod) {
        this.cod_bar_prod = cod_bar_prod;
    }

    public double getP_venda_prod() {
        return p_venda_prod;
    }

    public void setP_venda_prod(double p_venda_prod) {
        this.p_venda_prod = p_venda_prod;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }
}
