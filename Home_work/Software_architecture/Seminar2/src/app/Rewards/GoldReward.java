package app.Rewards;

import app.iGameItem;

public class GoldReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gold");
    }
}
