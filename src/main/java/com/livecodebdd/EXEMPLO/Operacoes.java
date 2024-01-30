package com.livecodebdd.EXEMPLO;

public class Operacoes {

    public static int executarOperacao(int valor, String operacao) {
        if ("dobro".equals(operacao)) {
            return valor * 2;
        } else if ("triplo".equals(operacao)) {
            return valor * 3;
        } else if ("quadruplo".equals(operacao)) {
            return valor * 4;
        } else if ("quintuplo".equals(operacao)) {
            return valor * 5;
        } else if ("sextuplo".equals(operacao)) {
            return valor * 6;
        } else if ("setuplo".equals(operacao)) {
            return valor * 7;
        } else if ("octuplo".equals(operacao)) {
            return valor * 8;
        } else if ("nonuplo".equals(operacao)) {
            return valor * 9;
        } else if ("decuplo".equals(operacao)) {
            return valor * 10;
        } else if ("undecuplo".equals(operacao)) {
            return valor * 11;
        } else {
            throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }

    public static void main(String[] args) {
        int resultado = executarOperacao(5, "dobro");
        System.out.println("Resultado: " + resultado);
    }


//    interface Operacao {
//        int executar(int valor);
//    }
//
//    class Dobro implements Operacao {
//        @Override
//        public int executar(int valor) {
//            return valor * 2;
//        }
//    }
//
//    public class OperacoesRefatoradas {
//        public static int executarOperacao(int valor, Operacao operacao) {
//            return operacao.executar(valor);
//        }
//
//        public static void main(String[] args) {
//            Operacao operacao = new Dobro();
//            int resultado = executarOperacao(5, operacao);
//            System.out.println("Resultado: " + resultado);
//        }
//    }
}
