package app.Rewards;

import app.iGameItem;

public class PlatinumReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Platinum");
    }
}
