public class test {
    // static int[] generator(int a[][]){
    //     int x[]=new int[10];
    //     int j=0;
    //     for(int i=0;i<a.length;i++){
    //         x[j]=a[i][3];
    //     }
        

    //     return x;
    // }

    public static void main(String[] args) {
        int [][] Input = {{3, 5, 9}, {1, 3, 2}, {0, 2, 10}};
        int a[]=new int[10];
        int x=0;
        for(int i=0;i<Input.length;i++){
            for(int k=0;k<a.length;k++){
                if(k>=Input[i][0] && k<=Input[i][1]){
                    a[k]=a[k]+Input[i][2];
                }                         
            }
        }
        for(int z:a){
            System.out.print(z+",");
        }


        // int resp[]=generator(Input);
        // for(int t:resp){
        //     System.out.println(t);
        // }
    }
}