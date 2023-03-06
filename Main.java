/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
class Catalog
{
    int ram;
    int size_of_disk;
    String os;
    
    public List<Laptop> get_laptops(List<Laptop> itemsList)
    {
        List<Laptop> result = new ArrayList<>();
        for (Laptop items : itemsList) 
        {
            if (items.ram >= this.ram && items.size_of_disk>=this.ram && items.os == this.os) 
            {
                result.add(items);
            }  
        }
        return result;
    }
    public Catalog(int ram, int size_of_disk, String os)
    
    {
        this.ram = ram;
        this.size_of_disk = size_of_disk;
        this.os = os;
    }
}


class Laptop
{
    int ram;
    int size_of_disk;
    String os;
    String color;
    
    public Laptop(int ram, int size_of_disk, String os, String color)
    {
        this.ram = ram;
        this.size_of_disk = size_of_disk;
        this.os = os;
        this.color = color;
    }
    
   
    
}

public class Main
{
	public static void main(String[] args) {
	    Laptop one = new Laptop(16, 1024, "Windows 11", "White");
        Laptop two = new Laptop(64, 512,"Windows 11", "Black");
        Laptop three = new Laptop(32, 2048, "Windows 11", "Yellow");
        Laptop four = new Laptop(8, 512, "DOS", "Brown");
        Laptop five = new Laptop(16, 256,"Mac OS", "Purple"); 
        
		List<Laptop> itemsList = new ArrayList<>();
		
		itemsList.add(one);
        itemsList.add(two);
        itemsList.add(three);
        itemsList.add(four);
        itemsList.add(five);
        
        Catalog cat1 = new Catalog(16, 256,"Windows 11");
        itemsList = cat1.get_laptops(itemsList);
        for (Laptop items : itemsList) 
        {
            System.out.println("Ram: "+ items.ram +" Disk size: " + items.size_of_disk +" OS: " + items.os +" Color: " + items.color);
        }
        
	}
}
