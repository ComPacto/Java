package projagenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> listaDeContatos;

    public Agenda() {
        this.listaDeContatos = new ArrayList<>();
    }

    public ArrayList<Contato> getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(ArrayList<Contato> listaDeContatos) {
        this.listaDeContatos = listaDeContatos;
    }

    public ArrayList<Contato> pesquisarAniversariantesMes(byte mes) {
        return getListaDeContatos();
    }
    
    public Contato pesquisarContatoNome(String nome){
        Contato nomeP = null;
        for (int i = 0; i < this.listaDeContatos.size() && nomeP == null; i++) {
           if(this.listaDeContatos.get(i).getNome().equalsIgnoreCase(nome)){
               nomeP = this.listaDeContatos.get(i);
           } 
        }
        return nomeP;
    }

    @Override
    public String toString() {
        return "\n"
                + "Lista de contatos: " + listaDeContatos;
    }

}
