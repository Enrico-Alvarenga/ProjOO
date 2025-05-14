public class FastestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, String transportType, String weather, String traffic) {
        return new Route(origin, destination, 25, 10, 7.5, 1.2);
    }
}
