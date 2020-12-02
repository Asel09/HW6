package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon kinjal = new Weapon();
        kinjal.setWeaponType("ostryi");
        kinjal.setWeaponName("KINJAL");
        boss.setWeapon(kinjal);
        boss.setBossHealth(77);
        boss.setBossDamage(19);
        boss.setBossDefence("Physical");

        System.out.println(
                boss.getBossHealth() + "  " +
                        boss.getBossDamage() + "  " +
                        boss.getBossDefence() + "  " +
                        kinjal.getWeaponType() + "  " +
                        kinjal.getWeaponName());

    }
}
