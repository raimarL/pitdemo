package de.mathema.mutationtesting.capturecreature;

/**
 * Created by rai on 25.04.17.
 */
public class Creature {

    private CreatureStatus status; // NORMAL, POISONED, FROZEN
    private int catchValue; // [0, 100]
    private int actualHP; // [0, 100]

    public Creature(CreatureStatus status, int catchValue, int actualHP) {
        this.status = status;
        this.catchValue = catchValue;
        this.actualHP = actualHP;
    }

    public CreatureStatus getStatus() {
        return status;
    }

    public void setStatus(CreatureStatus status) {
        this.status = status;
    }

    public int getActualHP() {
        return actualHP;
    }

    public void setActualHP(int actualHP) {
        this.actualHP = actualHP;
    }

    public int getCatchValue() {
        return catchValue;
    }

    public void setCatchValue(int catchValue) {
        this.catchValue = catchValue;
    }
}
