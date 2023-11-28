package Itens;

public class ItemAchado {
    private int iditem;
    private String descricao;
    private String local;
    private String data_achado;

    public ItemAchado(int iditem) {
        this.iditem = iditem;
    }

    public ItemAchado(String descricao, String local, String data_achado) {
        this.descricao = descricao;
        this.local = local;
        this.data_achado = data_achado;
    }

    public ItemAchado(int iditem, String descricao, String local, String data_achado) {
        this.iditem = iditem;
        this.descricao = descricao;
        this.local = local;
        this.data_achado = data_achado;
    }
    
    public ItemAchado(){
        
    }
       

    public int getIdItem() {
        return iditem;
    }

    public void setIdItem(int idItem) {
        this.iditem = idItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDataAchado() {
        return data_achado;
    }

    public void setDataAchado(String dataAchado) {
        this.data_achado = dataAchado;
    }
    
}
