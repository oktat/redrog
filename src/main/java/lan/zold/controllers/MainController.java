package lan.zold.controllers;

import java.util.ArrayList;
import java.util.Vector;

import lan.zold.models.FileSource;
import lan.zold.models.Product;
import lan.zold.views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    public MainController() {
        this.mainFrame = new MainFrame();
        ArrayList<Product> productList = new FileSource().readFile();
        for(Product prod : productList) {
            System.out.println(prod.getName());
        }

        for(Product prod:productList) {
            Vector<String> row = new Vector<>();
            row.add(prod.getId().toString());
            row.add(prod.getName());
            row.add(prod.getArticleNumber());
            row.add(prod.getUnitPrice().toString());
            row.add(prod.getPiece().toString());
            this.mainFrame.getModel().addRow(row);
        }


    }
}
