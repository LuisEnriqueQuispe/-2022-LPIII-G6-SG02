package appcontenedora;

public class AppContenedora {

    public static void main(String[] args) throws Exception {

        String[] x = {"Luz", "Lucia", "Manuel"};
        Integer[] y = {154, 178, 123};
        String[] z = {"Arequipa", "Arequipa", "Manolo", "Lima", "Ayacucho", "Jose"};
        Persona p1 = new Persona("Lucia", "Peru", "987972412");
        Goodies g1 = new Goodies(154, "Nuevo", 500);
        Estudiante e1 = new Estudiante("Doctor", " Arequipa", "Mollendo", "Manolo", "Peru", "987972412");
        Verificadora<String> ver1 = new Verificadora<>(x);
        Verificadora<Integer> ver2 = new Verificadora<>(y);
        Verificadora<String> ver3 = new Verificadora<>(z);
        if (ver1.contiene(p1.getNombre())) {
            System.out.println(p1.toString());
        } else {
            System.out.println("\nNo hay ese nombre");
        }

        if (ver2.contiene(g1.getId())) {
            System.out.println(g1.toString());
        } else {
            System.out.println("\nNo hay ese id");
        }
        if (ver3.contiene(e1.getNombre()) && ver3.contiene(e1.getProvincia()) && ver3.contiene(e1.getDepartamento())) {
            System.out.println(e1.toString());  
              
        } else {
            System.out.println("\nNo existe");
        }  
    }        
}
