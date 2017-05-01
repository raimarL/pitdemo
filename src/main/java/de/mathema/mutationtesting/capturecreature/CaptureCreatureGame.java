package de.mathema.mutationtesting.capturecreature;

/**
 * Created by rai on 25.04.17.
 */
public class CaptureCreatureGame {

    /**
     * Methode wird beim Kampf gegen eine Kreatur aufgerufen.
     *
     * @return true, falls Kreatur besiegt
     *         false, falls Kreatur entkommt
     */
    public boolean captureCreature(Weapon weapon, Creature creature) {

        int catchValue = creature.getCatchValue();
        int damage = weapon.getDamage();
        int hp = creature.getActualHP();
        CreatureStatus status = creature.getStatus();

        WeaponTypeEnum ballType = weapon.getType();
        if(ballType == WeaponTypeEnum.HYPER) {
            catchValue -= 30;
        }
        else if(ballType == WeaponTypeEnum.SUPER) {
            catchValue -= 20;
        }
        else {
            catchValue -= 10;
        }

        if(catchValue <= 0 || status == CreatureStatus.FROZEN) {
            // creature was too weak...
            return true;
        }

        hp -= damage * (status == CreatureStatus.POISONED ? 2 : 1);
        if (hp <= 0) {
            // creature defeated
            return true;
        }

        // creature escaped
        return false;
    }
}
