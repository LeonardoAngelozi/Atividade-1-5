package Atividade.Animais;

public class Mamiferos extends Animais{

    private String pessoa;

    public Mamiferos(String pessoa) {
        setPessoa(pessoa);
    }

    public String getPessoa(){
        return pessoa;
    }

    public void setPessoa(String pessoa){
        this.pessoa = pessoa;
    }

    @Override
    public void andar() {
        System.out.println("Eu " + pessoa + "ando usando 2 pernas!");
    }
}
