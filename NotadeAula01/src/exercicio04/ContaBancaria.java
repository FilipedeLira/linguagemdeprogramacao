package exercicio04;

class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (saldo == 0) {
            System.out.println("Operação inválida! Seu saldo está zerado.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (saldo == 0) {
            System.out.println("Operação inválida! Seu saldo está zerado.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
        } else {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        }
    }
}
