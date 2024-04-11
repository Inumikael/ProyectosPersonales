/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragnarokonline;

/**
 *
 * @author hecto
 */
public abstract class Character {
    private int str;
    private int agi;
    private int vit;
    private int intel;
    private int dex;
    private int luk;

    public Character() {
    }

    public Character(int str, int agi, int vit, int intel, int dex, int luk) {
        this.str = str;
        this.agi = agi;
        this.vit = vit;
        this.intel = intel;
        this.dex = dex;
        this.luk = luk;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getLuk() {
        return luk;
    }

    public void setLuk(int luk) {
        this.luk = luk;
    }
    abstract void attack();
}
