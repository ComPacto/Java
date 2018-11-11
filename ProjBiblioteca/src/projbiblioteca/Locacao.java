package projbiblioteca;

public class Locacao {

    private double valorLocacao;
    private double valorMulta;
    private Usuario objUsuario;
    private Funcionario objFuncionario;
    private Data objDataLocacao;
    private Data objDataDevolucao;
    private Livro objLivro;

    public Locacao() {
        this.objUsuario = new Usuario();
        this.objFuncionario = new Funcionario();
        this.objDataLocacao = new Data();
        this.objDataDevolucao = new Data();
        this.objLivro = new Livro();
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double calcularLocacao() {
        return 0;
    }

    public void locarLivro() {
        this.objLivro.status = true;
    }

    public void devolverLivro() {
        this.objLivro.status = false;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public Funcionario getObjFuncionario() {
        return objFuncionario;
    }

    public void setObjFuncionario(Funcionario objFuncionario) {
        this.objFuncionario = objFuncionario;
    }

    public Data getObjDataLocacao() {
        return objDataLocacao;
    }

    public void setObjDataLocacao(Data objDataLocacao) {
        this.objDataLocacao = objDataLocacao;
    }

    public Data getObjDataDevolucao() {
        return objDataDevolucao;
    }

    public void setObjDataDevolucao(Data objDataDevolucao) {
        this.objDataDevolucao = objDataDevolucao;
    }

    public Livro getObjLivro() {
        return objLivro;
    }

    public void setObjLivro(Livro objLivro) {
        this.objLivro = objLivro;
    }

    @Override
    public String toString() {
        return "\n"
                + "Valor da locação: " + valorLocacao + "\n"
                + "Valor da multa: " + valorMulta + "\n\n"
                + "Dados do cliente:\n " + objUsuario + "\n\n"
                + "Data de locação: " + objDataLocacao + "\n\n"
                + "Data de devolução: " + objDataDevolucao + "\n\n"
                + "Livro alocado: " + objLivro + "\n\n"
                + "Dados do Funcionário (encarregado da locação):\n " + objFuncionario;
    }

    
}
