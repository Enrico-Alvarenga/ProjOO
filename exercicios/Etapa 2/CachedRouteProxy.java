import java.util.HashMap;
import java.util.Map;

public class CachedRouteProxy implements RouteService {
    private RouteService realService;
    private Map<String, Route> cache = new HashMap<>();

    public CachedRouteProxy(RouteService realService) {
        this.realService = realService;
    }

    public Route getRoute(String origin, String destination, TransportMode transport) {
        String key = origin + ":" + destination + ":" + transport.getType();
        return cache.computeIfAbsent(key, k -> realService.getRoute(origin, destination, transport));
    }
}
