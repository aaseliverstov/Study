package app.Rewards;

import app.iGameItem;

public class SilverReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Silver");
    }
}
