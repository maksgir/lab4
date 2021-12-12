package Clothes;

import Clothes.ClothesAbstract;
import People.PersonInterface;

public class Sneakers extends ClothesAbstract {
    public Sneakers(PersonInterface owner, TypeEnum type) {
        super(owner, type);
    }
}
