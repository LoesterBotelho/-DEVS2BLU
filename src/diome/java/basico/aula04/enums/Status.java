package diome.java.basico.aula04.enums;

public enum Status {
    ATIVO(0),
    INATIVO(1),
    BLOQUEADO(2),
    DELETADO(3); 

    private final int codigo;

    Status(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static Status fromCodigo(int codigo) {
        for (Status status : Status.values()) {
            if (status.getCodigo() == codigo) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }
}
