package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProductFileManager {

    List<Product> products = new ArrayList<>();


    public void readProductsFromFile(Path path){
        try {
            products.addAll(createProducts(Files.readAllLines(path)));
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!",e);
        }
    }


    public void writePriceOverToFile(Path path,int price){
        try {
            Files.write(path,createStringListOverPrice(price));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file!");
        }
    }

    private List<String> createStringListOverPrice(int price){
        List<String> result = new ArrayList<>();
        for(Product p : products){
            if(p.getPrice()>price){
                result.add(p.toString());
            }
        }
        return result;
    }


    private List<Product> createProducts(List<String> lines){
        List<Product> result = new ArrayList<>();

        for(String line : lines){
            String[] tmp = line.split(";");
            result.add(new Product(tmp[0],tmp[1],Integer.parseInt(tmp[2])));
        }
        return result;
    }

    public List<Product> getProducts() {
        return products;
    }
}
