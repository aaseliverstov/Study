package app.Rewards;

import app.iGameItem;

public class CrystalReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Crystal");
    }
}
