public class GroceryList {
    private String[] arr;

    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        this.arr= new String[10];
    }

    // Adds an item to the grocery list
    public void add(String item) {
        for (int i = 0;i<10;i++){
            if (this.arr[i]==null){
                this.arr[i]=item;
                break;
            }
        }
    }

    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        boolean removed = false;
        for (int i =0 ; i<10;i++){
            if (this.arr[i]!=null && this.arr[i].equals(item)){
                this.arr[i]=null;
                removed = true;
            }
            else if (removed){
                this.arr[i-1] = this.arr[i];
                this.arr[i]=null;
            }
        }
    }

    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {
        String x = "Grocery List: ";
        for (int i = 0 ; i<10 ; i++){
            if (arr[i]!=null){
                if (i!=0){
                    x+=", ";
                }
                x+=this.arr[i];
            }

        }
        return x;
    }
}
