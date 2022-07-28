
 import java.io.FileOutputStream; 
 import java.io.FileInputStream; 
 import java.util.Scanner;
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;

 public class File_Handling_Project {

 public static void ReadFile()
 {
 try{ 
 FileInputStream fin=new FileInputStream("E:\\coding\\phase 1\\src\\test.txt"); 
 int i=0; 
 while((i=fin.read())!=-1){ 
 System.out.print((char)i); 
 } 
 fin.close();
 System.out.println(" ");
 System.out.println("____________");
 System.out.println("READING :-> SUCCESSFUL");
 System.out.println("____________");
 }catch(Exception e){
 System.out.println(e);
 System.out.println("____________");
 System.out.println("READING :-> FAILED");
 System.out.println("____________");
 }
 }

 public static void WriteFile(String Str)
 {
 try{ 
 FileOutputStream fout=new FileOutputStream("E:\\coding\\phase 1\\src\\test.txt");
 byte b[] = Str.getBytes();
 fout.write(b); 
 fout.close();
 System.out.println("*************************************");
 System.out.println("WRITING :-> SUCCESSFUL");
 System.out.println("*************************************");
 }
 catch(Exception e)
 {
 System.out.println(e);
 System.out.println("*************************************");
 System.out.println("WRITING :-> FAILED");
 System.out.println("*************************************");
 } 
 }
 
 public static void ModifyFile(String olddata,String newdata) {


 File fileToBeModified= new File("E:\\coding\\phase 1\\src\\test.txt");
 String fileData="";


 BufferedReader reader= null;
 FileWriter writer=null;

 try {
 reader= new BufferedReader(new FileReader(fileToBeModified));
 String line= reader.readLine();

 while(line!=null) {
 fileData= fileData+line+System.lineSeparator();
 line=reader.readLine();
 }


 String newFiledata= fileData.replaceAll(olddata, newdata);

 writer = new FileWriter(fileToBeModified);
 writer.write(newFiledata);
 System.out.println("*************************************");
 System.out.println("MODIFICATION :-> SUCCESSFUL");
 System.out.println("*************************************");
 }
 catch (Exception e) {
 System.out.println("Error: "+e);
 System.out.println("*************************************");
 System.out.println("MODIFICATION :-> FAILED");
 System.out.println("*************************************");
 }
 finally {

 try {
 reader.close();
 writer.close();

 } catch (IOException e2) {
 }

 }

 }

 public static void main(String[] args) {
 try {
 Scanner sc = new Scanner(System.in);
 int num = 1;
 System.out.println("YOU are going into loop press greater than 4 to exit");
 while(num < 4)
 {
 System.out.println("__________________");
 System.out.println("__________________");
 System.out.println("press");
 System.out.println("1 :->  Write File");
 System.out.println("2 :->  Read File");
 System.out.println("3 :->  Modify File");
 System.out.println("__________________");
 System.out.println("__________________");
 num = sc.nextInt();
 sc.nextLine();


 switch (num)
{
 case 1 -> {
 System.out.println("***** Enter what you want to write in file *****");
 String str = sc.nextLine();
 WriteFile(str);
 }
 case 2 -> ReadFile();
 case 3 ->{
 System.out.println("***** Enter old Data *****");
 String oldStr = sc.nextLine();
 System.out.println("***** Enter new Data *****");
 String newStr = sc.nextLine();
 ModifyFile(oldStr , newStr);
 }
 }
 }
 } catch (Exception e) {
 System.out.println("Error: "+e);
 }
 }
 }

