public class EcoFriendlyStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, TransportMode transport) {
        return new Route(origin, destination, 45, 11, 3, 0.5);
    }
}
