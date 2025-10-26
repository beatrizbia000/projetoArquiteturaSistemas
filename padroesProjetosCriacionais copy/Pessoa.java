class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    private Pessoa(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.cidade = builder.cidade;
    }

    public static class Builder {
        private String nome;
        private int idade;
        private String cidade;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }

    public void mostrar() {
        System.out.println(nome + ", " + idade + " anos, de " + cidade);
    }
}

