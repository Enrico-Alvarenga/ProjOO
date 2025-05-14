public class EconomicRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, TransportMode transport) {
        return new Route(origin, destination, 40, 10, 2.5, 2);
    }
}
