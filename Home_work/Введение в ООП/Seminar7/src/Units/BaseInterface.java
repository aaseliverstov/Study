package Units;

import java.util.ArrayList;

public interface BaseInterface {
    void step(ArrayList<BaseHero> heroList1, ArrayList<BaseHero> heroList2);

    String getInfo();
}
