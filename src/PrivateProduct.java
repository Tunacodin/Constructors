public class PrivateProduct {

    private  String description;
    private int id;
    private  int stockAmount;

  public int getId(){
    return id;
  }

  public void setId(int id){
    this.id=id;
  }

  public int getStockAmount (){
    return stockAmount;
  }
  public void setStockAmount(int stockAmount) {
    this.stockAmount = stockAmount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


}
