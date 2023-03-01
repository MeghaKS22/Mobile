package MobileCart;

import java.util.ArrayList;

public class ShoppingCart
{
    public static void main(String[] args){
        MobileCart.Mobile m1=new MobileCart.Mobile("Samsung",6500,"Samsung", MobileCart.MobileType._6G, MobileCart.RingType._Silent, MobileCart.DailType._AutoDail);
        MobileCart.Mobile m2=new MobileCart.Mobile("Oneplus",9500,"Oneplus", MobileCart.MobileType._5G, MobileCart.RingType._RingTone, MobileCart.DailType._Manual);
        MobileCart.Mobile m3=new MobileCart.Mobile("Redmi",7500,"Redmi", MobileCart.MobileType._6G, MobileCart.RingType._Silent, MobileCart.DailType._AutoDail);
        MobileCart.Mobile m4=new MobileCart.Mobile("LG",8500,"LG", MobileCart.MobileType._5G, MobileCart.RingType._RingTone, MobileCart.DailType._Manual);

        ArrayList<MobileCart.Mobile> a1=new ArrayList<>();
        a1.add(m1);
        a1.add(m2);
        a1.add(m3);
        a1.add(m4);
        for (MobileCart.Mobile m:a1){
            System.out.println(m);
        }
        m1.Exchangable();
        m3.Repairable();
        m4.Sellable();
        m2.Talking();
    }
}
