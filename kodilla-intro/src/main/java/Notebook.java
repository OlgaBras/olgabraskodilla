public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price,int year) {
        this.weight = weight;
        this.price = price;
        this.year= year;
    }
    public void checkNotebook(){
        if (this.price<1000&&this.year>2019){
            System.out.println("This notebook is cheap and new.");
        }
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }else if(this.price<1000){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        }else if(this.weight<1200){
            System.out.println("This notebook is heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
}
