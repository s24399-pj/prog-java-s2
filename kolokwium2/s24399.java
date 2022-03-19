package main;

public class Suma{
    public static void main(String[] args){
        String[] tablica = {"1","6","1"};
        System.out.println(sum(tablica));
    }
    public static String sum(String[] array){
        int globalsum=0;
        for(int i = 0; i < array.length; i++)
        {
            int j=Integer.parseInt(array[i]);
            globalsum+=j;
        }
        return String.valueOf(globalsum);
    }
}

