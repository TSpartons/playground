package Message_Builder;

public class MessageBuilder {

    private String name;
    private String welcomeMessage;

    public MessageBuilder (String name, String welcomeMessage)
    {
        this.name = name;
        this.welcomeMessage = welcomeMessage;
    }

    public String welcomeMessageBuilder()
    { return "Hi, " + this.name + " " + this.welcomeMessage;}

}
