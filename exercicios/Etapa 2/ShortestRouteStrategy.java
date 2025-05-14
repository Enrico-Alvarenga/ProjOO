public class ShortestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, TransportMode transport) {
        return new Route(origin, destination, 30, 8, 4, 1.5);
    }
}
