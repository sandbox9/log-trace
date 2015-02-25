package fury.marvel.trinity.stack.info.marshall;

/**
 * Created by poets11 on 15. 2. 24..
 */
public class MarshallerFactory {
    private static Marshaller marshaller = new JsonSimpleMarshaller();
    
    public static Marshaller getMarshaller() {
        return marshaller;
    }
}
