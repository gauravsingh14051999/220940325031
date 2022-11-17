class GrandParent
{
    String GrandFatherName;
    String GrandMotherName;
    GrandParent()
    {

    }
    GrandParent(String grandfathername, String grandmothername)
    {
        this.GrandFatherName=grandfathername;
        this.GrandMotherName=grandmothername;
        System.out.println("GrandFatherName "+GrandFatherName);
        System.out.println("GrandMotherName "+GrandMotherName);
    }
}
class Parent extends GrandParent
{
    String FatherName;
    String MotherName;
    Parent()
    {

    }
    Parent(String FatherName,String MotherName,String grandfathername, String grandmothername)
    {
       this(grandfathername,grandmothername);
        this.FatherName=FatherName;
        this.MotherName=MotherName;
        System.out.println("FatherName "+FatherName);
        System.out.println("MotherName "+MotherName);
    }
    Parent(String grandfathername, String grandmothername)
    {
        super(grandfathername,grandmothername);
    }
}

class child extends  Parent
{
    child(){

    }
    child(String FatherName,String MotherName,String grandfathername, String grandmothername)
    {
        super(FatherName,MotherName,grandfathername,grandmothername);
    }

    public static void main(String[] args) {
        child c1=new child("Raju","riya","Shurendar","Namrata");
    }
}

