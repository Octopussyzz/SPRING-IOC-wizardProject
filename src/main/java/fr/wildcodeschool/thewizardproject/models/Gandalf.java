package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    @Override
    public String giveAdvice() {
        return "YOU SHOULD NOT PASSSS!";
    }

    @Override
    public String changeDress() {
        return Outfit.whichDress();
    }
}
