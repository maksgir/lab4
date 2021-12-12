package Clothes;

import People.PersonInterface;

public abstract class ClothesAbstract {
    private PersonInterface owner;
    private TypeEnum type;
    private boolean isHanged;

    public ClothesAbstract(PersonInterface owner, TypeEnum type){
        this.owner = owner;
        this.type = type;
        isHanged = false;
    }

    public void dry(){
        isHanged = true;
    }

    public PersonInterface getOwner(){
        return owner;
    }

    public String getType(){
        return type.toString();
    }
}
