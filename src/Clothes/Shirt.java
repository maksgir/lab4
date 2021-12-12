package Clothes;

import Clothes.ClothesAbstract;
import People.PersonInterface;

public class Shirt extends ClothesAbstract {
    public Shirt(PersonInterface owner, TypeEnum type) {
        super(owner, type);
    }
}
