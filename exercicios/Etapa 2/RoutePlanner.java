public class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Route planRoute(String origin, String destination, TransportMode transport) {
        return strategy.calculateRoute(origin, destination, transport);
    }
}
