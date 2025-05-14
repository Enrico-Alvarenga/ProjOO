public class EconomicRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origin, String destination, String transportType, String weather, String traffic) {
        return new Route(origin, destination, 35, 9, 4.0, 1.8);
    }
}
