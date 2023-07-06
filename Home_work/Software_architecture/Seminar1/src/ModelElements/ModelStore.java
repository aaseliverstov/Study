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

    public ModelStore(List<Point3D> points, List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras, List<iModelChangedObserver> changeObservers) {
        this.points = points;
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changeObservers = changeObservers;
    }

    public Scene GetScene(int n){
        return null;
    }

    @Override
    public void notifyChange(iModelChanger sender) {

    }

}
