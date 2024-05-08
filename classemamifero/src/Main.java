
class Animal {
    private String nome;
    private int idade;
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
class Mamifero extends Animal {
    private String alimento;
    public Mamifero(String nome, int idade, String alimento) {
        super(nome, idade);
        this.alimento = alimento;
    }
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String toString() {
        return "Mamifero{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", alimento='" + alimento + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Elefante", 5, "Folhas");
        System.out.println(mamifero.toString());
        mamifero.setAlimento("Frutas");
        System.out.println(mamifero.toString());
    }
}
