package br.unesp.rc;

/**
 * Exemplo extraído do tutorial "Escrevendo Testes JUnit no NetBeans IDE"
 * URL: https://netbeans.apache.org//kb/docs/java/junit-intro_pt_BR.html
 * @author Prof. Frank J. Affonso
 */
public class Vector {

    private Vector() {
    }

    /**
     * Verifica se os vetores são iguais
     */
    public static boolean equal(int[] a, int[] b) {
        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("null argument");
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica se os tamanhos dos vetores são iguais.
     */
    public static boolean size(int a, int b) {
        if ((a < 0) || (b < 0)) {
            throw new IllegalArgumentException("Valores negativos não são permitidos!");
        }
        return a == b;
    }
}