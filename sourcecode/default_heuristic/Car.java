package hadzakee;

import java.util.ArrayList;
import java.util.List;

public class Car {
    int n;
    List<Street> path = new ArrayList<>();

    public Car(int n, List<Street> path) {
        this.n = n;
        this.path = path;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public List<Street> getPath() {
        return path;
    }

    public void setPath(List<Street> path) {
        this.path = path;
    }
}
