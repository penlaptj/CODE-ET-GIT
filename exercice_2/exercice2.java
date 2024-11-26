/**
 * Affiche notes et moyennes
 */
public class GestionnaireNotes {

    
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        afficheNotes(nomEtudiant);
        // Calcul de la somme des notes
        int somme=calculSommeNotes(notes);
        // Affichage de la moyenne
        afficheMoyenne(somme,notes);
    }
}

/**
 * Affiche notes 
 * */
public void afficheNotes(nomEtudiant) {
    System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
}

/**
 * Calcul somme des notes
 * @return: la sommes des notes
 */
public int calculSommeNotes(int[] notes) {
    int somme = 0;
        for (int note : notes) {
            somme += note;
        }
    return somme;
}

/**
 * Affiche moyennes
 */
public void afficheMoyenne(int somme,int notes) {
    double moyenne = (double) somme / notes.length;
    System.out.println("Moyenne : " + moyenne);
}
