package projassociacao;
public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String fone;
    private String cidade;
    private String uf;

    public Endereco() {
        this.complemento = "casa";
        this.uf = "RS";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "\n"
                + "Rua: " + rua + "\n"
                + "Número: " + numero + "\n"
                + "Complemento: " + complemento + "\n"
                + "Bairro: " + bairro + "\n"
                + "CEP: " + cep + "\n"
                + "Telefone: " + fone + "\n"
                + "Cidade: " + cidade + "\n"
                + "UF (unidade federativa): " + uf;
    }
    
    
}
