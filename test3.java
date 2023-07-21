public class real{
    String name;
    String year;
    String address;
}
 class are {
    public static void main(String[] args){
        real are;
        real use=new real();
        use.name="robert";
        use.year=" 1994 ";
        use.address="  64C-Walls streat";
        real user=new real();
        user.name="sam";
        user.year="    2000";
        user.address="   68D-Walls streat";
        real users=new real();
        users.name="john";
        users.year="   1999";
        users.address="   28B-Walls streat";
        System.out.println("Name"+ "    year"+" address");
        System.out.println(use.name+use.year+use.address);
        System.out.println( user.name +user.year+user.address);
        System.out.println(users.name+users.year+users.address);
    }
}