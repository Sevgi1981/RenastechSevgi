package Day_4_Operators;

public class LogicalOperations {
    public static void main(String[] args) {

    // AND ==> "&&", if an operation contains AND (&&) in order for the result to be true all of them should result to true


        boolean balls = (12>7) && (3<8) && (9==7); // if it has one false all of them will be false
        System.out.println(balls);

        boolean flowers = (true) && (3<=8)&& (8!=9);
        System.out.println(flowers);

        // OR Operation " || " the that OR works, if any of the compression is true it return true
        // of it has one true it will return true

        boolean flo= (9>11) || (6<9);  // false || true ==> true
        System.out.println(flo); // true

        boolean shoes = ("Sevgi" == "sevgi") || ( 'C' == 'c'); // false || false ==> false
        System.out.println(shoes);

        // NOT "!"

        boolean cars= !("red"== "blue"); // !(false) ==> true
        System.out.println(cars);

        boolean Q = !( ((4==5)||(7<9)) && ((8<=10) || (true)));
                // !((false) ||   (true)) &&     ((true)  ||    (true))
                        // !( true && true)
                         // ! true
                          // false

        System.out.println(Q);  // false















    }
}
