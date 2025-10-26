public class TCPChannellFactory extends ChannelFactory {
    
    @Override
    public Channel create() {
        return new TCPChannel();
    }
}