public class ShortestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, String transportType, String weather, String traffic) {
        return new Route(origin, destination, 30, 7.5, 6.0, 1.5);
    }
}
