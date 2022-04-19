

public class Mainclass {
    public static void main(String[] args) {

         SEIP_Student seip_student = new SEIP_Student("Nurnabi","01752929714","Dhaka",true,"Course Fee free");
         Paid_Student paid_student= new Paid_Student("Nusrat","01309849629","Farmgate",false,"Paid course fee");

        System.out.println(paid_student);
        System.out.println(seip_student);


    }
}
