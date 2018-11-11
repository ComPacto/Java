package projaluno;
public class Avaliacao {
    private String descricao;
    private double nota;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\n"
                + "Descrição: " + descricao + "\n"
                + "Nota: " + nota;
    }
    
    
}
