package testagregacion;

public class TestAgregacion {

    public static void main(String[] args) {
       Automovil Mcqueen = new Automovil("SRT-401",2,"Chevrolet","Corvette");
       Automovil Mate = new Automovil("ABC-21D",4,"Cars","Ferrari");
       Motor mcqueen = new Motor(8,750);
       
       Mcqueen.setMotor(mcqueen);
       System.out.println(Mcqueen);
       System.out.println(Mate);
    }
    
}
