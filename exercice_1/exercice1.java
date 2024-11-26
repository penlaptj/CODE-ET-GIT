public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            total -= reductionCinq(total); // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            total -= reductionDix(total); // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            total -= reductionQuinze(total); // Réduction de 15%
        }

        // Reduction sur le total
        if (total > 1000) {
            total -= reductionCinq(total); // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }
    public double reductionCinq(double total){
        return total*0.05;
    }
    public douuble reductionDix(double total){
        return total*0.1;
    }
    public double reductionQuinze(double total){
        return total*0.15;
    }
}
