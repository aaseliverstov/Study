package app.Rewards;

import app.ItemFabric;
import app.iGameItem;

public class SilverGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
