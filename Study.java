import java.util.Scanner;
import java.util.Arrays;

//.根据年龄,来打印出当前年龄的人是少年(低于18),青年(19-28), 中年(29-55),老年(56以上)
/*
public class Study {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("输入的年龄");    //弹窗提示输入年龄
    int ages = sc.nextInt();

          if(ages > 56){
              System.out.println("当前年龄的人时老年");
          } else if (29 < ages && ages < 55 ) {
              System.out.println("当前年龄的人时中年");
          } else if (19 <ages && ages < 28) {
              System.out.println("当前年龄的人是青年");
          } else (ages < 18) {
              System.out.println("当前年龄的人时少年");
          }
    }

}
*/


//判定一个数字是否是素数
/*
public class Study{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入的数字：");
        int primeNumber = sc.nextInt();
        for (int i = 2; i <= primeNumber - 1; i++){     //或者把表达式二换成Math.sprt()函数，用该数的开平方根来求；或者用该数的一半来求
            if(0 == primeNumber % i){                   //尽量把0写在左边，避免有的时候少打一个等号，变成了赋值，系统还不会有提示
                System.out.println(primeNumber + "不是素数");
                break;      //记得打break，不然会一直执行到该数-1
            }
            else {
                System.out.println(primeNumber + "是素数");
                break;
            }
        }
    }
}
*/


//3.打印 1-100 之间所有的素数
/*public class Study{
    public static void main(String[] args) {
        System.out.println(1+"是素数");
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i - 1; j++){   //这里也可以用上面一题的多种方法

                if (0 == i % j){    //无法判断1是不是素数，so直接在前面人工判断
                    System.out.println(i + "不是素数");
                    break;  //要打上break，不然该数会被多次输出
                }
                else {
                    System.out.println(i + "是素数");
                    break;
                }
            }
        }


    }
}*/


//4.输出 1000 -2000 之间所有的闰年
/*public class Study {
    public static void main(String[] args) {
        for (int year = 1000; year <= 2000; year++) {
            if (isLeapYear(year)) {     //运用自定义方法来求素数，当返回值为真的时候，执行输出语句
                System.out.println(year + " 是闰年");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else
            return year % 400 == 0;
    }
}*/


//5.输出乘法口诀表9x9
/*public class Study {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");   //\t是为了空四个字符的位置
            }
            System.out.println();   //i与j的每个数相乘后，换行与j+1的相乘，以行为单位
        }
    }
}*/


//6.求两个正整数的最大公约数
/*public class Study {
    public static void main(String[] args) {
        System.out.println("随机输入两个数");
       Scanner sc = new Scanner (System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();

        System.out.println("The GCD of " + num1 +" and " + num2 + " is " + gcd(num1, num2));
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);  //当num2！=0时，通过递归调用，直到num2为0结束递归
    }
}*/
//7.求出0~999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如: 153 = 13 + 5^3 + 33，则153是一个“水仙花数”。)
/*public class Study {
    public static void main(String[] args) {
        for (int i = 0; i <= 900; i++) {
            //也可以用自定义方法来做
            int a = (i % 10);
            int b = (i / 10 % 10);
            int c = (i / 100);
            if (i == (a * a * a + b * b * b + c * c * c)) {
                System.out.println(i + " 是水仙花数");

            }
        }
    }
}*/

//8.写一个函数返回参数二进制中 1 的个数
//4个1比如: 150000 1111
//9.获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列。
//QQ用
//10.完成猜数字游戏
/*
public class Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入正确数字");
        int T = 15;
        System.out.println("请输入你猜的数");
        while(equ)
    }
}
*/



//模拟用户登录
/*public class Study{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入密码");
        String password = sc.nextLine();
        System.out.println("总共有几次机会输入密码");
        int count = sc.nextInt();
        while(count != 0){
            if(password.equals(12345)){
                System.out.println("密码正确");
                break;
            }else{
                count--;
                System.out.println("密码错误" + "你还有"+ count + "次机会");
                break;
            }

        }
    }
}*/


//用递归求5阶乘
/*
public class Study {
    public static void main(String[] args) {
        int str = fac(5);
        System.out.println(str);
    }
    public static int fac(int a){
        if(a == 1){
            return 1;
        } else {
            int b = a * fac(a - 1);
            return b;
        }
    }
}*/


//顺序打印123的每一位
/*
public class Study{
    public static void main(String[] args) {
        int num = 123;
        fac(num);
    }
    public static void fac(int num){
        if(num <=9){
            System.out.println(num);
        } else{
            fac(num / 10);
            System.out.println(num % 10);
        }

    }
}*/



/*
public class Study {
    public static <Dog> void main(String[] args) {
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x < 15) myDog.bark(8);
        while (x > 3) myDog.play();
        int[] numList = {2,4,6,8};
        System.out.print("Hello");
        System.out.print("Dog: " + name);
        String num = "8";
        int z = Integer.parseInt(num);
        try {
            readTheFile("myFile.txt");
        }
        catch(FileNotFoundException ex) {
            System.out.print("File not found.");
        }
    }
}
*/



