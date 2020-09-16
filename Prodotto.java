import java.util.GregorianCalendar;

public class Prodotto {
    private Enum reparto;
    private Enum categoria;
    private String scaffale;
    private String nomeProdotto;
    private String produttore;
    private long codiceProdotto;
    private double quantita;
    private Enum unitaMisura;
    private float prezzo;
    private String taglia;
    private float sconto;
    private String responsabile;
    private String telefono;
    private GregorianCalendar scadenza;

    // Reparto get 
    
    public Enum getReparto(){
        return reparto;
    }
    
    // Categoria get 
    
    public Enum getCategoria(){
        return categoria;
    }
    
    // Scaffale get - Set
    public String getScaffale(){
        return scaffale;
    }
    public void setScaffale(String scaffale) {
        this.scaffale = scaffale;
    }

    // NomeProdotto get- set 
    
    public String getNomeProdotto() {
        return nomeProdotto;
    }
    
    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }
    
    // CodiceProdotto get - Set 

    public long getCodiceProdotto() {
        return codiceProdotto;
    }
    public void setCodiceProdotto(long codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    // Produttore get - Set 

    public String getProduttore(){
        return produttore;
    }
    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }
    
    // Responsabile get - Set 

    public String getResponsabile(){
        return responsabile;
    }
    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }

    // Quantita get - Set 

    public double getQuantita() {
        return quantita;
    }
    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }

    // Sconto get - Set 
    
    public float getSconto() {
        return sconto;
    }
    public void setSconto(float sconto) {
        this.sconto = sconto;
    }
    
    // Telefono get- set 
    
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
