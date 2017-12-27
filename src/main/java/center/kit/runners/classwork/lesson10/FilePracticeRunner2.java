package center.kit.runners.classwork.lesson10;

/*
Реализовать программу, которая при запуске запрашивает у пользователя
имя файла и затем запрашивает у пользователя текст, считывая его построчно
с консоли и сохраняя в файл. При вводе комбинации символов *exit* программа
сохраняет все введенные строки в файл и завершает свою работу.
*/

import center.kit.app.homework.lesson10.FilePractice;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilePracticeRunner2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp = "";
        String nameOfFile = FilePractice.getNameOfFile();
        nameOfFile = "C:\\Users\\adm1n\\Desktop\\QaAutoCourse\\" + nameOfFile + ".txt";
        System.out.println("Name Of File - " + nameOfFile);
        ArrayList<String> arrayList = new ArrayList<>();

        //boolean isReady = false;
        try {
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            System.out.println("temp = br.readLine();");
            temp = br.readLine();
            System.out.println("rrayList.add(temp);");
            arrayList.add(temp);

            //while ((temp = br.readLine()) != null && !temp.equals("exit")) {
                //System.out.println("TEMP = " + temp);
            //}
            System.out.println("======" + arrayList.get(0));
        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }


        System.out.println("To save");
        for(int i = 0; i<arrayList.size(); ++i)

    {
        arrayList.get(i);
    }

    //save


}
}
