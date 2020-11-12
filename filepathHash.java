package Homework;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class filepathHash {
    public static List<File> recurseDirs(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }
    
    public static List<File> recurseDirs(String start) {
        return recurseDirs(new File(start), ".*");
    }

    public static List<File> recurseDirs(File startDir) {
        return recurseDirs(startDir, ".*");
    }

    public static List<File> recurseDirs(File startDir, String regex) {
        List<File> result = new ArrayList<File>();
        if (startDir.listFiles() == null) {
            System.out.println("这不是一个有效的目录");
            return result;
        }

        for(File item : startDir.listFiles()) {
            if(item.isDirectory()) {
                result.add(item);
                result.addAll(recurseDirs(item));
            } else {
                if(item.getName().matches(regex))
                    result.add(item);
            }
        }
        return result;
    }

    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead =0;
        do {
            numRead = is.read(buffer);
            if(numRead>0) {
                complete.update(buffer,0,numRead);
            }
        }while(numRead != -1);
        is.close();
        return complete.digest();
    }
    public static void main(String[] args) throws Exception {
        List<File> files = recurseDirs("D:\\Kugou");
        
        try {
            for (File i : files) {
                System.out.println(i);
                File filepath = i;
                File file = new File(String.valueOf(filepath));
                FileInputStream is = new FileInputStream(file);
                byte[] sha1 = SHA1Checksum(is);
                String result = "";
                for (int j = 0; j < sha1.length; j++) {
                    result += Integer.toString(sha1[j] & 0xFF, 16);

                }
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

