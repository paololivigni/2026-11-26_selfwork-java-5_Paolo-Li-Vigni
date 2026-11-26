import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        
        //  Creazione lista di tutte le mele
        List<Apple> apples = List.of(
            new Apple(Color.GREEN, 120),
            new Apple(Color.RED, 170),
            new Apple(Color.GREEN, 150),
            new Apple(Color.RED, 110),
            new Apple(Color.GREEN, 89),
            new Apple(Color.RED, 75),
            new Apple(Color.GREEN,180),
            new Apple(Color.RED, 115)
        );


        //  Stampa lista elementi (mele) verdi
        // List<Apple> greenApples = filterGreenApples(apples);
        // for (Apple apple : greenApples) {
        //     System.out.println(apple.getColor());
        // }


        //  Stampa lista elementi (mele) rosse
        // List<Apple> redApples = filterRedApples(apples);
        // for (Apple apple : redApples) {
        //     System.out.println(apple.getColor());
        // }


        //  Stampa lista elementi (mele) verdi (parametro passato Color.GREEN)
        // List<Apple> filteredApplesByColor = filterApples(apples, Color.GREEN);
        // for (Apple apple : filteredApplesByColor) {
        //     System.out.println(apple.getColor());
        // }


        //  Stampa lista elementi (mele) rosse (parametro passato Color.RED)
        // List<Apple> filteredApplesByColor = filterApples(apples, Color.RED);
        // for (Apple apple : filteredApplesByColor) {
        //     System.out.println(apple.getColor());
        // }


        //  Stampa lista elementi (mele) per condizione di peso (parametro passato int weight)
        // List<Apple> filteredApplesByWeight = filterApples(apples, 150);
        // for (Apple apple : filteredApplesByWeight) {
        //     System.out.println(apple.getWeight());
        // }


        // ApplePredicateInterface redAppleLambda = (Apple apple) -> apple.getColor().equals(Color.RED);
        // ApplePredicateInterface greenAppleLambda = (Apple apple) -> apple.getColor().equals(Color.GREEN);
        // ApplePredicateInterface lightAppleLambda = (Apple apple) -> apple.getWeight() < 150;
        // ApplePredicateInterface heavyAppleLambda = (Apple apple) -> apple.getWeight() > 150;


        List<Apple> redApples = filterApples(apples, (Apple apple) -> apple.getColor().equals(Color.RED));
        List<Apple> greenApples = filterApples(apples, (Apple apple) -> apple.getColor().equals(Color.GREEN));
        List<Apple> lightApples = filterApples(apples, (Apple apple) -> apple.getWeight() < 150);
        List<Apple> heavyApples = filterApples(apples, (Apple apple) -> apple.getWeight() > 150);


        System.out.println("Red Apples");
        for (Apple apple : redApples) {
            System.out.println(apple.getColor());
        }

        System.out.println("Green Apples");
        for (Apple apple : greenApples) {
            System.out.println(apple.getColor());
        }

        System.out.println("Light Apples");
        for (Apple apple : lightApples) {
            System.out.println(apple.getWeight());
        }

        System.out.println("Heavy Apples");
        for (Apple apple : heavyApples) {
            System.out.println(apple.getWeight());
        }

    }


    //  Iterazione, controllo, filtro elementi (mele) verdi
    // public static List<Apple> filterGreenApples(List<Apple> apples){
    //     List<Apple> filteredGreenApples = new ArrayList<>();
    //     for (Apple apple : apples) {
    //         if(apple.getColor().equals(Color.GREEN)){
    //             filteredGreenApples.add(apple);
    //         }            
    //     }
    //     return filteredGreenApples;
    // }


    //  Iterazione, controllo, filtro elementi (mele) ross*
    // public static List<Apple> filterRedApples(List<Apple> apples){
    //     List<Apple> filteredRedApples = new ArrayList<>();
    //     for (Apple apple : apples) {
    //         if(apple.getColor().equals(Color.RED)){
    //             filteredRedApples.add(apple);
    //         }            
    //     }
    //     return filteredRedApples;
    // }


    //  Iterazione, controllo, filtro elementi (mele) con parametro color arbitrario
    // public static List<Apple> filterApples(List<Apple> apples, Color color){
    //     List<Apple> filteredApplesByColor = new ArrayList<>();
    //     for (Apple apple : apples) {
    //         if(color.equals(apple.getColor())){
    //             filteredApplesByColor.add(apple);
    //         }            
    //     }
    //     return filteredApplesByColor;
    // }


    //  Iterazione, controllo, filtro elementi (mele) con parametro peso (weight)
    // public static List<Apple> filterApples(List<Apple> apples, int weight){
    //     List<Apple> filteredApplesByWeight = new ArrayList<>();
    //     for (Apple apple : apples) {
    //         if(apple.getWeight() > weight){
    //             filteredApplesByWeight.add(apple);
    //         }            
    //     }
    //     return filteredApplesByWeight;
    // }


    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate){
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : apples) {
            if(predicate.test(apple)){
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

}