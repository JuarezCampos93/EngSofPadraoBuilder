package padroesCriacao.builder;

public class AvaliacaoBuilder {

    private Avaliacao avaliacao;
    public AvaliacaoBuilder(){
        avaliacao = new Avaliacao();
    }

    public Avaliacao build(){
        if(avaliacao.getCodAluno() == -1){
            throw new IllegalArgumentException("Codigo padrao");
        }
        if(avaliacao.getCodAluno() < -1){
            throw new IllegalArgumentException("Codigo incorreto");
        }
        return avaliacao;
    }

    public AvaliacaoBuilder setCodAluno(int codAluno){
        avaliacao.setCodAluno(codAluno);
        return this;
    }

    public AvaliacaoBuilder setMeta(String meta) {
        avaliacao.setMeta(meta);
        return this;
    }

    public AvaliacaoBuilder setAltura(int altura) {
        avaliacao.setAltura(altura);
        return this;
    }

    public AvaliacaoBuilder setPeso(float peso) {
        avaliacao.setPeso(peso);
        return this;
    }

    public AvaliacaoBuilder setImc(float imc) {
        avaliacao.setImc(imc);
        return this;
    }

    public AvaliacaoBuilder setMassaMagra(float massaMagra) {
        avaliacao.setMassaMagra(massaMagra);
        return this;
    }

    public AvaliacaoBuilder setMassaGorda(float massaGorda) {
        avaliacao.setMassaGorda(massaGorda);
        return this;
    }

    public AvaliacaoBuilder setOmbro(float ombro) {
        avaliacao.setOmbro(ombro);
        return this;
    }

    public AvaliacaoBuilder setPeitoral(float peitoral) {
        avaliacao.setPeitoral(peitoral);
        return this;
    }

    public AvaliacaoBuilder setCintura(float cintura) {
        this.setCintura(cintura);
        return this;
    }

    public AvaliacaoBuilder setAbdomen(float abdomen) {
        this.setAbdomen(abdomen);
        return this;
    }

    public AvaliacaoBuilder setCoxaDir(float coxaDir) {
        this.setCoxaDir(coxaDir);
        return this;
    }

    public AvaliacaoBuilder setCoxaEs(float coxaEs) {
        this.setCoxaEs(coxaEs);
        return this;
    }

    public AvaliacaoBuilder setPanturrilhaDir(float panturrilhaDir) {
        this.setPanturrilhaDir(panturrilhaDir);
        return this;
    }

    public AvaliacaoBuilder setPanturrilhaEs(float panturrilhaEs) {
        this.setCoxaEs(panturrilhaEs);
        return this;
    }
}
