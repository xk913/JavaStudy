package hard.xk.com.second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tools {

    public static void output(Serializable obj, String name) {
        try {
            FileOutputStream out = new FileOutputStream(name);
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(obj);
            outputStream.flush();
            outputStream.close();
            System.out.println("操作成功!");
        } catch (FileNotFoundException e) {
//			e.printStackTrace();
        } catch (IOException e) {
//			e.printStackTrace();
        }
    }

    public static Object input(String name) {

        try {
            FileInputStream in = new FileInputStream(name);
            ObjectInputStream stream = new ObjectInputStream(in);
            Object object = stream.readObject();
            return object;
        } catch (FileNotFoundException e) {
//			e.printStackTrace();
        } catch (IOException e) {
//			e.printStackTrace();
        } catch (ClassNotFoundException e) {
//			e.printStackTrace();
        }

        return null;

    }

}
