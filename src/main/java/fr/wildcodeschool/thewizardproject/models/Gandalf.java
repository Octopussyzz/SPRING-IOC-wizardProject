package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private Outfit outfit;

    public Gandalf(Outfit outfit) {
        this.outfit = outfit;
    }

    @Override
    public String giveAdvice() {
        return "YOU SHOULD NOT PASSSS!";
    }

    @Override
    public String changeDress() {
        return outfit.whichDress();
    }
}
