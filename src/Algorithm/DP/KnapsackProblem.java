package Algorithm.DP;


/*
 * 动态规划-01背包问题
 * 背包重量为4
 * 物品1,重量:1,价值:1500
 * 物品2,重量:4,价值:3000
 * 物品3,重量:3,价值:2000
 * 背包内每个物品最多只能放入一个,问如何放入使得背包总价值最高
 * */
public class KnapsackProblem {
    public static void main(String[] args) {
        int[] weight = {1, 4, 3};//物品的重量
        int[] value = {1500, 3000, 2000};//物品的价值
        int m = 4;//背包的容量
        int n = value.length;//物品的个数

//        创建二维数组，
//        maxValue[i][j] 表示后前i个物品中能够装入容量为j的背包中的最大价值
        int[][] maxValue = new int[n + 1][m + 1];
//        为了记录放入商品的情况，我们定一个二维数组
        int[][] path = new int[n + 1][m + 1];

//        初始化第一行和第一列，这里在本程序中，可以不去处理，因为默认为0
        for (int i = 0; i < maxValue.length; i++) {
            maxValue[i][0] = 0;/*将第一列设置为0*/
        }
        for (int i = 0; i < maxValue.length; i++) {
            maxValue[0][i] = 0;/*将第一行设置为0*/
        }

//        根据前面得到的公式，实现动态规划
        for (int i = 1; i < maxValue.length; i++) {//不处理第一行，i从1开始
            for (int j = 1; j < maxValue[0].length; j++) {//不处理第一列，j从1开始
//                    公式
                if (weight[i - 1] > j) {//因为我们程序i 从 1 开始的，因此原来公式中的 weight[i] 修改成 weight[i-1]，value[i] 修改成 value[i-1]
                    maxValue[i][j] = maxValue[i - 1][j];
                } else {
                    //因为我们程序i 从 1 开始的，因此原来公式中的 weight[i] 修改成 weight[i-1]，value[i] 修改成 value[i-1]
//                    maxValue[i][j]=Math.max(maxValue[i-1][j],maxValue[i-1][j-weight[i-1]]+value[i-1]);
//                    为了记录商品存放到背包的情况，我们不能简单的使用上面的公式，需要使用if-else来体现这个公式
                    if (maxValue[i - 1][j] < maxValue[i - 1][j - weight[i - 1]] + value[i - 1]) {
                        maxValue[i][j] = value[i - 1] + maxValue[i - 1][j - weight[i - 1]];
//                        把当前情况记录到path
                        path[i][j] = 1;
                    } else {
                        maxValue[i][j] = maxValue[i - 1][j];
                    }

                }
            }
        }


//        输出以下maxValue 看目前情况
        for (int i = 0; i < maxValue.length; i++) {
            for (int j = 0; j < maxValue[i].length; j++) {
                System.out.print(maxValue[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=================");
//        输出最后我们是放入的哪些商品
//      遍历path,这样输出会把所有的放入情况都得到，其实我们只需要最后的放入情况
//        for (int i = 0; i < path.length; i++) {
//            for (int j = 0; j < path[i].length; j++) {
//                if (path[i][j] == 1) {
//                    System.out.printf("第%d个商品放入到背包\n", i);
//                }
//            }
//
//        }

//        动脑筋
        int i = path.length - 1;//行的最大下标
        int j = path[0].length - 1;//列的最大下标
        while (i > 0 && j > 0) {//从path的最后开始找
            if (path[i][j] == 1) {
                System.out.printf("第%d个商品放入到背包\n", i);
                j -= weight[i - 1];//j-weight[i-1]是动态减比如3磅找到一个2000磅
            }
            i--;
        }


    }
}
