public class product {
    String id;
    String name;
    double price;
    double discount;


    public String getname(){
        return name;
    }
    public String getid(){
        return id;
    }
    public double getprice(){
        return price;

    }
    public double getdiscount(){

        return (discount/100);
    }
    public double AfterDiscount(){
        return price-(price * (discount/100));
    }
    public double finalprice(){
        double discountedPrice=AfterDiscount();
        return discountedPrice+(discountedPrice* 0.05);
    }
    product(String nid, String nname, double nprice,double ndiscount){
        id=nid;
        name=nname;
        price=nprice;
        discount=ndiscount;
    }
    void display(){
        System.out.println(name+" original: "+price+", "+"After Discount: "+AfterDiscount()+","+ " final price with vat: "+finalprice());
    }
}

