package com.greenfox.exams.java.retake;

/**
 * Created by Rita on 2016.12.15..
 */
public abstract class Aircraft {
    private int currentAmmo;

    public Aircraft() {
        currentAmmo = 0;
    }

    public abstract int getbaseDamage();

    public abstract int getmaxAmmo();

    public int fight() {
        int damage = currentAmmo * getbaseDamage();
        currentAmmo = 0;
        return damage;
    }

    public int refill(int fillingAmmo) {
        int ammoNeeded = getmaxAmmo() - currentAmmo;
        if (ammoNeeded >= fillingAmmo) {
            currentAmmo += fillingAmmo;
            return 0;
        } else {
            currentAmmo = getmaxAmmo();
            return fillingAmmo - ammoNeeded;
        }
    }

    public int getAllDamage(){
        return getbaseDamage()*getmaxAmmo();
    }

    @Override
    public String toString() {
        return "Type " + getClass().getSimpleName() + ", Ammo: " + currentAmmo +
                ", BaseDamage: " + getbaseDamage() + ", All damage: " + getAllDamage();
    }
}
