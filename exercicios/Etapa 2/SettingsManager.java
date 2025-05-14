public class SettingsManager {
    private static volatile SettingsManager instance;
    private String preferredTransport;

    private SettingsManager() {}

    public static SettingsManager getInstance() {
        if (instance == null) {
            synchronized (SettingsManager.class) {
                if (instance == null) {
                    instance = new SettingsManager();
                }
            }
        }
        return instance;
    }

    public String getPreferredTransport() { return preferredTransport; }
    public void setPreferredTransport(String transport) { this.preferredTransport = transport; }
}
