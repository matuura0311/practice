public abstract class TanjibleAsset{
  private String name;
  Private int price;
  private String color;
  
  public TanjibleAsset(String name,int price,String color){
    this.name=name;
    this.price=price;
    this.color=color;
  }
  public String getName(){return this.name}
  public String getPrice(){return this.price}
  public String getColor(){return this.color}
}
