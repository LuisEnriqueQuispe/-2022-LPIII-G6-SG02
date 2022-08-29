package perfilmedico;

import java.util.*;

public class PerfilMedico {

    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    public PerfilMedico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "PerfilMedico{" + "Nombre=" + nombre + ", Apellido=" + apellido + ", Sexo=" + sexo 
                + ", Fecha de nacimiento=" + dia + "/" + mes + "/" + anio + ", Altura=" + altura + ", Peso=" + peso + '}';
    }
     
    public void estableceredad() {
        int edad;
        edad = 2022 - this.anio;
        System.out.println("La edad es " + edad);
    }

    public void frecuenciacardiaca() {
        double fcm;
        fcm = 208 - (0.7 * (2022 - anio));
        System.out.println("La frecuencia cardiaca maxima " + fcm);
    }

    public void calcularIMC() {
        double IMC;
        IMC = this.peso / this.altura;
        System.out.println("El indice de masa corporal es " + IMC);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String miNomb = s1.nextLine();
        System.out.println("Ingrese apellido");
        String miApelli = s1.nextLine();
        System.out.println("Ingrese sexo");
        String miSexo = s1.nextLine();
        System.out.println("Ingrese dia(nacimiento)");
        Integer miDia = s1.nextInt();
        System.out.println("Ingrese mes(nacimiento)");
        Integer miMes = s1.nextInt();
        System.out.println("Ingrese año(nacimiento)");
        Integer miAnio = s1.nextInt();
        System.out.println("Ingrese altura");
        Double miAltura = s1.nextDouble();
        System.out.println("Ingrese peso");
        Double miPeso = s1.nextDouble();

        PerfilMedico Usuario = new PerfilMedico();

        Usuario.setNombre(miNomb);
        Usuario.setApellido(miApelli);
        Usuario.setSexo(miSexo);
        Usuario.setDia(miDia);
        Usuario.setMes(miMes);
        Usuario.setAnio(miAnio);
        Usuario.setAltura(miAltura);
        Usuario.setPeso(miPeso);
        
        System.out.println(Usuario.toString());
        Usuario.estableceredad();
        Usuario.frecuenciacardiaca();
        Usuario.calcularIMC();
    }
}



