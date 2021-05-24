public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000,2020);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkNotebook();

        Notebook heavyNotebook = new Notebook(2000, 1500,1999);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        notebook.checkWeight();
        notebook.checkNotebook();

        Notebook oldNotebook = new Notebook(1600, 500, 2018);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        notebook.checkWeight();
        notebook.checkNotebook();
    }
}