public class TransportFactory {
    public TransportMode create(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            default -> throw new IllegalArgumentException("Tipo de transporte desconhecido");
        };
    }
}
