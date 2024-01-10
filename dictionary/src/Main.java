import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        System.out.println("enter the number of the selection : ");
        System.out.println("1: insert word\n 2: insert array of words\n 3: print Map\n 4: print set of character\n 5: search for word containing this substring\n 6: remove word containing this substring\n 7: exit\n =>" );
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean flag = true;
        while (flag) {
            switch (num) {
                case 1:
                    String word = in.next();
                    d.insert(word);
                    num = in.nextInt();
                    break;
                case 2:
                    List<String> allWords = new ArrayList<>();
                    System.out.println("how many words do you want to insert ?");
                    int n = in.nextInt();
                    for (int i = 0; i <= n; i++) {
                        String str = in.next();
                        allWords.add(str);
                    }
                    d.insertAll(allWords);
                    num = in.nextInt();
                    break;
                case 3:
                    d.printMap();
                    num = in.nextInt();
                    break;
                case 4:
                    //Character c =  in.
                    // d.printSet(c);
                    System.out.println("hii");
                    num = in.nextInt();
                    break;
                case 5:
                    String substring = in.next();
                    System.out.println(d.search(substring));
                    num = in.nextInt();
                    break;
                case 6:
                    String substr = in.next();
                    d.remove(substr);
                    num = in.nextInt();
                    break;
                case 7:
                    flag = false;
                    break;

            }
        }
    }
}
