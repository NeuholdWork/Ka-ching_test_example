public class Main {
    public static void main (String[] args){

 /* fwiw: there is an error in the example in the Google doc,it says :

        The first 18 steps of the game thus sound as follows: "1", "2", "ka", "4", ching!", "6", "7", "8",
        "ka", "ching!", "11", "ka", "13", "14", "ka-ching!", "16", "17", "ka"...

        6 is a multiple of 3.


        ka if divisible by 3 without remainder.
        ching if divisible by 5 without remainder.
        ka-ching! if divisible by 15 without remainder.
        i included the double quotation marks just in case.


        took me a few minutes to realize that I need an escape sequence in order to get the double quotation marks around the results.
  */

        for (int i=1,j=100;i<=j ; i++) {
            if (i%15==0){
                System.out.println("\"Ka-ching!\"");
            }
            else if (i%5==0){
                System.out.println("\"ching!\"");
            }
            else if (i%3==0){
                System.out.println("\"ka\"");
            }

            else {
                System.out.println("\""+i+"\"");
            }

        }

    }
}