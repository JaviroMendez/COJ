public class facil {
    public static void main(String[] args) {
        int a[]={137, 1315, 73, 136, 255, 1384, 16385};
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i]+"=");
            solucion(a[i]);
            System.out.println("");
        }
    }

    private static void solucion(int n) {
        if(n==0) System.out.print("0");
    boolean band = true;
    for(int i=15;i>=0;i--){
        if(n<1<<i) continue;
        n-=(1<<i);
        if(!band) System.out.print("+");
        band = false;
        if(i==1) System.out.print("2");
        else{
            System.out.print("2(");
            solucion(i);
            System.out.print(")");
     
     }   
    }
  }
}
