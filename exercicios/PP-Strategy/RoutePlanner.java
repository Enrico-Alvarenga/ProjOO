public class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Route planRoute(String origin, String destination, String transportType, String weather, String traffic) {
        if (strategy == null) throw new IllegalStateException("Estratégia de rota não definida.");
        return strategy.calculateRoute(origin, destination, transportType, weather, traffic);
    }
}
