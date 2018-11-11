public class Funcionario{
    public String nome;
    public long chapa;
    public double valorHora;
    public double cargaHoraria; 
    
    public double calcularSalario(){       
        return this.valorHora*this.cargaHoraria;
    }
       
    public double calcularVT(){
        return this.calcularSalario()*0.06;
    }
    
    public double calcularINSS(){
        if (this.calcularSalario()<=1659.38){
            return this.calcularSalario()*0.08;
        }else if(this.calcularSalario()<2765.66){
            return this.calcularSalario()*0.09;
        }else if(this.calcularSalario()<5531.31){
            return this.calcularSalario()*0.11;
        }
        return 608.44;
    }
}