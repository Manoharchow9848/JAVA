package OOPS.encapasulation;

public class encapExample {

    public static void main(String[] args){
         Encapasulation en = new Encapasulation();
        en.setId(1);
        en.setAge(22);
        en.setName("manu");

        System.out.print(en.getName()+" "+en.getAge()+" "+en.getId());
    }

}
