public class BufferChannel extends ChannelDecorator {
    public BufferChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Armazenando mensagem em buffer...");
        super.send(message);
    }
}
