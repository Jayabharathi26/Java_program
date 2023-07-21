import java.util.*;
class box
{
    float depth;
    float height;
    float breadth;
    box()
    {
        Scanner obj=new Scanner(System.in);
        depth=obj.nextFloat();
        height=obj.nextFloat();
        breadth=obj.nextFloat();
        float vol=depth*height*breadth;
        System.out.println(vol);
    }
}
class constructor
{
    public static void main(String args[])
    {
        box mybox=new box();
    }
}