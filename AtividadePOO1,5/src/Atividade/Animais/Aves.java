package Atividade.Animais;

public class Aves extends Animais{
    
    private String tiposAves;

    
    public Aves() {
	}

    public Aves(String tiposAves) {
        setTiposAves(tiposAves);
    }


	public String getTiposAves(){
        return tiposAves;
    }

    public void setTiposAves(String tiposAves) {
        this.tiposAves = tiposAves;
    }

    @Override
    public void setQuantidadeMembros(String quantidadeMembros) {
        super.setQuantidadeMembros(quantidadeMembros);
        if(quantidadeMembros.equals("2 asas") ) {
            System.out.println("Olha eu consigo voar");
        }else{
            System.out.println("Tristao não consigo voar");
        }
    }
}
