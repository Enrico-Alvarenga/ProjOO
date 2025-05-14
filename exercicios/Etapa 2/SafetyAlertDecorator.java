public class SafetyAlertDecorator extends RouteDecorator {
    public SafetyAlertDecorator(Route base) {
        super(base);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Alerta de segurança incluído.");
    }
}
