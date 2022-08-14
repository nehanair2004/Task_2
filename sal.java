public class sal{
    public static void main (String [] args){

        double salary,da,hra,cca,pf,pt,basic;
        double gross,net;
        String empnam = "Advay Kadam";
        int empno = 6969;
        basic = 59300;
        da = 0.7 * basic;
        hra = 0.3 * basic;
        pf  = 0.1 * basic;
        cca = 240;
        pt = 100;

        gross = basic + da + hra + pf + cca + pt;
        net = basic + da + hra;
        
        System.out.println("Employee Name is : "+empnam);
        System.out.println("Employee Number is : "+empno);
        System.out.println("Gross Salary is : "+gross);
        System.out.println("Net Salary is : "+net);
        }
}

