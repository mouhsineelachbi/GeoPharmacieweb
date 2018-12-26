package GeoPharmacie;
import java.util.Date;

public class Produit {
     private int ReferenceProduit;
     private String Libelle;
     private String DateFabrication;
     private String DateExpiration;
     private double TemperatureStock;
     private int NumeroProduit;
     private double Prix;

    public Produit(int NumeroProduit,int ReferenceProduit, String Libelle, String DateFabrication, String DateExpiration, double TemperatureStock,  double Prix) {
        this.ReferenceProduit = ReferenceProduit;
        this.Libelle = Libelle;
        this.DateFabrication = DateFabrication;
        this.DateExpiration = DateExpiration;
        this.TemperatureStock = TemperatureStock;
        this.NumeroProduit = NumeroProduit;
        this.Prix = Prix;
    }

    public int getReferenceProduit() {
        return ReferenceProduit;
    }

    public String getLibelle() {
        return Libelle;
    }

    public String getDateFabrication() {
        return DateFabrication;
    }

    public String getDateExpiration() {
        return DateExpiration;
    }

    public double getTemperatureStock() {
        return TemperatureStock;
    }

    public int getNumeroProduit() {
        return NumeroProduit;
    }

    public double getPrix() {
        return Prix;
    }

    public void setReferenceProduit(int ReferenceProduit) {
        this.ReferenceProduit = ReferenceProduit;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public void setDateFabrication(String DateFabrication) {
        this.DateFabrication = DateFabrication;
    }

    public void setDateExpiration(String DateExpiration) {
        this.DateExpiration = DateExpiration;
    }

    public void setTemperatureStock(float TemperatureStock) {
        this.TemperatureStock = TemperatureStock;
    }

    public void setNumeroProduit(int NumeroProduit) {
        this.NumeroProduit = NumeroProduit;
    }

    public void setPrix(float Prix) {
        this.Prix = Prix;
    }
     
}
