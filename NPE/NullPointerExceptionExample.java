import java.util.Optional;

public class NullPointerExceptionExample{
    public static void main(String[] args)
    {
        Optional<String> op=Optional.empty();

        String temp = op.get();
    }
}
