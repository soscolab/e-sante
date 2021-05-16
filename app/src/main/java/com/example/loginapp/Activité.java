package e-sante;

import java.util.Set;
import java.util.HashSet;

/**
* @generated
*/
public class Activité {
    
    /**
    * @generated
    */
    private String Titre;
    
    /**
    * @generated
    */
    private String Description;
    
    /**
    * @generated
    */
    private Real Durée;
    
    
    /**
    * @generated
    */
    private Set<Séance> ;
    
    /**
    * @generated
    */
    private Intervenant ;
    
    /**
    * @generated
    */
    private Medecin Attribue;
    
    /**
    * @generated
    */
    private Set<Parcours> ;
    
    /**
    * @generated
    */
    private Structure à lieu;
    
    
    /**
    * @generated
    */
    public String getTitre() {
        return this.Titre;
    }
    
    /**
    * @generated
    */
    public String setTitre(String Titre) {
        this.Titre = Titre;
    }
    
    /**
    * @generated
    */
    public String getDescription() {
        return this.Description;
    }
    
    /**
    * @generated
    */
    public String setDescription(String Description) {
        this.Description = Description;
    }
    
    /**
    * @generated
    */
    public Real getDurée() {
        return this.Durée;
    }
    
    /**
    * @generated
    */
    public Real setDurée(Real Durée) {
        this.Durée = Durée;
    }
    
}
