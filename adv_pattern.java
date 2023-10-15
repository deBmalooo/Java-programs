public class adv_pattern {
    public static void hollowsquare(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern_1(int row){
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_2(int row){
        for(int i=0;i<=(row-1);i++){
            for(int j=1;j<=(row-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floydtriangle(int row){
        int k=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void one_zero(int row){
         for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
         }
    }
    public static void butterfly(int row){
        int i,j;
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=row;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int row){
        int i,j;
        for(i=1;i<=row;i++){
            for(j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int row){
        int i,j;
        for(i=1;i<=row;i++){
            for(j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int row){
        int i,j;
        for(i=1;i<=row;i++){
            for(j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=row;i>=1;i--){
            for(j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arsgs[]){
        hollowsquare(4,5);
        pattern_2(4);
        floydtriangle(5);
        one_zero(5);
        butterfly(4);
        solid_rhombus(5);
        hollow_rhombus(5);
        diamond(4);
    }
}
