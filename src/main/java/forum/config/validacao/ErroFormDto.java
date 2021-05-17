package forum.config.validacao;

public class ErroFormDto {

    private String campo;
    private String erro;

    public ErroFormDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public ErroFormDto() {
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
