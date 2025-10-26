public class LogChannel extends ChannelDecorator {
    public LogChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Registrando log do envio...");
        super.send(message);
    }

    @Override
    public void receive() {
        super.receive();
        System.out.println("Registrando log da recepção...");
    }
}
