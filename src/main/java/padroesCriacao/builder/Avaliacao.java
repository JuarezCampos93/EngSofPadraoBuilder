package padroesCriacao.builder;

public class Avaliacao {

    private int codAluno;
    private String meta;
    private int altura;
    private float peso;
    private float imc;
    private float massaMagra;
    private float massaGorda;
    private float ombro;
    private float peitoral;
    private float cintura;
    private float abdomen;
    private float coxaDir;
    private float coxaEs;
    private float panturrilhaDir;
    private float panturrilhaEs;

    public Avaliacao(){
        this.codAluno = -1;
    }

    public int getCodAluno(){
        return this.codAluno;
    }

    public void setCodAluno(int codAluno){
        this.codAluno = codAluno;
    }

    public String getMeta() {
        return this.meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImc() {
        return this.imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public float getMassaMagra() {
        return this.massaMagra;
    }

    public void setMassaMagra(float massaMagra) {
        this.massaMagra = massaMagra;
    }

    public float getMassaGorda() {
        return this.massaGorda;
    }

    public void setMassaGorda(float massaGorda) {
        this.massaGorda = massaGorda;
    }

    public float getOmbro() {
        return this.ombro;
    }

    public void setOmbro(float ombro) {
        this.ombro = ombro;
    }

    public float getPeitoral() {
        return this.peitoral;
    }

    public void setPeitoral(float peitoral) {
        this.peitoral = peitoral;
    }

    public float getCintura() {
        return this.cintura;
    }

    public void setCintura(float cintura) {
        this.cintura = cintura;
    }

    public float getAbdomen() {
        return this.abdomen;
    }

    public void setAbdomen(float abdomen) {
        this.abdomen = abdomen;
    }

    public float getCoxaDir() {
        return this.coxaDir;
    }

    public void setCoxaDir(float coxaDir) {
        this.coxaDir = coxaDir;
    }

    public float getCoxaEs() {
        return this.coxaEs;
    }

    public void setCoxaEs(float coxaEs) {
        this.coxaEs = coxaEs;
    }

    public float getPanturrilhaDir() {
        return this.panturrilhaDir;
    }

    public void setPanturrilhaDir(float panturrilhaDir) {
        this.panturrilhaDir = panturrilhaDir;
    }

    public float getPanturrilhaEs() {
        return this.panturrilhaEs;
    }

    public void setPanturrilhaEs(float panturrilhaEs) {
        this.panturrilhaEs = panturrilhaEs;
    }
}
