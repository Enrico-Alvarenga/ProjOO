public class Main {
    public static void main(String[] args) {
        SettingsManager config = SettingsManager.getInstance();
        config.setPreferredTransport("bike");

        TransportFactory factory = new TransportFactory();
        TransportMode transport = factory.create("bike");

        MapService mapService = new ExternalMapAdapter(new LegacyMapProvider());
        RouteService routeService = new CachedRouteProxy(new BaseRouteService(mapService));

        RoutePlanner planner = new RoutePlanner();
        planner.setStrategy(new EcoFriendlyStrategy());

        AppFacade facade = new AppFacade(planner, routeService, config);
        facade.showRouteWithEnhancements("Centro", "Parque Ibirapuera", "bike");
    }
}

