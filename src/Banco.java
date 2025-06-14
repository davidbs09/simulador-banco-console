public class Banco {

    private String nomeBanco;
    private String agencia;
    private boolean entradaValida;

    public boolean selecionarBanco(int escolhaDoUsuario) {
        boolean selecaoBemSucedida = false;

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Banco selecionado: Itaú \n" +
                        "O número da sua agência é: 001");
                setNomeBanco("Itaú");
                selecaoBemSucedida = true;
                break;
            case 2:
                System.out.println("Banco selecionado: Santander \n" +
                        "Essa é sua agência 002");
                setNomeBanco("Santander");
                selecaoBemSucedida = true;
                break;
            case 3:
                System.out.println("Banco selecionado: Bradesco \n" +
                        "Essa é sua agência 003");
                setNomeBanco("Bradesco");
                selecaoBemSucedida = true;
                break;
            case 4:
                System.out.println("Banco selecionado: Caixa \n" +
                        "Essa é sua agência 004");
                setNomeBanco("Caixa");
                selecaoBemSucedida = true;
                break;
            case 5:
                System.out.println("Banco selecionado: Banco do Brasil \n" +
                        "Essa é sua agência 005");
                setNomeBanco("Banco do Brasil");
                selecaoBemSucedida = true;
                break;
            default:
                System.out.println("Opção de banco inválida. Tente novamente.");
                selecaoBemSucedida = false;
                break;
        }
        return selecaoBemSucedida;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEntradaValida() {
        return entradaValida;
    }

    public void setEntradaValida(boolean entradaValida) {
        this.entradaValida = entradaValida;
    }
}
