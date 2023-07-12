package app.Rewards;

import app.ItemFabric;
import app.iGameItem;

public class GemGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
