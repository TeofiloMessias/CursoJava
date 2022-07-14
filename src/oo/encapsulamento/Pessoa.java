package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String sobrenome;
    private String nome;

    public Pessoa(String nome,String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String setSobrenome(String sobrenome){
       return sobrenome;
    }
    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }
    //GETTER
    public int getIdade(){
        return idade;
    }
    //SETTER
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }
    public String toString() {
        return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos; ";


    }
}