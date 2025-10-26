public class Teste3 {
    private Channel ch;
    private ChannelFactory factory;
    
    public Teste3() {
        // Usa factory UDP (alternativa)
        factory = new UDPChannelFactory();
        ch = factory.create();
    }

    public void getMessage() {
        this.ch.getMessage();
    }
}