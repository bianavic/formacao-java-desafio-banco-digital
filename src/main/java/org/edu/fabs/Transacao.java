package org.edu.fabs;

public interface Transacao {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);

}
