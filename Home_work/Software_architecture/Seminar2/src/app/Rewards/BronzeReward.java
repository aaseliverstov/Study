package app.Rewards;

import app.iGameItem;

public class BronzeReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Bronze");
    }
}
