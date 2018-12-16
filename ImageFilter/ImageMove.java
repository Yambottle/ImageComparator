/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagefilter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class ImageMove {
//     public static void main(String args[]) {
//         ImageMove im =new ImageMove();
//         im.moveImage(new File("D:\\Documents\\SimilarPicture\\IMAG0040.jpg"),"D:\\Documents\\GarbagePicture");
//     }
    
    public void moveImage(File ffrom ,String ftarget){
        try {
            FileInputStream in = new FileInputStream(ffrom); 
            FileOutputStream out = new FileOutputStream(ftarget+"\\"+ffrom.getName());
            byte[] buffer = new byte[(int)ffrom.length()];
            in.read(buffer);
            out.write(buffer);
            in.close();
            out.close();
        }catch(IOException e){
                e.printStackTrace();
        }
    }
    
}
