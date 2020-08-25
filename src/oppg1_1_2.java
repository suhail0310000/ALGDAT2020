public class oppg1_1_2 {
    public static void main(String[]args){
        int[] a = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        min(a);
        int min_index = min(a);
        System.out.println(min_index);
        System.out.print(a[min_index]);
    }

    static int min(int[] a){

        //initialiserer med første element
        int min_value = a[0];
        int min_index = 0;

        //loop over alle resterende elementer og sjekk om vi finner et mindre tall
        for(int i = 1; i<a.length; i++){

            //Sjekk om verdien er mindre enn det vi har sett tidligere
            if(a[i]<min_value){
                min_value = a[i];
                min_index = i;
            }
        }

        //Returner index til minst verdi
        return min_index;

    }
}
