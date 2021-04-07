class JavaLoops{
public static void main(String[]args){
    int i=5;
    while (i>0){    // While loop
        if(i==3){break;}   // break
        System.out.print(i+" ");
        i--;
       }
    System.out.println();
    for(int j=5;j>0;j--){   // For loop
        if(i==3){continue;}  // continue
        else{System.out.print(j+" ")};
    }
    System.out.println();
    int k=5;
    do{                  // Do while
        System.out.println(k+" ");
        k--;
    }while (k>0);
    System.out.println();
    int arr[]={1,2,3,4,5,6,7,8};
    for (int l:arr){   // For each loop
        System.out.print(l);
    }
}}