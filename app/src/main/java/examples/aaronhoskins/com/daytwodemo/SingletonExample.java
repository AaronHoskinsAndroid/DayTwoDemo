package examples.aaronhoskins.com.daytwodemo;

public class SingletonExample {
    private String initializingId;
    private String currentValue;
    private static SingletonExample singletonExample;

    public static SingletonExample getInstance(String initializingId){
        if(singletonExample == null ) {
            singletonExample = new SingletonExample(initializingId);
        }
        return singletonExample;
    }

    private SingletonExample(String initializingId) {
        this.initializingId = initializingId;
    }
}
