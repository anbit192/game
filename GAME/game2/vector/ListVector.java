package vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        /* TODO */
        this.data = data;
    }

    @Override
    public void append(double value) {
        /* TODO */
        this.data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
        this.data.add(index, value);
    }

    @Override
    public void remove(int index) {
        /* TODO */
        this.data.remove(index);
    }

    @Override
    public int length() {
        /* TODO */
        return this.data.size();

    }

    @Override
    public double magnitude() {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < this.data.size(); i++) {
            sum += Math.pow(this.data.get(i), 2);
        }

        return Math.sqrt(sum);
    }

    public double distanceTo(ListVector another) {
        /* TODO */
        double sum = 0;

        for (int i = 0; i < this.data.size(); i++) {
            sum += (Math.pow(this.data.get(i) - another.data.get(i), 2));
        }

        return Math.sqrt(sum);

    }

    @Override
    public double[] elements() {
        /* TODO */
        double[] array = new double[this.data.size()];

        for (int i = 0; i < this.data.size(); i++) {
            array[i] = this.data.get(i);
        }

        return array;
    }

    public double element(int index) {
        /* TODO */
        return this.data.get(index);
    }

    public ListVector minus(ListVector another) {
        /* TODO */
        List<Double> newData = new ArrayList<>();

        for (int i = 0; i < this.data.size(); i++) {
            double element = this.data.get(i) - another.data.get(i);
            newData.add(element);
        }

        return new ListVector(newData);

    }

    public ListVector plus(ListVector another) {
        /* TODO */
        List<Double> newData = new ArrayList<>();

        for (int i = 0; i < this.data.size(); i++) {
            double element = this.data.get(i) + another.data.get(i);
            newData.add(element);
        }

        return new ListVector(newData);

    }

    public ListVector scale(double factor) {
        /* TODO */

        List<Double> newData = new ArrayList<>();
        for (int i = 0; i < this.data.size(); i++) {
            double element = this.data.get(i) * factor;
            newData.add(element);
        }

        return new ListVector(newData);
    }

    public double dot(ListVector another) {
        /* TODO */
        double sum = 0;

        for (int i = 0; i < this.data.size(); i++) {
            sum += (this.data.get(i) * another.data.get(i));
        }

        return sum;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.data.size(); i++) {
            if (i == this.data.size() - 1) {
                sb.append(this.data.get(i));
            }
            else {
                sb.append(this.data.get(i)).append(" ,");
            }
        }

        sb.append(" ]");

        return sb.toString();
    }
}
