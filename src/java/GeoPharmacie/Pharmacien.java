package GeoPharmacie;
//
//  Generated by StarUML(tm) Java Add-In

import java.util.LinkedList;

//
//  @ Project : Untitled
//  @ File Name : Pharmacien.java
//  @ Date : 10/27/2018
//  @ Author : 
//
//




public class Pharmacien extends Utilisateur {
     private int NumeroPharmacien;

  

     public Pharmacien(int NumeroPharmacien,String Nom, String Prenom, String Cin, String tel, String Email, String Adresse, String Pseudo, String motDePasse) {
         super(Nom, Prenom, Cin, tel, Email, Adresse, Pseudo, motDePasse);
        this.NumeroPharmacien = NumeroPharmacien;
    }
   

    public int getNumeroPharmacien() {
        return NumeroPharmacien;
    }

    public void setNumeroPharmacien(int NumeroPharmacien) {
        this.NumeroPharmacien = NumeroPharmacien;
    }
    LinkedList<Produit> AjouterProduit(){
        return null;
    }
    LinkedList<Produit> SupprimerProduit(){
        return null;
    }
    LinkedList<Produit> ModifierProduit(){
        return null;
    }
    void AjouterDescription(){}
    void SupprimerDescription(){}
    void ModifierDescription(){}
    
    Compte creerCompte(){return null;}
   }