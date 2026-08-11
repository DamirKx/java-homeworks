package exceptions.task4;

public class LimitException extends RuntimeException{
    private int attempts;
    public LimitException(String message, int attempts){
        super(message);
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }
}
