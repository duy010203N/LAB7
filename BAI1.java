public class hangsanxuat {
    String tenhangsanxuat;
    String tenquocgia;
}
 abstract class phuongtiendichuyen{
   private String loaiphuongtien;
    Hangsanxuat hangSanXuat;
    public void batdau(){
        System.out.println("....");
    }
    public void tangtoc(){
        System.out.println("....");
    }
    public void dunglai(){
        System.out.println("...");
    }
    public abstract double layvantoc();
}
class maybay extends phuongtiendichuyen{
    String loainhienlieu;
    public void catcanh(){
        System.out.println("....");
    }
    public void hacanh(){
        System.out.println("....");
}
    @Override
    public double layvatoc(){
        return 3000;
    }
}
 
class xedap extends phuongtiendichuyen{
    @Override
    public double layvantoc(){
        return 100;
    }
}
class xeoto extends phuongtiendichuyen{
    String loainhienlieu;
    @Override
    public double layvantoc(){
        return 100;
    }
}
class main{
    public static void main(String[] args) {
        hangsanxuat hsx1 = new hangsanxuat();
        phuongtiendichuyen ptdc = new maybay();
        ptdc.batdau();
        ptdc.dunglai();
        
    }
}
