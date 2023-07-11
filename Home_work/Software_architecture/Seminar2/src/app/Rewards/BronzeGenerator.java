package app.Rewards;

import app.ItemFabric;
import app.iGameItem;

public class BronzeGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new BronzeReward();
    }
}
