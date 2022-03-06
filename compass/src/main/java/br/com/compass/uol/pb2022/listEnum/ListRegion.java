package br.com.compass.uol.pb2022.listEnum;

public enum ListRegion {
    NORTE("NORTE"),
    NORDESTE("NORDESTE"),
    SUL("SUL"),
    SUDESTE("SUDESTE"),
    CENTRO_OESTE("CENTRO-OESTE");

    private String descricao;

    ListRegion(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
