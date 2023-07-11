package app.Rewards;

import app.ItemFabric;
import app.iGameItem;

public class SapphireGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new SapphireReward();
    }
}
