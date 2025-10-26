public abstract class ChannelDecorator implements Channel {
    protected Channel decoratedChannel;

    public ChannelDecorator(Channel channel) {
        this.decoratedChannel = channel;
    }

    public void send(String message) {
        decoratedChannel.send(message);
    }

    public void receive() {
        decoratedChannel.receive();
    }
}
