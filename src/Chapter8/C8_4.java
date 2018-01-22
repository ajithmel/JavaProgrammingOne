package Chapter8;
import java.util.Scanner;
import java.util.Arrays;
public class C8_4 {
      /**
 * Program displays a spreadsheet of employees hours throughout the week
 * @author Ajith Melakayil
 */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String abn[] = {"\t\tSu","M","T","W","Th","F","Sa","Total"};
        String array1[][] = {{"Employee 0","2","4","3","4","5","8","8","34"},
                          {"Employee 1","7","3","4","3","3","4","4","28"},
                          {"Employee 2","3","3","4","3","3","2","2","20"},
                          {"Employee 3","9","3","4","7","3","4","1","31"},
                          {"Employee 4","3","5","4","3","6","3","8","32"},
                          {"Employee 5","3","4","4","6","3","4","4","28"},
                          {"Employee 6","3","7","4","8","3","8","4","37"},
                          {"Employee 7","6","3","5","9","2","7","9","41"}};
        
        arrayprint1(abn);
        arrayprint(array1);
        
        
    }
     /**
     * Method prints the array
     *
     * @param array1 takes the first array
     */
    public static void arrayprint(String array1[][]){
        
        for (int i = 0; i < array1.length; i++){
            for (int p = 0; p < array1[i].length; p++){
                System.out.print(array1[i][p] + "\t");
                
            }
            System.out.print("\n");
        }
    }
     /**
     * Method prints the array again
     *
     * @param array1 takes the first array
     */
            public static void arrayprint1(String array1[]){
        
        for (int i = 0; i < array1.length; i++){
                System.out.print(array1[i] + "\t");
                
            }
            System.out.print("\n");
        }
        
        
    
}
