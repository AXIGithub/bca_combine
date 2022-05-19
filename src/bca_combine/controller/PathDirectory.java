/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bca_combine.controller;

/**
 *
 * @author MishbahulM
 */
public class PathDirectory {
    public String configurePath(String path){
         int index = 0;
         int content = 0;
         int history = 0;
         boolean status = false;
         String temp = new String();
         String temp1 = new String();
         do{
            index   = path.indexOf("\\");
            if(index < 0){
                status = true;
            }
            else{
                temp = temp +  path.substring(0,index+1) + "\\";
                path = path.substring(index+1);
            }
         }while(status == false);

         temp = temp + path.substring(0);
         return temp;
     }

}
