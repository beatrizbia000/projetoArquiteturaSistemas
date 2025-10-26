public class Teste2 {
    private Channel ch;
    private ChannelFactory factory;
    
    public Teste2() {
        // Usa factory TCP
        factory = ChannelFactory.getFactory("TCP");
        ch = factory.create();
    }

    public void getMessage() {
        this.ch.getMessage();
    }
}
