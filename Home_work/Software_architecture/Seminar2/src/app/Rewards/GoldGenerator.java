package app.Rewards;

import app.ItemFabric;
import app.iGameItem;

public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
