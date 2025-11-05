package com.Teacher.Controller;

import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.sql.*;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class TeacherPDF {

    public static void main(String[] args) {
        try {
            
            // ✅  Set PDF Path
            String outputPath = Paths.get("D:\\Java PDF/teacher.pdf").toString();
            // You can change path as needed
            
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();
            
            // Title
            document.add(new Paragraph("Teacher Database"));
            document.add(new Paragraph(" "));

            // Table design
            PdfPTable table = new PdfPTable(5);
            table.addCell("ID");
            table.addCell("Name");
            table.addCell("City");
            table.addCell("Email");
            table.addCell("Contact");

            // DB Fetch
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/teacher", "root", "root"
            );
            
            PreparedStatement ps = con.prepareStatement(
                "SELECT id,name,city,email,contact FROM teacher"
            );
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                table.addCell(String.valueOf(rs.getInt("id")));
                table.addCell(rs.getString("name"));
                table.addCell(rs.getString("city"));
                table.addCell(rs.getString("email"));
                table.addCell(rs.getString("contact"));
            }

            document.add(table);
            document.close();
            con.close();
            
            System.out.println("✅ PDF created successfully.");
            System.out.println("📄 PDF Location: " + outputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
