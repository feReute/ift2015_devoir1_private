public class App {
    public static void main(String[] args) {
        // 2.1 checker

        if (Palindrome.checker("radar") != true){
            System.out.println("2.1 'checker' function wrong output with input 'radar'");
            return;
        }
        if (Palindrome.checker("rede") != false){
            System.out.println("2.1 'checker' function wrong output with input 'rede'");
            return;
        }

        // 2.2 checker_recursive
        if (Palindrome.checker_recursive("radar") != true){
            System.out.println("2.2 'checker_recursive' function wrong output with input 'radar'");
            return;
        }
        if (Palindrome.checker_recursive("rede") != false){
            System.out.println("2.2 'checker_recursive' function wrong output with input 'rede'");
            return;
        }

        // 2.3 reverse
        if (!Palindrome.reverse("qwer").equals("rewq")){
            System.out.println("2.3 'reverse' function wrong output with input 'qwer'");
            return;
        }

        // 2.4 transforme_palindrome
        if (!Palindrome.transforme_palindrome("qwere").equals("qwereerewq")){
            System.out.println("2.4 'transforme_palindrome' function wrong output with input 'qwere'");
            return;
        }

        // 2.5 transforme_palindrome_compacte
        if (!Palindrome.transforme_palindrome_compacte("qwere").equals("qwerewq")){
            System.out.println("2.5 'transforme_palindrome_compacte' function wrong output with input 'qwere'");
            return;
        }

        System.out.println("All tests on the Palindrome successfully passed!");

        // Exercice 3.1
        Pile queue = new Pile();
        queue.push(3);
        queue.push(2);
        System.out.println(queue.pop());
        queue.print();
        // affiche: (3)
        System.out.println(queue.top());
        System.out.println(queue.length());

        System.out.println("-------------------------------------------------");

        // Exercice 3.2
        Double_pile queue_double = new Double_pile();
        queue_double.push(true, 3);
        System.out.println(queue_double.pop(true));
        System.out.println(queue_double.length((false)));
        System.out.println(queue_double.push(false, 2));
        queue_double.push(true, 22);
        System.out.println(queue_double.top(false));
        queue_double.print();
        // affiche: 
        // pile one: (3)
        // pile two: (2)

        System.out.println("-------------------------------------------------");

        Pile_bonus<String> pile_float = new Pile_bonus<>();
        pile_float.push("2");
        pile_float.push(String.valueOf(2.0F));
        pile_float.push("abc");
        System.out.println(pile_float.pop());
        pile_float.push(String.valueOf(2.22));
        System.out.println(pile_float.top());
        pile_float.print();
        System.out.println(pile_float.length());
    }
}
