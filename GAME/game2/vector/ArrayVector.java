package vector;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
        data = new double[1];
    }

    public ArrayVector(double[] coefficients) {
        /* TODO */
        this.data = coefficients;
    }

    /*
     * Hàm tăng số phần tử của mảng lên gấp đôi.
     * Do mảng không thay đổi được số phần tử sau khi đã cấp phát, nên để tăng
     * số phần tử của mảng, cần phải cấp phát lại mảng khác có số phần tử gấp đôi,
     * sau đó copy những phần tử của mảng cũ sang mảng mới.
     */
    private void extend() {
        /* TODO */
        double[] newArray = new double[this.data.length * 2];
        System.arraycopy(this.data, 0, newArray, 0, this.data.length);

        this.data = newArray;
    }

    /*
     * Hàm thêm một phần tử vào cuối vector.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void append(double value) {
        /* TODO */
        if (this.length == this.data.length) {
            this.extend();
        }
        this.data[length + 1] = value;
        this.length++;
    }

    /*
     * Hàm thêm một phần tử vào vector ở vị trí index.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index == length - 1) {
            this.append(value);
        } else {
            double[] newData = new double[this.data.length + 1];
            for (int i = 0; i < index; i++) {
                newData[i] = this.data[i];
            }
            for (int i = index + 1; i < newData.length; i++) {
                newData[i] = this.data[i - 1];
            }

            newData[index] = value;

            this.data = newData;
            this.length++;
        }

    }

    /*
     * Hàm xóa một phần tử của vector ở vị trí index.
     */
    @Override
    public void remove(int index) {
        /* TODO */
        double[] newData = new double[this.length - 1];

        for (int i = 0; i < index; i++) {
            newData[i] = this.data[i];
        }
        for (int i = index + 1; i < this.data.length; i++) {
            newData[i - 1] = this.data[i];
        }

        this.data = newData;
        this.length--;
    }

    @Override
    public int length() {
        /* TODO */
        return this.length;
    }

    @Override
    public double magnitude() {
        /* TODO */

        double sum = 0;

        for (int i = 0; i < this.length; i++) {
            sum += Math.pow(this.data[i], 2);
        }

        return Math.sqrt(sum);
    }

    public double distanceTo(ArrayVector another) {
        /* TODO */
        double sum = 0;

        for (int i = 0; i < this.length; i++) {
            sum += Math.pow(this.data[i] - another.data[i],2);
        }

        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        /* TODO */

        double[] array = new double[this.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = this.data[i];
        }

        return array;
    }

    @Override
    public double element(int index) {
        /* TODO */
        return this.data[index];
    }

    public ArrayVector minus(ArrayVector another) {
        /* TODO */
        double[] newData = new double[this.data.length];

        for (int i = 0; i < this.data.length; i++) {
            double element = this.data[i] - another.data[i];
            newData[i] = element;
        }

        return new ArrayVector(newData);
    }

    public ArrayVector plus(ArrayVector another) {
        /* TODO */
        double[] newData = new double[this.data.length];

        for (int i = 0; i < this.data.length; i++) {
            double element = this.data[i] + another.data[i];
            newData[i] = element;
        }

        return new ArrayVector(newData);
    }

    public ArrayVector scale(double factor) {
        /* TODO */
        double[] newData = new double[this.data.length];

        for (int i = 0; i < this.data.length; i++) {
            double element = this.data[i] * factor;
            newData[i] = element;
        }

        return new ArrayVector(newData);
    }

    public double dot(ArrayVector another) {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < this.data.length; i++) {
            sum += (this.data[i] * another.data[i]);
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
        for (int i = 0; i < this.length; i++) {
            if (i == this.length - 1) {
                sb.append(this.data[i]);
            }

            sb.append(this.data[i]).append(" ,");
        }

        sb.append(" ]");

        return sb.toString();
    }
}
