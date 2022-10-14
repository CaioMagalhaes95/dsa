package aplicaçãoparaequals;

public class Aplicaçãoparaequals {

    public static void main(String[] args) {
       Pessoa p1 = new Pessoa("Galadriel", 321, 2.30, 1005);
       Pessoa p2 = new Pessoa("Galadriel", 321, 2.30, 1005);
       
        System.out.println(p1.equals(p2));
    }
    
}
