public class Teste1 {
    private Channel ch;
    private ChannelFactory factory;
    
    public Teste1() {
        // Usa factory UDP
        factory = ChannelFactory.getFactory("UDP");
        ch = factory.create();
    }

    public void getMessage() {
        this.ch.getMessage();
    }
}
