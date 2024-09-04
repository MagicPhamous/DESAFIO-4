package defecto;

public class StefanBoltzmann {

    // Constante de Stefan-Boltzmann (W/m^2 K^4)
    static final double sigma = 5.67e-8;

    public static void main(String[] args) {
        // Valores de entrada
        double A = 0.15;    // Área en m^2
        double e = 0.90;    // Emisividad
        double T = 650;     // Temperatura en K

        // Errores en las variables
        double deltaA = 0.01;   // Error en el área
        double deltaE = 0.01;   // Error en la emisividad
        double deltaT = 20;     // Error en la temperatura

        // Imprimir los datos iniciales
        System.out.println("Valores iniciales:");
        System.out.println("A (Área) = " + A + " m^2 ± " + deltaA);
        System.out.println("e (Emisividad) = " + e + " ± " + deltaE);
        System.out.println("T (Temperatura) = " + T + " K ± " + deltaT);
        System.out.println("Constante de Stefan-Boltzmann (σ) = " + sigma + " W/m^2 K^4");
        System.out.println();

        // Cálculo del valor de H
        double H = A * e * sigma * Math.pow(T, 4);
        System.out.println("Cálculo del valor de H:");
        System.out.println("H = A * e * σ * T^4");
        System.out.println("H = " + A + " * " + e + " * " + sigma + " * " + T + "^4");
        System.out.println("H = " + H + " W");
        System.out.println();

        // Cálculo de ecT^4
        double ecT4 = e * sigma * Math.pow(T, 4);
        System.out.println("Cálculo de ecT^4:");
        System.out.println("ecT^4 = e * σ * T^4");
        System.out.println("ecT^4 = " + e + " * " + sigma + " * " + T + "^4");
        System.out.println("ecT^4 = " + ecT4);
        System.out.println();

        // Cálculo de 4eAcT^3
        double factor4eAcT3 = 4 * e * A * sigma * Math.pow(T, 3);
        System.out.println("Cálculo de 4eAcT^3:");
        System.out.println("4eAcT^3 = 4 * e * A * σ * T^3");
        System.out.println("4eAcT^3 = 4 * " + e + " * " + A + " * " + sigma + " * " + T + "^3");
        System.out.println("4eAcT^3 = " + factor4eAcT3);
        System.out.println();

        // Cálculo del error en H utilizando propagación de errores
        double deltaH = H * Math.sqrt(Math.pow(deltaA / A, 2) + Math.pow(deltaE / e, 2) + 4 * Math.pow(deltaT / T, 2));
        System.out.println("Error en H (Propagación de errores):");
        System.out.println("deltaH = H * sqrt((deltaA/A)^2 + (deltaE/e)^2 + 4 * (deltaT/T)^2)");
        System.out.println("deltaH = " + H + " * sqrt((" + deltaA + "/" + A + ")^2 + (" + deltaE + "/" + e + ")^2 + 4 * (" + deltaT + "/" + T + ")^2)");
        System.out.println("deltaH = " + deltaH + " W");
        System.out.println();

        // Cálculo de los límites superior e inferior para H
        double H_min = H - deltaH;
        double H_max = H + deltaH;

        // Imprimir los resultados finales
        System.out.println("Resultados finales:");
        System.out.println("H - deltaH = " + H_min + " W");
        System.out.println("H + deltaH = " + H_max + " W");
        System.out.println();

        // Imprimir resumen de todos los resultados
        System.out.println("Resumen de los resultados:");
        System.out.println("H = " + H + " W");
        System.out.println("Error en H = " + deltaH + " W");
        System.out.println("H mínimo = " + H_min + " W");
        System.out.println("H máximo = " + H_max + " W");
    }
}
