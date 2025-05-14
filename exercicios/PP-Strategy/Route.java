public class Route {
    private String origin;
    private String destination;
    private double estimatedTime;
    private double distance;
    private double cost;
    private double carbonEmission;

    public Route(String origin, String destination, double estimatedTime,
                 double distance, double cost, double carbonEmission) {
        this.origin = origin;
        this.destination = destination;
        this.estimatedTime = estimatedTime;
        this.distance = distance;
        this.cost = cost;
        this.carbonEmission = carbonEmission;
    }

    public void display() {
        System.out.println("Rota de " + origin + " para " + destination);
        System.out.println("Tempo estimado: " + estimatedTime + " min");
        System.out.println("Distância: " + distance + " km");
        System.out.println("Custo: R$ " + cost);
        System.out.println("Emissão de CO2: " + carbonEmission + " kg");
        System.out.println("-------------");
    }
}
