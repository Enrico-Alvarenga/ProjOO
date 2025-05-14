public interface RouteStrategy {
    Route calculateRoute(String origin, String destination, String transportType, String weather, String traffic);
}
