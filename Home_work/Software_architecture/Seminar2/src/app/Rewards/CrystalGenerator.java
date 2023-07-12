package app.Rewards;

import app.ItemFabric;
import app.iGameItem;

public class CrystalGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new CrystalReward();
    }
}
