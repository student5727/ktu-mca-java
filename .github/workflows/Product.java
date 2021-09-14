package instruction;

public class Product {
    String pname,pcode;
    int price;
    public String getpname(){
        return pname;
    }
    public String getpcode(){
        return pcode;
    }
    public void display(){
        System.out.println("pcode:"+this.pcode);
        System.out.println("pname:"+this.pname);
        System.out.println("price:"+this.price);
    }
    public static void main(String[] args) {{
        Product p1 = new Product();
         p1.pcode = "Phone1";
        p1.pname = " Samsung Galaxy S20";
        p1.price = 37000;
        System.out.println("****displaying p1******");
        p1.display();
        Product p2 =new Product();
       p2.pcode="Phone2";
        p2.pname="OPPO K3";
        p2.price=25000;
        System.out.println("\n*****Displaying p2****");
        p2.display();
        Product p3 =new Product();
         p3.pname="LG Velvet";
        p3.pcode="Phone3";
        p3.price=30000;
        System.out.println("\n*****Displaying p3****");
        p3.display();
        Product p = p3.price < (p1.price < p2.price ? p1.price : p2.price) ? p3 : (p1.price < p2.price ? p1 : p2);
        System.out.println("\n****Product with lowest price****");
        p.display();
    }}
}
