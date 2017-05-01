package de.mathema.mutationtesting.capturecreature;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rai on 25.04.17.
 */
public class CaptureCreatureGameTest {

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

    // um Tests erweitern...
}
