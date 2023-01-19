package az.autobazar.client;

public class ResourceNotFound extends RuntimeException {

    public ResourceNotFound(String message) {
        super(message);
    }
}
