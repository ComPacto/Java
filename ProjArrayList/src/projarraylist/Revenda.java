package projarraylist;

import java.util.ArrayList;

public class Revenda {

    private String nome;
    private long cnpj;
    private ArrayList<Carro> listaCarros;

    public Revenda() {
        this.listaCarros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public void adicionarCarro(Carro objCarro) {
        this.listaCarros.add(objCarro);
    }

    public int obterQuantidadeDeCarros() {
        return this.listaCarros.size();
    }

    public void apagarTudo() {
        this.listaCarros.clear();
    }

    public double calcularValor() {
        double valorTotal = 0;
        for (int i = 0; i < this.listaCarros.size(); i++) {
            valorTotal += this.listaCarros.get(i).getValor();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "CNPJ: " + cnpj + "\n"
                + "Lista de carros: " + this.listaCarros + "\n";
    }
}
