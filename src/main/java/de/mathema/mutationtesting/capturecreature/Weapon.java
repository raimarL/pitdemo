package de.mathema.mutationtesting.capturecreature;

/**
 * Created by rai on 25.04.17.
 */
public class Weapon {

    private WeaponTypeEnum type;
    private  int damage;

    public Weapon(WeaponTypeEnum type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public WeaponTypeEnum getType() {
        return type;
    }

    public void setType(WeaponTypeEnum type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
