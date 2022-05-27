/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bca_combine.controller;

import com.itextpdf.io.source.RandomAccessFileOrArray;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ratino
 */
public class PdfProcessing {
    public int getTotalPage(String dirInput, String inputFile){
        int totalPage = 0;
        try {
            
            
            // ITEXT 7
            PdfReader dataReader = new PdfReader(dirInput + "\\" + inputFile);
//            PdfDocument pdfDocNumber = PdfDocument(dataReader);
            
             PdfDocument pdfDoc = new PdfDocument(new PdfReader(dirInput + "\\" + inputFile));
             totalPage = pdfDoc.getNumberOfPages();
//             Document doc = new Document(pdfDoc);
             
            
        } catch (IOException ex) {
            Logger.getLogger(PdfProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPage;
    }
}
