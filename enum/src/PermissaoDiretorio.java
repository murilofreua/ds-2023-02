public enum PermissaoDiretorio {

    NENHUMA(0),
    EXECUTAR(1),
    GRAVAR(2),
    GRAVAR_E_EXECUTAR(3),
    LER(4),
    LER_E_EXECUTAR(5),
    LER_E_GRAVAR(6),
    TOTAL(7);

    private final int permissao;

    PermissaoDiretorio(int decimal) {
        permissao = decimal;
    }
}
