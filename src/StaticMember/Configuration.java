package StaticMember;

public class Configuration {
    private static String configValue;

    static {
        configValue = "127.1.1.1.1";
        System.out.println("Static Block Executed: ConfigValue Initialized");
    }

    public static void main(String[] args) {
        System.out.println(configValue);
    }
}