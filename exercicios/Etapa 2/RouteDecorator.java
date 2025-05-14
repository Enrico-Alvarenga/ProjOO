public abstract class RouteDecorator extends Route {
    protected Route decorated;

    public RouteDecorator(Route base) {
        super(base.origin, base.destination, base.estimatedTime, base.distance, base.cost, base.carbonEmission);
        this.decorated = base;
    }

    @Override
    public void display() {
        decorated.display();
    }
}
