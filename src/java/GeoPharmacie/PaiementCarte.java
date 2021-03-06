package GeoPharmacie;
import java.util.Date;

public class PaiementCarte extends Paiement {
    
     private String NomPro;
     private String PrenomPro;
     private String NumeroCarte;
     private String AdressePro;

    public PaiementCarte(Date DatePaiement, Double Montant, Boolean Paye) {
        super(DatePaiement, Montant, Paye);
    }

    public PaiementCarte(String NomPro, String PrenomPro, String NumeroCarte, String AdressePro, Date DatePaiement, Double Montant, Boolean Paye) {
        super(DatePaiement, Montant, Paye);
        this.NomPro = NomPro;
        this.PrenomPro = PrenomPro;
        this.NumeroCarte = NumeroCarte;
        this.AdressePro = AdressePro;
    }

    public void setNomPro(String NomPro) {
        this.NomPro = NomPro;
    }

    public void setPrenomPro(String PrenomPro) {
        this.PrenomPro = PrenomPro;
    }

    public void setNumeroCarte(String NumeroCarte) {
        this.NumeroCarte = NumeroCarte;
    }

    public void setAdressePro(String AdressePro) {
        this.AdressePro = AdressePro;
    }

    public String getNomPro() {
        return NomPro;
    }

    public String getPrenomPro() {
        return PrenomPro;
    }

    public String getNumeroCarte() {
        return NumeroCarte;
    }

    public String getAdressePro() {
        return AdressePro;
    }
    
}
