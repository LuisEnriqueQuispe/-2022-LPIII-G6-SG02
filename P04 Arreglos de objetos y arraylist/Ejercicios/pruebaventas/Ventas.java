package pruebaventas;
import java.util.Random;

public class Ventas {

    int[][][] notasMesVend = new int[31][][];
    int[][] ventasTotales = new int[6][5];

    public void GenerarDatos() //	
    {
        Random nAleatorio = new Random();

        for (int dia = 1; dia < notasMesVend.length; dia++) {
            int nro_notas = nAleatorio.nextInt(6);
            if (nro_notas != 0) {

                int[] prod = new int[nro_notas + 1];
                notasMesVend[dia] = new int[nro_notas + 1][2];

                for (int c = 1; c <= nro_notas; c++) {
                    int p = 1 + nAleatorio.nextInt(5);
                    if (Repetido(prod, p)) {
                        c--;
                    } else {
                        prod[c] = p;
                        notasMesVend[dia][c][0] = p;
                        notasMesVend[dia][c][1] = 10 + nAleatorio.nextInt(300);

                    }
                }
            } else {
                notasMesVend[dia] = new int[8][1];
            }
        }
    }

    public boolean Repetido(int[] a, int n) {
        boolean rep = false;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == n) {
                rep = true;
            }
        }

        return rep;
    }

    public String TipoProducto(int t) {
        String tipo = "";

        switch (t) {
            case 1:
                tipo = "Arroz";
                break;
            case 2:
                tipo = "Huevos";
                break;
            case 3:
                tipo = "Cafe";
                break;
            case 4:
                tipo = "Leche";
                break;
            default:
                tipo = "Harina";
                break;
        }

        return tipo;
    }

    public void Procesar() {

        for (int ve = 1; ve <= 4; ve++) {
            GenerarDatos();
            for (int dia = 1; dia < notasMesVend.length; dia++) {
                if (notasMesVend[dia].length != 8) {

                    for (int nota = 1; nota < notasMesVend[dia].length; nota++) {
                        int tip_pro = notasMesVend[dia][nota][0];
                        int pre = notasMesVend[dia][nota][1];
                        ventasTotales[tip_pro][ve] += pre;
                    }
                }
            }
        }
        MostrarResultados();
    }

    public void MostrarResultados() {
        int tot_ve;
        int[] tot_pr = new int[5];

        System.out.printf("\nRegistro de Ventas de cada vendedor al mes: \n");

        System.out.printf("\n%25s%14s%14s%14s%16s\n", "Manuel:", "Diego:", "Nami:", "Angela:", "TOTAL:");

        for (int p = 1; p < ventasTotales.length; p++) {
            tot_ve = 0;
            System.out.printf("\n%15s:", TipoProducto(p));

            System.out.printf("%9d", ventasTotales[p][1]);
            tot_ve += ventasTotales[p][1];
            tot_pr[1] += ventasTotales[p][1];

            for (int v = 2; v < ventasTotales[p].length; v++) {
                System.out.printf("%14d", ventasTotales[p][v]);
                tot_ve += ventasTotales[p][v];
                tot_pr[v] += ventasTotales[p][v];
            }

            System.out.printf("%14d %s\n", tot_ve, "   ");
        }

        System.out.printf("\n%16s", "TOTAL:");
        System.out.printf("%9d %s", tot_pr[1], "   ");

        for (int i = 2; i < tot_pr.length; i++) {
            System.out.printf("%10d %s", tot_pr[i], "   ");
        }
    }
}


