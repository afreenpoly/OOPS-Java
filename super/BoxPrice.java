
public class BoxPrice extends BoxWeight {

    double cost;
    public BoxPrice(double cost, double l, double b, double h, double weight ) {
        super(l, b, h, weight);
        this.cost = cost;
    }

}
