package Atividade.Animais;

public class AppMain {
    
    public static void main(String[] args) {
        
        Mamiferos bipedesMamiferos = new Mamiferos("Humanos");
        Aves todasAves = new Aves();
        
        System.out.println(bipedesMamiferos.getPessoa());
        System.out.println(todasAves.getTiposAves());
    }
}
