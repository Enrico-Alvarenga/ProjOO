public class ExternalMapAdapter implements MapService {
    private LegacyMapProvider legacy;

    public ExternalMapAdapter(LegacyMapProvider legacy) {
        this.legacy = legacy;
    }

    public String getRoute(String from, String to) {
        return legacy.getRoute(from, to);
    }
}
