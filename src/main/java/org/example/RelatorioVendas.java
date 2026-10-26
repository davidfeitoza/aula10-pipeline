package org.example;

public class RelatorioVendas {

    public double calcularTotal(double[] valores) {
        double total = 0;

        for (double v : valores) {
            total += v;
        }

        return total;
    }

    public double calcularMedia(double[] valores) {
        if (valores.length == 0) {
            return 0;
        }

        return calcularTotal(valores) / valores.length;
    }

    public double maiorVenda(double[] valores) {
        double maior = 0;

        for (double v : valores) {
            if (v > maior) {
                maior = v;
            }
        }

        return maior;
    }
}