package ModelElements;

import InMemoryModel.iModelChangedObserver;
import InMemoryModel.iModelChanger;
import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements iModelChanger{
    public List<Point3D> points = new ArrayList<>();
    public List<PoligonalModel> models = new ArrayList<>();
    public List<Scene> scenes = new ArrayList<>();
    public List<Flash> flashes = new ArrayList<>();
    public List<Camera> cameras = new ArrayList<>();
    private List<iModelChangedObserver> changeObservers;

    public ModelStore(List<iModelChangedObserver> changeObservers) {
        this.changeObservers = changeObservers;
    }

    public Scene GetScene(int ID){
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == ID) {
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void notifyChange(iModelChanger sender) {

    }
}
