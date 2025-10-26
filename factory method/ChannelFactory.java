public abstract class ChannelFactory {
    
    public abstract Channel create();
    
    public static ChannelFactory getFactory(String type) {
        if (type.equalsIgnoreCase("UDP")) {
            return new UDPChannelFactory();
        } else if (type.equalsIgnoreCase("TCP")) {
            return new TCPChannellFactory();
        } else {
            throw new IllegalArgumentException("Tipo inválido: " + type);
        }
    }
}