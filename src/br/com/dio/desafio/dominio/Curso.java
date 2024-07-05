package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("Curso{titulo='%s%c, descricao='%s%c, cargaHoraria=%d%c", getTitulo(), '\'', getDescricao(), '\'', cargaHoraria, '}');
    }

}