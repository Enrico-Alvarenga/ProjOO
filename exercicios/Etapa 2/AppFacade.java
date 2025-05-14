public class AppFacade {
    private RoutePlanner planner;
    private RouteService routeService;
    private SettingsManager config;

    public AppFacade(RoutePlanner planner, RouteService routeService, SettingsManager config) {
        this.planner = planner;
        this.routeService = routeService;
        this.config = config;
    }

    public void showRouteWithEnhancements(String origin, String destination, String transportType) {
        TransportFactory factory = new TransportFactory();
        TransportMode mode = factory.create(transportType);

        Route route = routeService.getRoute(origin, destination, mode);
        planner.setStrategy(new EcoFriendlyStrategy());
        Route plannedRoute = planner.planRoute(origin, destination, mode);

        Route enhanced = new TouristInfoDecorator(new SafetyAlertDecorator(plannedRoute));
        enhanced.display();
    }
}
