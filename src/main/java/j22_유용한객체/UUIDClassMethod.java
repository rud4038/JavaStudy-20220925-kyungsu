package j22_유용한객체;

import java.io.*;
import java.util.UUID;

public class UUIDClassMethod {

    public static void main(String[] args) throws IOException {
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        uuidString = uuidString.replaceAll("-","");
        System.out.println(uuidString);

        String filePath = "C:/fileupload/test";
        String fileName = UUID.randomUUID().toString().replaceAll("-","") + ".txt";

//        File file = new File(filePath);
//        if(!file.exists()){
//            file.mkdirs();
//        }
//
//        file = new File(filePath, fileName);
//        if(!file.exists()){
//            file.createNewFile();
//        }
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
//        writer.write("안녕하세요.");
//        writer.newLine();
//        writer.write("이름 : 신경수");
//        writer.newLine();
//        writer.write("나이: 25");
//        writer.newLine();
//        writer.write("연락처: 010111111111");
//        writer.newLine();
//        writer.write("주소: 부산 동래구 사직동.");
//        writer.newLine();
//
//        writer.flush();
//        writer.close();

        File readFile = new File(filePath, "37e62a7ac8814278bc1d21f0c98e3a28.txt");
        if(readFile.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(readFile));

            System.out.println(fileName + "내용");
            String line = null;
            while((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            reader.close();
        }

    }

}
