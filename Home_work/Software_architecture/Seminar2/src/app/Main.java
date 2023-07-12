package app;

import app.Rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        ItemFabric generator = new GoldGenerator();
//        generator.openReward();
//        generator = new GemGenerator();
//        generator.openReward();
//        generator = new CrystalGenerator();
//        generator.openReward();
//        generator = new SilverGenerator();
//        generator.openReward();
//        generator = new BronzeGenerator();
//        generator.openReward();
//        generator = new PlatinumGenerator();
//        generator.openReward();
//        generator = new SapphireGenerator();
//        generator.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new CrystalGenerator());
        fabricList.add(new SilverGenerator());
        fabricList.add(new BronzeGenerator());
        fabricList.add(new PlatinumGenerator());
        fabricList.add(new SapphireGenerator());

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int index = random.nextInt(fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}