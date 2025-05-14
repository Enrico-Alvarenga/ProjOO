public class TouristInfoDecorator extends RouteDecorator {
    public TouristInfoDecorator(Route base) {
        super(base);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("🔍 Ponto turístico incluso.");
    }
}
