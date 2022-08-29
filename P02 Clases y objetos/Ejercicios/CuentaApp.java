public class CuentaApp {
    public static void main(String[] args) {   
        CuentaBanco cuenta_1 = new CuentaBanco("CuentaBancoPiero");
        CuentaBanco cuenta_2 = new CuentaBanco("Piero", 400);         
        cuenta_1.ingresar(400);
        cuenta_2.ingresar(100);
        cuenta_1.retirar(600);
        cuenta_2.retirar(200);
        System.out.println(cuenta_1);
        System.out.println(cuenta_2); 
    } 
}
