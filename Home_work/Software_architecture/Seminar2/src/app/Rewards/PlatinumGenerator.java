package app.Rewards;

import app.ItemFabric;
import app.iGameItem;

public class PlatinumGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new PlatinumReward();
    }
}
