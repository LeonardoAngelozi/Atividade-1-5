package Atividade.Animais;

public class Animais {

    protected int celula;
    private String quantidadeMembros;
    
    protected void multiCelular() {
        if(celula >= 2){
            System.out.println("Parabens isto é um animal");
        }else{
            throw new RuntimeException("Para ser animal tem que multi celular!");
        }
    }
    public void celula(Integer celula) {
        this.celula = celula;
    }

    public Integer getCelula(){
        return celula;
    }
    public void setCelula(int celula){
        this.celula = celula;
    }
    
    public void andar(){
        System.out.println("Estou andando!");
    }

    public void quantidadeMembros(String quantidadeMembros) {
        setQuantidadeMembros(quantidadeMembros);
    }

    public String getQuantidadeMembros() {
        return quantidadeMembros;
    }
    public void setQuantidadeMembros(String quantidadeMembros){
        this.quantidadeMembros = quantidadeMembros;
    }

}
