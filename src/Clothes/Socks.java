package Clothes;

import Clothes.ClothesAbstract;
import People.PersonInterface;

public class Socks extends ClothesAbstract {
    public Socks(PersonInterface owner, TypeEnum type) {
        super(owner, type);
    }
}
