class A{
   // static void bubbleSort(int num[]){
        int n=num.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(num[j]>num[j+1]){
                    int tem=num[j+1];
                    num[j+1]=num[j];
                    num[j]=tem;
                }
            }
        }
    }
        static void printArray(int num[]){
            for(int i=0;i<num.length;i++){
                System.out.print(num[i]);
            }
        }

    
    public static void main(String[] args){
        int num[]={3,4,5,7,1,2};
        bubbleSort(num);
        printArray(num);
        

    }
}