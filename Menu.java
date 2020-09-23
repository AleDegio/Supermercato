import javax.swing.*;

public class Menu {
    JMenu m, mProd;
    JMenuItem ricValRep, ricTelResp, add, ricerca1, ricerca2, delate, update; //nodi del menu
    Menu(){
        JMenuBar mb = new JMenuBar(); //barra del menu
        m = new JMenu("Menu Grande magazzino"); //menu principale
        mProd = new JMenu("Menu Prodotto"); //menu prodotto
        mb.add(m);

        ricValRep = new JMenuItem("Ricerca reparto");
        ricTelResp = new JMenuItem("Ricerca num. Telefono responsabile");
        m.add(ricValRep);
        m.add(ricTelResp);

        m.add(mProd);
        add = new JMenuItem("Aggiungi");
        ricerca1 = new JMenuItem("Ricerca tramite il NOME");
        ricerca2 = new JMenuItem("Ricerca tramite il CODICE");
        delate = new JMenuItem("Cancella");
        update = new JMenuItem("Aggiorna");

        mProd.add(add);
        mProd.add(ricerca1);
        mProd.add(ricerca2);
        mProd.add(delate);
        mProd.add(update);
    }
    public static void main(String[] argv) {
        new Menu();
    }
}

