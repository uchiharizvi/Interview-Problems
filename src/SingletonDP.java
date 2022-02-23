public class SingletonDP {
    /**
     * Public Instance Initialized when loading the class
     **/
    private static final SingletonDP instance = new SingletonDP();

    private SingletonDP() {
        /**Private Constructor**/
    }

    public static SingletonDP getInstance() {
        return instance;
    }
}
