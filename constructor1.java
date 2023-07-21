import java.util.*;
class defaultconstructor
{
    float depth;
    float height;
    float breadth;
    defaultconstructor()
    {
        Scanner obj=new Scanner(System.in);
        depth=obj.nextFloat();
        height=obj.nextFloat();
        breadth=obj.nextFloat();
        float vol=depth*height*breadth;
        System.out.println(vol);
    }
    public static void main(String args[])
    {
    defaultconstructor jb=new defaultconstructor();
    }
}