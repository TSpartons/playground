package Message_Builder;

import java.lang.reflect.Constructor;

public class MessagePrinter {

    private  String message;

    public MessagePrinter(String message) { this.message = message; }

    public void getMessage()
    {
        System.out.println(this.message);
    }


}
