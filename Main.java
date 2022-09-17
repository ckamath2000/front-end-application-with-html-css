public class Hello() 
{
    private int id;
    private String name;
    Hello(int id,String name
    {
        this.id=id;
        Main(name);
    }
    Hello(String name)
    {
        this.name=name;
    }
    Hello()
    {

    }
    public int getData()
    {
        return id;
    }
    public void setData(int id)
    {
        this.id=id;
    }
       public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
public class Main()
{public static void main(String args[])
{
    Hello h=new Hello();
    h.setData(1);
    int r=h.getData();
    h.setName("Chinmaya");
    String s=h.getName();
    System.out.println("The id is"+r+"and name is"+s);
}
}