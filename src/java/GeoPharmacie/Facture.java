package GeoPharmacie;

public class Facture {
    
     private String NumFacture;
     private String DateFacture;
     private String NumCommande;
     private double Some_Total;

    public Facture(String NumFacture, String DateFacture, String NumCommande, double Some_Total) {
        this.NumFacture = NumFacture;
        this.DateFacture = DateFacture;
        this.NumCommande = NumCommande;
        this.Some_Total = Some_Total;
    }

    Facture(int num, String d1, Double some) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumFacture(String NumFacture) {
        this.NumFacture = NumFacture;
    }

    public void setDateFacture(String DateFacture) {
        this.DateFacture = DateFacture;
    }

    public void setNumCommande(String NumCommande) {
        this.NumCommande = NumCommande;
    }

    public void setSome_Total(double Some_Total) {
        this.Some_Total = Some_Total;
    }

    public String getNumFacture() {
        return NumFacture;
    }

    public String getDateFacture() {
        return DateFacture;
    }

    public String getNumCommande() {
        return NumCommande;
    }

    public double getSome_Total() {
        return Some_Total;
    }
     
}
