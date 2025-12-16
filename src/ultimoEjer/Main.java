package ultimoEjer;

public class Main {

    public static void main(String[] args) {
        // Tasa de interés mensual de ejemplo
        double TASA = 0.005; 
        
        System.out.println("=========================================");
        System.out.println("  PRUEBAS CONCISAS DE CÁLCULO DE INTERÉS ");
        System.out.println("=========================================");

        // --- 1. CUENTA DEPÓSITO ---
        // Regla: No hay interés si Saldo < 1000.
        Cuenta depositoA = new CuentaDeposito("Cliente A", "particular", 1500.0, TASA);
        Cuenta depositoB = new CuentaDeposito("Cliente B", "empresa", 900.0, TASA);
        
        System.out.println("\n--- 1. Depósito (10 meses) ---");
        System.out.printf("Saldo 1500€ (Interés esperado): %.2f€%n", depositoA.calcularInteres(10));
        System.out.printf("Saldo 900€ (Interés = 0): %.2f€%n", depositoB.calcularInteres(10));
        
        depositoA.retirar(100);
        System.out.printf("Nuevo Saldo Cliente A: %.2f€%n", depositoA.getSaldo());


        // --- 2. CUENTA CRÉDITO ---
        // Regla: Meses exentos (Particular: 3, Empresa: 2). Probamos con 5 meses.
        Cuenta creditoP = new CuentaCredito("Cliente C", "particular", 2000.0, TASA);
        Cuenta creditoE = new CuentaCredito("Cliente D", "empresa", 2000.0, TASA);
        
        System.out.println("\n--- 2. Crédito (5 meses) ---");
        System.out.printf("Particular (3 exentos, 2 pagados): %.2f€%n", creditoP.calcularInteres(5));
        System.out.printf("Empresa (2 exentos, 3 pagados): %.2f€%n", creditoE.calcularInteres(5));

        System.out.print("Intento de Retiro (Debe fallar): ");
        creditoP.retirar(100);


        // --- 3. CUENTA HIPOTECA ---
        // Regla: Tasa reducida al 50% (Particular: 6 meses, Empresa: 12 meses).
        // Probamos con 10 meses para Particular (6 reducidos + 4 normales).
        Cuenta hipotecaP = new CuentaHipoteca("Cliente E", "particular", 50000.0, TASA);
        
        System.out.println("\n--- 3. Hipoteca (10 meses) ---");
        System.out.printf("Particular (10 meses): %.2f€%n", hipotecaP.calcularInteres(10)); // 6 meses a TASA/2 + 4 meses a TASA

        System.out.print("Intento de Retiro (Debe fallar): ");
        hipotecaP.retirar(100);
        
        System.out.println("=========================================");
    }
}