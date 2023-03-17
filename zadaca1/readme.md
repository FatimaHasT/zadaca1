public class Main {
public static void main(String[] args) {

** Probajte da dodjelite jednu varijablu jednog tipa u drugu varijablu drugog tipa i zakljucite koje kombinacije se ne mogu dodjeljivati jedne u druge npr :
String someText = "Some random text"
int someNumber = someText;
Pogledajte koju gresku javlja i zasto vam javlja gresku.
Zatim zakomentarisite obje linije koda.

        /* int someNumber = 9;
        String someText = "Some random text"
        int someNumber = someText; string ne moze u int
        String someText = 9; broj ne moze u string
        int someNum = 9.0; double ne moze u int
        char firstLetter = "F"; string ne moze u char

        System.out.println(someText);
        System.out.println(someNumber);
        System.out.println(someNum); */

** Deklarisati varijable za: Ime i prezime, prvo slovo imena, godina rodjenja, broj 100 000 000 000, broj 42.001
imena moraju biti smislena i na engleskom.

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

** Isprintate vase ime koristeci samo brojeve  koji se pretvore u char-ove.

        char first = 70;
        char second = 97;
        char third = 116;
        char fourth = 105;
        char fifth = 109;
        char sixth = 97;

        System.out.print (first);
        System.out.print (second);
        System.out.print (third);
        System.out.print (fourth);
        System.out.print (fifth);
        System.out.println (sixth);

** napravite vaijablu koju kad ispisete ispise tekst:
Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: true
ili
Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: false

        String someText = "Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42:";
        Boolean someBoolean = true;

        System.out.print(someText);
        System.out.println(someBoolean);



** Zelim da mi napisete program koji ce poceti sa tekstom:
This is a number xxx and it is about to double;
I zatim 8 puta da se udupla njegova vrijednost i svaki put da se isti tekst ispise
sa uduplanim brojem. PRvi put kad se ispise broj mora biti izvorno upisani broj.
xxx je neki broj koji mogu ja sam da dodam a da se ne narusi logika.
 + BONUS: (ko zeli)
Da se za svako duplanje ispise poruka nakon glavnog teksta
The original number has been doubled: XXXX times. (Za 4 duplanja)
The original number has been doubled: X times. (Za 1 duplanje)
The original number has been doubled: XXXXXXXX times. (Za 8 duplanja)

        int x = 8;
        int y=x;
        System.out.println("This is a number " + x + " and it is about to double");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");
        x = x*2;
        System.out.println("This is a number " + x + " and it is about to double");
        System.out.println("The original number has been doubled: " + (x/y) + " times.");

    }
}