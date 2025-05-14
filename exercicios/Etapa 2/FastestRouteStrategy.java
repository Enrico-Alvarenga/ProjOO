public class FastestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, TransportMode transport) {
        return new Route(origin, destination, 20, 12, 6, 1);
    }
}
