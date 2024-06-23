public class arrayupdate {
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
            System.out.print(z+" ");
        }
    }
}