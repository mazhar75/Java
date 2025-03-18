class Star_pattern{
    public static void main(String[] args){
        int n=19;
        int a=10,b=10;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){
               if(j>=a && j<=b){
                 System.out.print("*");
               }
               else{
                  System.out.print(" ");
               }
            }
            System.out.println("");
            a--;
            b++;
        }
        
    }
}