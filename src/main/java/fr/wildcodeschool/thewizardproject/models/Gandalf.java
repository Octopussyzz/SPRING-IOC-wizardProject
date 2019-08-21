package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gandalf implements WizardInterface {

    private Outfit outfit;

    @Autowired
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
