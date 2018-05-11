package fileStorage;


import java.io.*;
import java.util.ArrayList;

public class Main2 {

    private static final String FILENAME = "d:\\_aJavaBestTeam\\StudentDB.txt";

    public static void main(String[] args) {

        //Todo create file write to file
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("alina","kurt","kurtov"));
        students.add(new Student("alolo","rut","rutov"));
        students.add(new Student("ahyhya","kat","katov"));
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

           int index=1;

            for (Student student:students) {
                bw.write(index+student.getName() + " " + student.getSecName() + " " + student.getThirdName() + ",");
                bw.newLine();
                index++;
            }
            // no need to close it.
            //bw.close();

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();
        }
            //Todo read from file
            try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
