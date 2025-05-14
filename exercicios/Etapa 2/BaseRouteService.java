public class BaseRouteService implements RouteService {
    private MapService mapService;

    public BaseRouteService(MapService mapService) {
        this.mapService = mapService;
    }

    public Route getRoute(String origin, String destination, TransportMode transport) {
        System.out.println(mapService.getRoute(origin, destination));
        return new Route(origin, destination, 30, 10, 5, 1);
    }
}
