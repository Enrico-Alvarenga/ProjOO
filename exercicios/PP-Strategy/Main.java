public class Main {
    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();

        planner.setStrategy(new FastestRouteStrategy());
        System.out.println("[Estratégia: Mais rápida]");
        planner.planRoute("Av. Paulista", "USP", "Carro", "Sol", "Moderado").display();

        planner.setStrategy(new ShortestRouteStrategy());
        System.out.println("[Estratégia: Mais curta]");
        planner.planRoute("Av. Paulista", "USP", "Bicicleta", "Nublado", "Leve").display();

        planner.setStrategy(new EconomicRouteStrategy());
        System.out.println("[Estratégia: Mais econômica]");
        planner.planRoute("Av. Paulista", "USP", "Ônibus", "Chuva", "Intenso").display();

        planner.setStrategy(new EcoFriendlyStrategy());
        System.out.println("[Estratégia: Mais ecológica]");
        planner.planRoute("Av. Paulista", "USP", "A pé", "Sol", "Leve").display();
    }
}
