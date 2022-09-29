package pruebainterfazporpagar;

public class PruebaInterfazPorPagar {
    public static void main(String[] args) 
    {
        PorPagar[] objetosPorPagar = new PorPagar[ 6 ];
        
        objetosPorPagar[ 0 ] = new Factura( "01234", "asiento", 2, 375.00);
        objetosPorPagar[ 1 ] = new Factura( "56789", "llanta", 4, 79.95);
        objetosPorPagar[ 2 ] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[ 3 ] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[ 4 ] = new Prestamo( 4, 1500.00);
        objetosPorPagar[ 5 ] = new Prestamo( 6, 3000.00);
       System.out.println("Facturas y Empleados y Prestamos procesados en forma polimorfica:\n");
       
       for (PorPagar porPagarActual : objetosPorPagar)
       {
           System.out.printf( "%s \n%s: $%,.2f\n\n" , porPagarActual.toString(), "pago vencido", porPagarActual.getMontoPago());
        }    
    }
}
