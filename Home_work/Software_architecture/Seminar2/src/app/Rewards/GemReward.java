package app.Rewards;

import app.iGameItem;

public class GemReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gem");
    }
}
