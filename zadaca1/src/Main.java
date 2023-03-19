public class Main {
    public static void main(String[] args) {
        System.out.println("Zadatak1");
        /*
         Probajte da dodjelite jednu varijablu jednog tipa u drugu varijablu drugog tipa i zakljucite koje kombinacije se ne mogu dodjeljivati jedne u druge npr :
        String someText = "Some random text"
        int someNumber = someText;
        Pogledajte koju gresku javlja i zasto vam javlja gresku.
        Zatim zakomentarisite obje linije koda.
        */

        /* int someNumber = 9;
        String someText = "Some random text"
        int someNumber = someText; string ne moze u int
        String someText = 9; broj ne moze u string
        int someNum = 9.0; double ne moze u int
        char firstLetter = "F"; string ne moze u char

        System.out.println(someText);
        System.out.println(someNumber);
        System.out.println(someNum); */
        System.out.println("Ne vidi se jer je zakomentarisan");
        System.out.println();

        System.out.println("Zadatak2");
        // Deklarisati varijable za: Ime i prezime, prvo slovo imena, godina rodjenja, broj 100 000 000 000, broj 42.001
        //imena moraju biti smislena i na engleskom.

        String firstName = "Fatima";
        String lastName = "Hasanovic";
        char firstLetter ='F';
        int birthDate = 1994;
        long largeNum = 100_000_000_000L;
        double someNum = 42.001;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstLetter);
        System.out.println(birthDate);
        System.out.println(largeNum);
        System.out.println (someNum);
        System.out.println();

        System.out.println("Zadatak3");
        // Isprintate vase ime koristeci samo brojeve  koji se pretvore u char-ove.

        char letterF = 70;
        char letterA = 97;
        char letterT = 116;
        char latterI = 105;
        char letterM = 109;

        System.out.print (letterF);
        System.out.print (letterA);
        System.out.print (letterT);
        System.out.print (latterI);
        System.out.print (letterM);
        System.out.println (letterA);
        System.out.println();

        System.out.println("Zadatak4");
        /*
         napravite vaijablu koju kad ispisete ispise tekst:
        Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: true
        ili
        Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: false
        */

        String someText = "Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42:";
        Boolean someBoolean = true;

        System.out.print(someText);
        System.out.println(someBoolean);
        System.out.println();

        System.out.println("Zadatak5 + Bonus");
        /*
         Zelim da mi napisete program koji ce poceti sa tekstom:
        This is a number xxx and it is about to double;
        I zatim 8 puta da se udupla njegova vrijednost i svaki put da se isti tekst ispise
        sa uduplanim brojem. PRvi put kad se ispise broj mora biti izvorno upisani broj.
        xxx je neki broj koji mogu ja sam da dodam a da se ne narusi logika.
         + BONUS: (ko zeli)
        Da se za svako duplanje ispise poruka nakon glavnog teksta
        The original number has been doubled: XXXX times. (Za 4 duplanja)
        The original number has been doubled: X times. (Za 1 duplanje)
        The original number has been doubled: XXXXXXXX times. (Za 8 duplanja)
        */

        int x = 2;
        int y=x;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        System.out.println();
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");

    }
}