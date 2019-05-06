package fr.eftl.agencevoyages.prix;

public class CalculPrixBillet {
    private Integer prixUnitaire;
    private String classe;

    public Integer getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Integer prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer calculer(String depart, String arrivee, String classe) {
        CalculPrixUnitaire prixUnitaire = new CalculPrixUnitaire(depart, arrivee);
        Integer varPrixUnitaire = prixUnitaire.generer();

        switch ( classe ) {
            case "eco":
                return varPrixUnitaire;
            break;

            case "premiere":
                return varPrixUnitaire * 2;
            break;

            case "business":
                return varPrixUnitaire * 2 + 300;
            break;

            default:
                return varPrixUnitaire;
            break;
        }
    }

}
