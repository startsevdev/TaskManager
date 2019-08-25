package Model.Exceptions;


public class EmptyStorageException extends Exception {
    public String getMessage() {
        return "You don't have tasks. Use [c] for create";
    }
}
