package ModelElements;

import Stuff.Angle3D;
import Stuff.Color;
import Stuff.Point3D;

import java.util.List;

public class Flash {
    public List<Point3D> location;
    public List<Angle3D> angle;
    public List<Color> color;
    public float power;

    public Flash(List<Point3D> location, List<Angle3D> angle, List<Color> color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(List<Angle3D> angel){

    }

    public void Move(List<Point3D> point){

    }
}
