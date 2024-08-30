import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BannerGenerator {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("banner.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replace("_______", "yumi"); // 将 "_______" 替换为你的名字
                // 可以在此处添加更多的替换逻辑
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Application started successfully!");
    }
}
