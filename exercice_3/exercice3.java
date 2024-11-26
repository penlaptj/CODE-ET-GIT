public class StockManager {

    /**
     * cette fonction détermine si il faut ajouter ou retirer le stock 
     * @param typeOperation: donne le libellé de l'opération a effectuer sur les produits
     * @param produit: donne le nom du produit
     * @param quantite: donne la quantité de produit a retirer ou a rajouter
     * @param stock: donne la quantite de produit en stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch(typeOperation){
            
            case "ajout":
                ajoutStock(produit,stock);

            case "retrait":
                retraitStock(produit,stock);
            
            //action inconnue
            default:
                System.out.println("Opération inconnue.");
                
        }
    }

    /**
     * ajout du stock
     * @param produit: donne le nom du produit
     * @param quantite: donne la quantité de produit a rajouter
     * @param stock: donne la quantite de produit en stock 
     */
    public void ajoutStock(string produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * retrait du stock
     * @param produit: donne le nom du produit
     * @param quantite: donne la quantité de produit a retirer
     * @param stock: donne la quantite de produit en stock
     */
    public void retraitStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
    }
}

    
