package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

import java.util.List;

public class Camera {
    public List<Point3D> location;
    public List<Angle3D> angle;

    public Camera(List<Point3D> location, List<Angle3D> angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate(List<Angle3D> angel){

    }

    public void Move(List<Point3D> point){

    }
}
