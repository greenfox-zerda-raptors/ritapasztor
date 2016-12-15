package com.greenfox.exams.java.retake;

/**
 * Created by Rita on 2016.12.14..
 */
public class Aircraft {
    String type;
    int ammo = 0;
    int damage;
    int allDamage;
    int maxAmmo;

    public Aircraft() {
        allDamage = ammo * damage;
    }

    public Aircraft(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format("Type s%, Ammo: d%, Base Damage: d%," +
                        " All Damage: d%",
                type,
                ammo,
                damage,
                allDamage);

    }
}
