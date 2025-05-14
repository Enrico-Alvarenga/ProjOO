public interface RouteStrategy {
    Route calculateRoute(String origin, String destination, TransportMode transport);
}
