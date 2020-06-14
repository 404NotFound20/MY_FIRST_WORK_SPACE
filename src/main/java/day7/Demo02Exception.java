package day7;
//角标异常产生
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr={1,3,5};
        int e=getdata(arr,1);
        System.out.println(e);

        int[] att=null;
        int f=getdatathrow(att,0);
        System.out.println(f);

    }
    public static int getdata(int [] arr,int index){
        int data=arr[index];
        return data;
    }

    public static int getdatathrow(int [] arr,int index){
/*
* 合法性校验
* */
        if (arr==null){
            throw new NullPointerException("数组为空");
        }

        if (index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
        int data=arr[index];
        return data;
    }
}