//计算输入数的每一位相加的和
/*
public class Study {

    public static int sun2(int x){
        if(x <= 9){
            return x;
        }
        return sun2(x / 10) + x%10; //递归的方法去求解：当x > 9时就调用sum2——x / 10是将该数除10 判断是否大于9，大于则继续执行该操作

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要求的数");
        int x = sc.nextInt();
        int sum = sun2(x);
        System.out.println(sum);
        char [] arr = {};

    }
}
*/


//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
/*
public class Study {
    public static void main(String[] args) {
        int[] arrys = {12, 3, 5, 6};
        double avg = 0;
        avg = arry(arrys);
        System.out.println(avg);
    }

    private static double arry(int[] arrys) {
        int sum = 0;
        double avg = 0;

        //可以用foreach方法，如下：
      */
/*  double avg = 0;
        for (double x: arrys) {
            double ret = 0;
            ret += x;
        }
        return avg = (ret / arrys.length)*//*


        for (int i = 0; i < arrys.length; i++){
            sum += arrys[i];
            avg = ((double) sum / arrys.length);
    }
        return avg;
    }

}*/


//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
/*public class Study{
    public static void main(String[] args){
        int[] arrys = {1,23,4,4,5};
        printArray(arrys);
    }

    //利用java自带的打印数组的方法Array
    public static void printArray(int[] arrys){
        System.out.println(Arrays.toString(arrys));

    }
}*/




//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
/*public class Study {
    public static void main(String[] args) {
        int[] arrays = {1,2,3};
        transform(arrays);
    }
    public static void transform(int[] arrays){
        int[] arrays2 = new int[3];
        for (int i = 0; i < arrays.length; i++) {
            arrays2[i] = (arrays[i] * 2);
        }
        System.out.println(Arrays.toString(arrays2));
    }

}*/


//顺序打印数组中的每一位
/*
public class Study {
    public static void main(String[] args) {

        int[] array = {1, 24, 3, 4, 5};
        array2(array);

    }

    public static void array2(int[] array ){
        //没有对数组进行从下到大排序输出
        System.out.println(Arrays.toString(array));
        //对数组进行从下到大排序输出
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //找出排序后的数组中5对应的下标
        int y = Arrays.binarySearch(array,5);
        System.out.println(y);
    }
}
*/



//对数组进行冒泡排序
/*
public class Study {
    public static void main(String[] args) {
        int[] array = {15,2,6,3,8};
        array2(array);
    }

    private static void  array2(int[] array) {

        //变量代表趟数
        for (int i = 0; i < array.length - 1; i++) {
            //判断数组是否已经拍好，拍好后就不用继续了
            boolean flg = false;
            //控制每一趟比上一趟少一次
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}*/

/*
import java.util.Arrays;

//数组的拷贝
public class Study {
    public static void main(String[] args) {
        int[] array = {1,35,7,8};
        int[] ret = copy(array);
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(array));

        //利用java自带的Arrays.copyOf()方法的拷贝数组
        int[] arr = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(arr));

        //拷贝指定范围的数组内容
        int[] b =  Arrays.copyOfRange(array,1,3);
        System.out.println(Arrays.toString(b));
    }

    //一般拷贝，创建一个方法来接受数组的元素
    public static int[] copy(int[] arry) {
        int[] temp = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            //将arry中的元素拷贝到temp中
            temp[i] = arry[i];
        }
        return temp;
    }

}
*/


//对数组的输出
//public class Study {
//    public static void main(String[] args) {
//        int[] array = {1, 35, 7, 8};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }
//}


//二维数组的遍历输出
/*
public class Study {
    public static void main(String[] args) {
        int[][] arrays = {{1,3,4},{2,6,12}};
        //常规遍历for循环
        for (int i = 0; i < arrays.length; i++) {   //arrays.length是求行数，
            for (int j = 0; j < arrays[1].length; j++) {    //arrays[1],length是求列数
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();   //每输出完一行就换行，输出下一行
        }

        //foreach遍历
        for (int[] temp:arrays) {   //将二维数组转化成一维数组
            for (int x:temp) {  //然后对以为数组进行输出
                System.out.print(x + " ");
            }
            System.out.println();
        }

        //Arrays.deepToString(id)打印
        System.out.println(Arrays.deepToString(arrays));    //以字符串的方式打印输出

        //定义不规则的二维数组
        int[][] arrays2 = new int[2][];
        arrays2[0] = new int[3];   //定义第一行为三列
        arrays2[1] = new int[5];    //定义第二行为五列
        //输出行数和列数
        System.out.println(arrays2.length);
        System.out.println(arrays2[1].length);

        //遍历这个不规则的二维数组
        for (int i = 0; i < arrays2.length; i++) {
            for (int j = 0; j < arrays2[i].length; j++) {
                System.out.print(arrays2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}*/


