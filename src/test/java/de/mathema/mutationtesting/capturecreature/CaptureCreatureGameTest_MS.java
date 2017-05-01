package de.mathema.mutationtesting.capturecreature;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rai on 25.04.17.
 */
public class CaptureCreatureGameTest_MS {

    private CaptureCreatureGame captureCreatureGame;

    @Before
    public void init() {
        captureCreatureGame = new CaptureCreatureGame();
    }

    @Test
    public void frozenCreatureIsCaptured() {
        Creature creature = new Creature(CreatureStatus.FROZEN, 100, 100);
        Weapon weapon = new Weapon(WeaponTypeEnum.HYPER, 30);
        Assert.assertEquals(captureCreatureGame.captureCreature(weapon, creature), true);
    }

    @Test
    public void strongCreatureCrappyWeaponIsNotCaptured() {
        Creature creature = new Creature(CreatureStatus.NORMAL, 100, 100);
        Weapon weapon = new Weapon(WeaponTypeEnum.STANDARD, 1);
        Assert.assertEquals(captureCreatureGame.captureCreature(weapon, creature), false);
    }

    @Test
    public void midLevelCreatureStrongWeaponIsCaptured() {
        Creature creature = new Creature(CreatureStatus.NORMAL, 50, 50);
        Weapon weapon = new Weapon(WeaponTypeEnum.SUPER, 100);
        Assert.assertEquals(captureCreatureGame.captureCreature(weapon, creature), true);
    }

    // zu erweitern...

    // Ball != HYPER wurde behoben
    @Test
    public void exactCatchValueHyperIsCaptured() {
        Creature creature = new Creature(CreatureStatus.NORMAL, 30, 100);
        Weapon weapon = new Weapon(WeaponTypeEnum.HYPER, 1);
        Assert.assertEquals(captureCreatureGame.captureCreature(weapon, creature), true);
    }

    // Ball != SUPER wurde behoben
    @Test
    public void exactCatchValueSuperIsCaptured() {
        Creature creature = new Creature(CreatureStatus.NORMAL, 20, 100);
        Weapon weapon = new Weapon(WeaponTypeEnum.SUPER, 1);
        Assert.assertEquals(captureCreatureGame.captureCreature(weapon, creature), true);
    }

    // Ball != STANDARD wurde behoben
    @Test
    public void exactCatchValueStandardIsCaptured() {
        Creature creature = new Creature(CreatureStatus.NORMAL, 10, 100);
        Weapon weapon = new Weapon(WeaponTypeEnum.STANDARD, 1);
        Assert.assertEquals(captureCreatureGame.captureCreature(weapon, creature), true);
    }

    // POISONED
    @Test
    public void testme() {
        Creature creature = new Creature(CreatureStatus.POISONED, 20, 100);
        Weapon weapon = new Weapon(WeaponTypeEnum.STANDARD, 50);
        Assert.assertEquals(captureCreatureGame.captureCreature(weapon, creature), true);
    }
}
