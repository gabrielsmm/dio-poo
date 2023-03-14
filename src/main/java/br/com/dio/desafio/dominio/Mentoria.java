package br.com.dio.desafio.dominio;

import java.util.Date;

public class Mentoria extends Conteudo {

    private Date data;

    public Mentoria() {
        super();
    }

    public Mentoria(String titulo, String descricao, Date data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
