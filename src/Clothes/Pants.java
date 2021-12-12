package Clothes;

import Clothes.ClothesAbstract;
import People.PersonInterface;

public class Pants extends ClothesAbstract {
    public Pants(PersonInterface owner, TypeEnum type) {
        super(owner, type);
    }
}
