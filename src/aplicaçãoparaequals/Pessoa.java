package aplicaçãoparaequals;

public class Pessoa {
    private String nome;
    private int     cpf;
    private double salario;
    private int data;
    
    

    public Pessoa(String nome, int cpf, double salario, int data) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.data = data;
    }
    
    @Override
    public boolean equals(Object other){
        if (other == null)
            return false;
        
        if(!(other instanceof Pessoa))
            return false;
        
        Pessoa p = (Pessoa)other;
        boolean nomeEqual = this.nome != null && this.nome.equals(p.nome);
        boolean cpfEqual = this.cpf == p.cpf;
        boolean salEqual = this.salario == p.salario;
        boolean dataEqual = this.data == p.data;
        
        return nomeEqual && cpfEqual && salEqual && dataEqual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
