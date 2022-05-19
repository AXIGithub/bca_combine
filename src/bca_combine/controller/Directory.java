/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bca_combine.controller;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
/**
*
* @author SandryR
*/
public class Directory {
    static int indentLevel = -1;
    private String pathDirectory = new String();
    private int monitoringTime = 24;
    private ArrayList<String> fileName             = new ArrayList<String>(10);
    private ArrayList<Long> fileSize             = new ArrayList<Long>(10);

    public void scanPdfFile(String directory) throws IOException{
        //File f = new File("D:\\Permata Billing\\Input\\"); // current directory
        PathDirectory fldr = new PathDirectory();
        boolean ds = false;
        Date dt = new Date();
        int yr = dt.getYear() + 1900;
        int mt = dt.getMonth() + 1;

        File f = new File(fldr.configurePath(directory)); // current directory
        //long fileSize = 0;
        File[] files = f.listFiles();
        int i = 0;
        for (File file : files) {
           if(file.getName().toUpperCase().indexOf(".PDF")>-1){
                fileName.add(file.getName());
                fileSize.add(file.length());
                i++;
                //System.out.println("Jumlah FIle PDF : " + i);
           }
        }
        indentLevel--;
    }

    public void scanIntFile(String directory) throws IOException{
        //File f = new File("D:\\Permata Billing\\Input\\"); // current directory
        PathDirectory fldr = new PathDirectory();
        boolean ds = false;
        Date dt = new Date();
        int yr = dt.getYear() + 1900;
        int mt = dt.getMonth() + 1;

        File f = new File(fldr.configurePath(directory)); // current directory
        //long fileSize = 0;
        File[] files = f.listFiles();
        int i = 0;
        System.out.println(directory);
        for (File file : files) {
           if(file.getName().indexOf(".int")>-1 || file.getName().indexOf(".INT")>-1){
                fileName.add(file.getName());
                fileSize.add(file.length());
                i++;
                //System.out.println("Jumlah FIle PDF : " + i);
           }
        }
        indentLevel--;
    }

    public void scanTextFile(String directory) throws IOException{
        //File f = new File("D:\\Permata Billing\\Input\\"); // current directory
        PathDirectory fldr = new PathDirectory();
        boolean ds = false;
        Date dt = new Date();
        int yr = dt.getYear() + 1900;
        int mt = dt.getMonth() + 1;

        File f = new File(fldr.configurePath(directory)); // current directory
        //long fileSize = 0;
        File[] files = f.listFiles();
        int i = 0;
        for (File file : files) {
           if(file.getName().indexOf(".txt")>-1 || file.getName().indexOf(".TXT")>-1 || file.getName().indexOf(".Txt")>-1){
                fileName.add(file.getName());
                fileSize.add(file.length());
                i++;
                //System.out.println("Jumlah FIle PDF : " + i);
           }
        }
        indentLevel--;
    }


    public void scanMrdFile(String directory) throws IOException{
        //File f = new File("D:\\Permata Billing\\Input\\"); // current directory
        PathDirectory fldr = new PathDirectory();
        boolean ds = false;
        Date dt = new Date();
        int yr = dt.getYear() + 1900;
        int mt = dt.getMonth() + 1;

        File f = new File(fldr.configurePath(directory)); // current directory
        //long fileSize = 0;
        File[] files = f.listFiles();
        int i = 0;
        for (File file : files) {
           if(file.getName().indexOf(".mrd")>-1 || file.getName().indexOf(".MRD")>-1 || file.getName().indexOf(".Mrd")>-1){
                fileName.add(file.getName());
                fileSize.add(file.length());
                i++;
                //System.out.println("Jumlah FIle PDF : " + i);
           }
        }
        indentLevel--;
    }

    public void scanINTFile(String directory) throws IOException{
        //File f = new File("D:\\Permata Billing\\Input\\"); // current directory
        PathDirectory fldr = new PathDirectory();
        boolean ds = false;
        Date dt = new Date();
        int yr = dt.getYear() + 1900;
        int mt = dt.getMonth() + 1;

        File f = new File(fldr.configurePath(directory)); // current directory
        //long fileSize = 0;
        File[] files = f.listFiles();
        int i = 0;
        for (File file : files) {
           if(file.getName().indexOf(".int")>-1 ||
                   file.getName().indexOf(".INT")>-1
                   || file.getName().indexOf(".Int")>-1){
               
                fileName.add(file.getName());
                fileSize.add(file.length());
                i++;
                //System.out.println("Jumlah FIle PDF : " + i);
           }
        }
        indentLevel--;
    }

    public void scanJpgFile(String directory) throws IOException{
        //File f = new File("D:\\Permata Billing\\Input\\"); // current directory
        PathDirectory fldr = new PathDirectory();
        boolean ds = false;
        Date dt = new Date();
        int yr = dt.getYear() + 1900;
        int mt = dt.getMonth() + 1;

        File f = new File(fldr.configurePath(directory)); // current directory
        //long fileSize = 0;
        File[] files = f.listFiles();
        int i = 0;
        for (File file : files) {
           if(file.getName().indexOf(".jpg")>-1 || file.getName().indexOf(".JPG")>-1){
                fileName.add(file.getName());
                fileSize.add(file.length());
                i++;
                //System.out.println("Jumlah FIle PDF : " + i);
           }
        }
        indentLevel--;
    }

    public static long getFolderSize(File dir) {
    long size = 0;
    for (File file : dir.listFiles()) {
        if (file.isFile()) {
            // System.out.println(file.getName() + " " + file.length());
            size = size +  (file.length());
        } else
            size = size + getFolderSize(file);
        //System.out.println("Delete Status 1: " + file.delete());
    }
        return size;
    }

    public static boolean deleteFolder(File dir) throws IOException{
        long size = 0;
        boolean deleteStatus = false;
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                //System.out.println(file.getName() + " " + file.length());
                //size = size +  (file.length());
            } else
                deleteFolder(file);
            deleteStatus = file.delete();
        }
        return (deleteStatus);
    }

    public String currentTime(){
        Calendar cal  = Calendar.getInstance();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
        return(df.format(cal.getTime()));
    }

    public ArrayList<String> getFileName() {
        return fileName;
    }

    public void setFileName(ArrayList<String> fileName) {
        this.fileName = fileName;
    }

    public static int getIndentLevel() {
        return indentLevel;
    }

    public static void setIndentLevel(int indentLevel) {
        Directory.indentLevel = indentLevel;
    }

    public int getMonitoringTime() {
        return monitoringTime;
    }

    public void setMonitoringTime(int monitoringTime) {
        this.monitoringTime = monitoringTime;
    }

    public String getPathDirectory() {
        return pathDirectory;
    }

    public void setPathDirectory(String pathDirectory) {
        this.pathDirectory = pathDirectory;
    }

    public ArrayList<Long> getFileSize() {
        return fileSize;
    }

    public void setFileSize(ArrayList<Long> fileSize) {
        this.fileSize = fileSize;
    }

}