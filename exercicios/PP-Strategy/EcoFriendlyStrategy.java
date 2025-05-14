public class EcoFriendlyStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, String transportType, String weather, String traffic) {
        return new Route(origin, destination, 40, 11, 5.0, 0.5);
    }
}
