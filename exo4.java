package exopro1;
public class exo4 {

    public static void main(String[] args) {

        String[] tab = new String [10];// Déclaration d'un tableau de 10 String
        int comptGmail = 0, comptOrange = 0,comptHotmail= 0, comptFree = 0; //Initialisation des compteurs de comptes mails

        tab[0] = "jaune@gmail.com";    
        tab[1] = "bleu@orange.com";
        tab[2] = "vert@gmail.com";
        tab[3] = "violet@hotmail.com";
        tab[4] = "rouge@gmail.com";                        //Tableau rempli 
        tab[5] = "noir@free.com";
        tab[6] = "orange@hotmail.com";
        tab[7] = "blanc@orange.com";
        tab[8] = "rose@gmail.com";
        tab[9] = "gris@free.com";

        for (int i = 0; i < tab.length; i++) {
            //System.out.println(tab[i].substring(tab[i].indexOf("@")));
        	int indexAro= tab[i].indexOf("@");
        	int indexpoint= tab[i].indexOf(".");
            switch (tab[i].substring(tab[i].indexOf("@"))) {
            case "@gmail.com":comptGmail++;
            break;
            case"@orange.com":comptOrange++;
            break;
            case "@hotmail.com":comptHotmail++;
            break;
            case"@free.com":comptFree++;
            break;
            }
        }
        System.out.println("Il y a " + comptGmail + " comptes Gmail ");
        System.out.println("Il y a " + comptOrange + " comptes Orange");
        System.out.println("Il y a " + comptHotmail + " comptes Hotmail");
        System.out.println("Il y a " + comptFree + " comptes Free");
    }
}