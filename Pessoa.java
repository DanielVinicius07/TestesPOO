public class Pessoa{
    
    public static void main(String[] args){
        
        Ppessoas pessoaA = new Ppessoas();
        pessoaA.nome = "Daniel";
        pessoaA.idade = 17;
        pessoaA.cpf = 7438255;
        pessoaA.nasc = 12022005;
        
        System.out.format("Nome da pessoa %s, idade %s cpf %s nasc %s ", pessoaA.nome,pessoaA.idade,pessoaA.cpf,pessoaA.nasc);
    }
}