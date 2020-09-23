import java.util.Vector;

public class Supermercato {
    private Vector<Prodotto> prodotti;
    private String nome;
    private String nomeArchivio;

    public Supermercato(String nome, String nomeArchivio){
        this.nome=nome;
        this.nomeArchivio = nomeArchivio;
        prodotti = new Vector<Prodotto>();
    }

    public void addProdotto(Prodotto prodotto){
        
        for (Prodotto p : this.prodotti) {
            if (p.getNomeProdotto().equals(nome)){
                break;
            }
            cont++;
        }
        if(cont>this.prodotti.size()){
            this.prodotti.add(prodotto);
        }
    }

    public Prodotto ricercaProdotto(long codice){
        for (Prodotto p : this.prodotti) {
            if (p.getCodiceProdotto() == codice) return p;
        }
        return null;
    }

    public Prodotto ricercaProdotto(String nome){
        for (Prodotto p : this.prodotti) {
            if (p.getNomeProdotto().equals(nome)) return p;
        }
        return null;
    }

    public void deleteProdotto(Prodotto prodotto){
        for (int i = 0; i < this.prodotti.size(); i++) {
            if (this.prodotti.get(i).getCodiceProdotto() == prodotto.getCodiceProdotto()) this.prodotti.remove(i);
        }
    }

    public void updateProdotto(Prodotto prodotto){
        for (int i = 0; i < this.prodotti.size(); i++) {
            if (this.prodotti.get(i).getCodiceProdotto() == prodotto.getCodiceProdotto()) this.prodotti.set(i, prodotto);
        }
    }

    public float ricercaValoreReparto(String reparto){
        return 0;
    }
    
    public String ricercaTelefonoResponsabile(String reparto){
        return null;
    }
}
