package projaluno;
public class Aluno {
    private String nome;
    private long ra;
    private Avaliacao objAvaliacao1;
    private Avaliacao objAvaliacao2;

    public Aluno() {
        this.objAvaliacao1 = new Avaliacao();
        this.objAvaliacao2 = new Avaliacao();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public Avaliacao getObjAvaliacao1() {
        return objAvaliacao1;
    }

    public void setObjAvalicao1(Avaliacao objAvaliacao) {
        this.objAvaliacao1 = objAvaliacao1;
    }
    
    public Avaliacao getObjAvaliacao2() {
        return objAvaliacao2;
    }

    public void setObjAvaliacao2(Avaliacao objAvaliacao2) {
        this.objAvaliacao2 = objAvaliacao2;
    }
    
    public double calcularMedia(){
        return (objAvaliacao1.getNota() + objAvaliacao2.getNota()) / 2;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "RA: " + ra + "\n"
                + "Nota da N1: " + objAvaliacao1 + "\n"
                + "Nota da N2: " +objAvaliacao2;
    }
    
}
