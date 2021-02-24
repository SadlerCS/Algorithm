package homework0203;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Example22 {
    public static void main(String[] args) throws Exception {
//        1,通过 Properties 进行属性文件读取操作
        Properties pps = new Properties();
//        加载要读取的文件 test.properties
        pps.load(new FileInputStream("test.properties"));
//        遍历test.properties 键值对元素信息
        pps.forEach((k, v) -> System.out.println(k + ":" + v));

//        2.通过 Properties 键值对元素信息
//        指定要写入操作的文件名和位置
        FileOutputStream out = new FileOutputStream("test.properties");
//        向 Properties 类文件进行写入键值对信息
        pps.setProperty("charset", "UTF-8");
//        将此Properties 集合中新增键值对信息写入配置文件
        pps.store(out, "新增charset 编码");
    }
}
